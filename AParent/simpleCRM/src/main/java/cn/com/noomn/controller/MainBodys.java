package cn.com.noomn.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.com.noomn.service.AuthorityService;
import cn.com.noomn.service.CustomVoService;
import cn.com.noomn.service.DepartmentService;
import cn.com.noomn.service.EmployeeVoService;
import cn.com.noomn.service.ProductVoService;
import cn.com.noomn.service.UserroleAuthorityVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.AuthorityVo;
import cn.com.noomn.vo.CustomVo;
import cn.com.noomn.vo.DepartmentVo;
import cn.com.noomn.vo.EmployeeVo;
import cn.com.noomn.vo.ProductVo;
import cn.com.noomn.vo.UserroleAuthorityVo;
import cn.com.noomn.vo.UserroleVo;

@Controller
@RequestMapping(value="/mainBodys/")
public class MainBodys {
	
	@Value("${project.url}")
	private String projectURL;
	
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private AuthorityService authorityService;
	@Autowired
	private UserroleAuthorityVoService userroleAuthorityVoService;
	@Autowired
	private EmployeeVoService employeeVoService;
	@Autowired
	private ProductVoService productVoService;
	@Autowired
	private CustomVoService customVoService;
	
	@RequestMapping(value="loadMainBody")
	private String loadMainBody(String jspURL) {
		return jspURL;
	}
	
/*** 部门管理 begin ***/
	
	/**
	 * 填充部门信息zTree
	 * @return
	 */
	@RequestMapping(value="getTreeJson")
	@ResponseBody
	private String getTreeJson() {
		return departmentService.selectDepartmentJson();
	}
	
	/**
	 * 填充部门数据表
	 * @return
	 */
	@RequestMapping(value="getDepartmentVoDataArray", produces={"text/html;charset=UTF-8;","application/text;"})
	@ResponseBody
	private String getDepartmentVoDataArray() {
		List<DepartmentVo> departmentList = departmentService.selectDepartmentAndEmployee(null);
		
		StringBuilder dataArrayString = new StringBuilder();
		dataArrayString.append("{").append("\"data\": [");
		for(int i=0; i<departmentList.size(); i++) {
			DepartmentVo departmentVo = departmentList.get(i);
			
			dataArrayString.append("[");
			
			//初始化不允许删除
			if(departmentVo.getDepartmentInit() == 1) {
				dataArrayString.append("\"\",");
			}else {
				dataArrayString.append("\"<input type='checkbox' class='checkboxes' data-id=' "+ departmentVo.getDepartmentId() + "' />\",");
			}
			dataArrayString.append("\""+ departmentVo.getDepartmentName() +"\",");
			
			//根据员工数量显示不同的 颜色
			if(departmentVo.getEmployeeVoList().size() == 0) {
				dataArrayString.append("\"<span class='label label-danger'>"+ departmentVo.getEmployeeVoList().size()+"</span>\",");
			}else if(departmentVo.getEmployeeVoList().size() >0 && departmentVo.getEmployeeVoList().size() < 5){
				dataArrayString.append("\"<span class='label label-success'>"+ departmentVo.getEmployeeVoList().size()+"</span>\",");
			}else {
				dataArrayString.append("\"<span class='label label-inverse'>"+ departmentVo.getEmployeeVoList().size()+"</span>\",");
			}
			
			
			dataArrayString
//				.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='addEmployee(this);'><i class='icon-plus'></i> 添加</a>\",")
				.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='editDepartment(this,\\\""+ projectURL +"\\\");'><i class='icon-edit'></i> 编辑</a>\",");
			
			//初始化不允许删除
			if(departmentVo.getDepartmentInit() == 1) {
				dataArrayString.append("\"\"");
			}else {
				dataArrayString.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='deleteConfirmWarm(this,\\\""+ projectURL +"/mainBodys/deleteDepartmentVo\\\");'><i class='icon-minus'></i> 删除</a>\"");
			}
			
			dataArrayString.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		
		return substring;
	}
	
	/**
	 * 删除部门（单个）
	 * @param departmentVo
	 * @return
	 */
	@RequestMapping(value="deleteDepartmentVo")
	@ResponseBody
	private Infos deleteDepartmentVo(DepartmentVo departmentVo) {
		Infos infos = departmentService.deleteDepartmentById(departmentVo);
		return infos;
	}
	
	/**
	 * 获取部门信息列表
	 * @param departmentVo
	 * @return
	 */
	@RequestMapping(value="getDepartmentVoList")
	@ResponseBody
	private List<DepartmentVo> getDepartmentVoList(DepartmentVo departmentVo) {
		List<DepartmentVo> departmentList = departmentService.selectDepartmentList(departmentVo);
		return departmentList;
	}
	
	/**
	 * 更新部门信息
	 * @param departmentVo
	 * @return
	 */
	@RequestMapping(value="updateDepartmentVo")
	@ResponseBody
	private Infos updateDepartmentVo(DepartmentVo departmentVo) {
		return departmentService.updateDepartment(departmentVo);
	}
	
	/**
	 * 添加部门
	 * @param departmentVo
	 * @return
	 */
	@RequestMapping(value="insertDepartmentVo")
	@ResponseBody
	private Infos insertDepartmentVo(DepartmentVo departmentVo) {
		departmentVo.setDepartmentId(UUID.randomUUID().toString());
		departmentVo.setDepartmentInit(0);
		return departmentService.insertDepartment(departmentVo);
	}
	
	/**
	 * 删除部门
	 * @param departmentVoList
	 * @return
	 */
	@RequestMapping(value="deleteDepartmentVoList")
	@ResponseBody
	private Infos deleteDepartmentVoList(@RequestBody List<DepartmentVo> departmentVoList) {
		return departmentService.deleteDepartmentList(departmentVoList);
	}
	
/*** 部门管理 /end ***/
	
/*** 角色管理 begin ***/
	
	/**
	 * 通过角色显示所有可以更改的权限
	 */
	@RequestMapping(value="getAllAuthorityManager")
	@ResponseBody
	private List<AuthorityVo> getAllAuthorityManager(UserroleAuthorityVo userroleAuthorityVo) {
		List<AuthorityVo> allAuthorityManager = authorityService.getAllAuthorityManager(userroleAuthorityVo);
		return allAuthorityManager;
	}
	
	/**
	 * 更新角色权限
	 * @param userroleAuthorityVoList
	 * @return
	 */
	@RequestMapping(value="updateUserroleAuthority")
	@ResponseBody
	private Infos updateUserroleAuthority(@RequestBody List<UserroleAuthorityVo> userroleAuthorityVoList) {
		UserroleVo userroleVo = new UserroleVo();
		userroleVo.setUserroleId(userroleAuthorityVoList.get(0).getUserroleId());
		Infos infos = userroleAuthorityVoService.updateUserroleAuthorityVo(userroleAuthorityVoList, userroleVo);
		return infos;
	}
	
/*** 角色管理 /end ***/
	
/*** 成员管理 begin ***/
	
	/**
	 * 显示成员信息
	 * @return
	 */
	@RequestMapping(value="getEmployeeVoList", produces={"text/html;charset=UTF-8;","application/text;"})
	@ResponseBody
	private String getEmployeeVoList() {
		List<EmployeeVo> allEmployeeVo = employeeVoService.getAllEmployeeVo();
		
		StringBuilder dataArrayString = new StringBuilder();
		dataArrayString.append("{").append("\"data\": [");
		for(int i=0; i<allEmployeeVo.size(); i++) {
			EmployeeVo employeeVo = allEmployeeVo.get(i);
			
			dataArrayString
			.append("[")
			.append("\""+ employeeVo.getEmployeeRealName()+"\",")
			.append("\""+ employeeVo.getEmployeeNumber()+"\",")
			.append("\""+ employeeVo.getDepartmentVo().getDepartmentName()+"\",")
			.append("\""+ employeeVo.getUserroleVo().getUserroleName()+"\",")
			.append("\""+ employeeVo.getEmployeePhone()+"\",")
//			.append("\"<button class='btn btn-success'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='detailedEmployee(this);' ><i class='icon-tags'></i></button><button class='btn btn-primary'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='editEmployee(this);'><i class='icon-pencil'></i></button>\"")
			.append("\"<button class='btn btn-success'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='detailedEmployee(this);' ><i class='icon-tags'></i></button>");
			if(employeeVo.getEmployeeInit() != 1) {
				dataArrayString
				.append("<button class='btn btn-primary'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='editEmployee(this);'><i class='icon-pencil'></i></button>\"");
			}else {
				dataArrayString.append("\"");
			}
			dataArrayString.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		
		return substring;
	}
	
	@RequestMapping(value="addEmployeeVo")
	@ResponseBody
	private Infos addEmployeeVo(EmployeeVo employeeVo) {
		Infos infos = employeeVoService.insertEmployeeVo(employeeVo);
		return infos;
	}
	
	@RequestMapping(value="detailEmployeeVo")
	@ResponseBody
	private EmployeeVo detailEmployeeVo(EmployeeVo employeeVo) {
		employeeVo = employeeVoService.getOneEmployeeVo(employeeVo);
		return employeeVo;
	}
	
	@RequestMapping(value="updateEmployeeVo")
	@ResponseBody
	private Infos updateEmployeeVo(EmployeeVo employeeVo) {
		if(employeeVo.getEmployeeImg() != null) {
			String webInf = this.getClass().getClassLoader().getResource("/").getPath().replace("classes/", "");
			String imgPath = webInf + "mainBody/img/png/" + employeeVo.getEmployeeId() + ".png";
			employeeVo.setEmployeeImgPath(imgPath);
		}
		Infos infos = employeeVoService.updateEmployeeVo(employeeVo);
		return infos;
	}
	
	@RequestMapping(value="getOneEmployeeVo")
	@ResponseBody
	private Infos getOneEmployeeVo(EmployeeVo employeeVo) {
		EmployeeVo employeeVo2 = employeeVoService.getOneEmployeeVo(employeeVo);
		Infos infos = Infos.getInfosInstance();
		if(employeeVo2 != null) {
			infos.message = Message.SUCCESS;
			infos.obj = "存在该员工";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "不存在该员工";
		}
		return infos;
	}
	
/*** 成员管理 /end ***/
	
/*** 产品管理 begin ***/
	
	/**
	 * 添加产品
	 * @param productPdf
	 * @param productVo
	 * @return
	 */
	@RequestMapping(value="addProduct")
	@ResponseBody
	private Infos addProduct(
			@RequestParam(value = "file", required = false) MultipartFile productPdf, 
			ProductVo productVo) {
		productVo.setProductId(UUID.randomUUID().toString());
		if(productPdf.getSize() > 0) {
			String webInf = this.getClass().getClassLoader().getResource("/").getPath().replace("classes/", "");
			String imgPath = webInf + "mainBody/pdf/";
			File pdfFile = new File(imgPath, productVo.getProductId() + ".pdf");
			if(!pdfFile.exists()) {
				pdfFile.mkdirs();
			}
			try {
				productPdf.transferTo(pdfFile);
				System.err.println("文件上传成功: " + pdfFile.getPath());
				productVo.setProductPdf(pdfFile.getPath());
			} catch (Exception e) {
				e.printStackTrace();
				Infos infos = Infos.getInfosInstance();
				infos.message = Message.ERROR;
				infos.obj = "文件上传失败";
				return infos;
			}
		}
		Infos infos = productVoService.addProduct(productVo);
		return infos;
	}
	
	/**
	 * 获取所有产品信息
	 * @return
	 */
	@RequestMapping(value="getAllProduct")
	@ResponseBody
	private String getAllProduct() {
		List<ProductVo> productVoList = productVoService.selectProductVoList(null);
		if(productVoList.size() == 0) return "{\"data\": []}";
		StringBuilder dataArrayString = new StringBuilder();
		dataArrayString.append("{").append("\"data\": [");
		for(int i=0; i<productVoList.size(); i++) {
			ProductVo productVo = productVoList.get(i);
			
			dataArrayString
			.append("[")
				.append("\""+ productVo.getProductNum() +"\"")
				.append(",")
				.append("\""+ productVo.getProductName() +"\"")
				.append(",")
				.append("\""+ productVo.getProductPrice() +"\"")
				.append(",");
			if(productVo.getProductPdf() == null) {
				dataArrayString.append("\"\"")
				.append(",");
			}else {
				dataArrayString.append("\"<a href='"+ projectURL +"/mainBodys/downLoadPDF?productId= "+ productVo.getProductId() + "' class='btn btn-warning'  data-id='"+ productVo.getProductId() + "'><i class='icon-arrow-down'></i></button>\"")
				.append(",");
			}
				dataArrayString
				.append("\"<button class='btn btn-success'  data-id='"+ productVo.getProductId() + "' onclick='datailProduct(this);' ><i class='icon-tags'></i></button>\"")
				.append(",")
				.append("\"<button class='btn btn-info'  data-id='"+ productVo.getProductId() + "' onclick='editProduct(this);' ><i class='icon-pencil'></i></button>\"")
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		
		return substring;
	} 
	
	/**
	 * 下载pdf
	 * @param productId
	 * @param productVo
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value="downLoadPDF")
	@ResponseBody
	private Infos downLoadPDF(String productId, ProductVo productVo,HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		Infos infos = Infos.getInfosInstance();
		List<ProductVo> productVoList = productVoService.selectProductVoList(productVo);
		if(productVoList.size() != 0) {
			productVo = productVoList.get(0);
		}
		File file = new File(productVo.getProductPdf());
		ServletContext servletContext = request.getServletContext();
		String mimeType = servletContext.getMimeType(file.getName());
		if(file.exists()) {
			response.setHeader("Content-Type", mimeType);
			String fileName = productVo.getProductName() + ".pdf";
			response.addHeader("Content-Disposition", "attachment;fileName=" + new String(fileName.getBytes("GBK"),"iso-8859-1"));
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				OutputStream os = response.getOutputStream();
				IOUtils.copy(bis, os);
			}catch(Exception e) {
				infos.message = Message.ERROR;
				infos.obj = "下载失败,请重试";
			}finally {
				if(bis != null) {
					try {
						bis.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				if(fis != null) {
					try {
						bis.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 产品详情
	 * @param productVo
	 * @return
	 */
	@RequestMapping(value="detailproduct")
	@ResponseBody
	private ProductVo detailProduct(ProductVo productVo) {
		List<ProductVo> productVoList = productVoService.selectProductVoList(productVo);
		if(productVoList.size() > 0) {
			productVo = productVoList.get(0);
			return productVo;
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="updateProduct")
	@ResponseBody
	private Infos updateProduct(
			@RequestParam(value = "file", required = false) MultipartFile productPdf, 
			ProductVo productVo) {
		if(productPdf.getSize() > 0) {
			String webInf = this.getClass().getClassLoader().getResource("/").getPath().replace("classes/", "");
			String imgPath = webInf + "mainBody/pdf/";
			File pdfFile = new File(imgPath, productVo.getProductId() + ".pdf");
			if(!pdfFile.exists()) {
				pdfFile.mkdirs();
			}
			try {
				productPdf.transferTo(pdfFile);
				System.err.println("文件修改成功: " + pdfFile.getPath());
				productVo.setProductPdf(pdfFile.getPath());
			} catch (Exception e) {
				e.printStackTrace();
				Infos infos = Infos.getInfosInstance();
				infos.message = Message.ERROR;
				infos.obj = "文件上传失败";
				return infos;
			}
		}
		Infos infos = productVoService.updateProduct(productVo);
		return infos;
	}
	
/*** 产品管理 /end ***/
	
/*** 客户管理 begin ***/
	
	@RequestMapping(value="getAllCustom")
	@ResponseBody
	private String getAllCustom() {
		List<CustomVo> allCustomVo = customVoService.getAllCustomVo();
		if(allCustomVo.size() == 0) return "{\"data\": []}";
		StringBuilder dataArrayString = new StringBuilder();
		dataArrayString.append("{").append("\"data\": [");
		for(int i=0; i<allCustomVo.size(); i++) {
			CustomVo customVo = allCustomVo.get(i);
			
			dataArrayString
			.append("[")
				.append("\""+ customVo.getCustomName() +"\"")
				.append(",")
				.append("\""+ customVo.getCustomLinkmanName() +"\"")
				.append(",")
				.append("\""+ customVo.getCustomLinkmanPhone() +"\"")
				.append(",")
				.append("\""+ customVo.getCustomLinkmanPost() +"\"")
				.append(",")
				.append("\""+ customVo.getCustomRankVo().getCustomRankName() +"\"")
				.append(",")
				.append("\""+ customVo.getCustomStateVo().getCustomStateName() +"\"")
				.append(",");
				dataArrayString
				.append("\"<button class='btn btn-success'  data-id='"+ customVo.getCustomId() + "' onclick='datailCustom(\\\""+ customVo.getCustomId() +"\\\");' ><i class='icon-tags'></i></button>\"")
				.append(",")
				.append("\"<button class='btn btn-info'  data-id='"+ customVo.getCustomId() + "' onclick='editCustomShow(\\\""+ customVo.getCustomId() +"\\\");' ><i class='icon-pencil'></i></button>\"")
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		
		return substring;
	} 
	
	/**
	 * 获取客户所属的部门
	 * @return
	 */
	@RequestMapping(value="getCustomDepartmentVoList")
	@ResponseBody
	private List<DepartmentVo> getCustomDepartmentVoList() {
		List<DepartmentVo> departmentList = departmentService.selectDepartmentList(null);
		List<DepartmentVo> departmentListResult = new ArrayList<DepartmentVo>();
		for(int i=0; i<departmentList.size(); i++) {
			DepartmentVo departmentVo = departmentList.get(i);
			if("cfd4baa2-0986-11e7-b918-28d2444b860a".equals(departmentVo.getDepartmentId()) || 
					"7fc51cfa-0986-11e7-b918-28d2444b860a".equals(departmentVo.getDepartmentId()) ||
					"85ef362e-0987-11e7-b918-28d2444b860a".equals(departmentVo.getDepartmentId()) ){
				continue;
			}
			departmentListResult.add(departmentVo);
		}
		return departmentListResult;
	}
	
	/**
	 * 添加新客户
	 * @param customVo
	 * @param session
	 * @return
	 */
	@RequestMapping(value="addCustomVo")
	@ResponseBody
	private Infos addCustomVo(CustomVo customVo, HttpSession session ) {
		customVo.setCustomId(UUID.randomUUID().toString());
		if(customVo.getDepartmentId() == null) {
			EmployeeVo employeeVo = new EmployeeVo();
			employeeVo.setEmployeeId((String)session.getAttribute("employeeId"));
			employeeVo = employeeVoService.getOneEmployeeVo(employeeVo);
			customVo.setDepartmentId(employeeVo.getDepartmentIdEmployee());
		}
		Infos infos = customVoService.insertCustomVo(customVo);
		return infos;
	}
	
	/**
	 * 编辑客户
	 * @param customVo
	 * @param session
	 * @return
	 */
	@RequestMapping(value="editCustomShow")
	@ResponseBody
	private CustomVo editCustomShow(CustomVo customVo) {
		List<CustomVo> customVoList = customVoService.selectCustomVoList(customVo);
		if(customVoList.size() > 0)
			return customVoList.get(0);
		return null;
	}
	
	@RequestMapping(value="editCustom")
	@ResponseBody
	private Infos editCustom(CustomVo customVo) {
		Infos infos = customVoService.updateCustomVo(customVo);
		return infos;
	}
/*** 客户管理 /end ***/
}
