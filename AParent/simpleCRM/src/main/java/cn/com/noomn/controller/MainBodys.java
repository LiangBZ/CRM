package cn.com.noomn.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.com.noomn.service.AuthorityService;
import cn.com.noomn.service.BusinessOpportunityVoService;
import cn.com.noomn.service.CustomVoService;
import cn.com.noomn.service.DepartmentService;
import cn.com.noomn.service.EmployeeVoService;
import cn.com.noomn.service.FeedbackVoService;
import cn.com.noomn.service.ProcessVoService;
import cn.com.noomn.service.ProductVoService;
import cn.com.noomn.service.SalesStageVoService;
import cn.com.noomn.service.TaskVoService;
import cn.com.noomn.service.UserroleAuthorityVoService;
import cn.com.noomn.util.Analyse;
import cn.com.noomn.util.CalendarInfos;
import cn.com.noomn.util.CharData;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.LineCharData;
import cn.com.noomn.util.Message;
import cn.com.noomn.util.PieChar;
import cn.com.noomn.util.StringToTimestamp;
import cn.com.noomn.vo.AuthorityVo;
import cn.com.noomn.vo.BusinessOpportunityVo;
import cn.com.noomn.vo.CustomVo;
import cn.com.noomn.vo.DepartmentVo;
import cn.com.noomn.vo.EmployeeVo;
import cn.com.noomn.vo.FeedbackVo;
import cn.com.noomn.vo.ProcessVo;
import cn.com.noomn.vo.ProductVo;
import cn.com.noomn.vo.SalesStageVo;
import cn.com.noomn.vo.TaskVo;
import cn.com.noomn.vo.UserroleAuthorityVo;
import cn.com.noomn.vo.UserroleVo;

@Controller
@RequestMapping(value="/mainBodys/")
public class MainBodys {
	
	@Value("${project.url}")
	private String projectURL;
	@Value("${pdf.url}")
	private String pdfURL;
	
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
	@Autowired
	private BusinessOpportunityVoService businessOpportunityVoService;
	@Autowired
	private SalesStageVoService salesStageVoService;
	@Autowired
	private TaskVoService taskVoService;
	@Autowired
	private FeedbackVoService feedbackVoService;
	@Autowired
	private ProcessVoService processVoService;
	
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

			int employeeNumber = 0;
			for(int j=0; j<departmentVo.getEmployeeVoList().size(); j++) {
				if(departmentVo.getEmployeeVoList().get(j).getEmployeeId() != null)
					employeeNumber++;
			}	
			//根据员工数量显示不同的 颜色
			if(employeeNumber == 0) {
				dataArrayString.append("\"<span class='label label-danger'>"+ employeeNumber+"</span>\",");
			}else if(employeeNumber >0 && employeeNumber < 5){
				dataArrayString.append("\"<span class='label label-success'>"+ employeeNumber+"</span>\",");
			}else {
				dataArrayString.append("\"<span class='label label-inverse'>"+ employeeNumber +"</span>\",");
			}
			
			//初始化不允许删除
			if(departmentVo.getDepartmentInit() == 1) {
				dataArrayString
					.append("\"\"")
					.append(",")
					.append("\"\"");
			}else {
				dataArrayString
					.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='editDepartment(this,\\\""+ projectURL +"\\\");'><i class='icon-edit'></i> 编辑</a>\",")
					.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='deleteConfirmWarm(this,\\\""+ projectURL +"/mainBodys/deleteDepartmentVo\\\");'><i class='icon-minus'></i> 删除</a>\"");
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
	
	/**
	 * 获取当前用户的角色
	 * @param session
	 * @return
	 */
	@RequestMapping(value="returnUserrole")
	@ResponseBody
	private String returnUserrole(HttpSession session) {
		return (String)session.getAttribute("userroleIdEmployee");
	}
	
/*** 角色管理 /end ***/
	
/*** 成员管理 begin ***/
	
	/**
	 * 显示成员信息
	 * @return
	 */
	@RequestMapping(value="getEmployeeVoList", produces={"text/html;charset=UTF-8;","application/text;"})
	@ResponseBody
	private String getEmployeeVoList(HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		String userroleIdEmployee = (String)session.getAttribute("userroleIdEmployee");
		
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
			.append("\"<button class='btn btn-success'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='detailedEmployee(this);' ><i class='icon-tags'></i></button>\"");
			if(employeeVo.getEmployeeInit() != 1 && !employeeId.equals(employeeVo.getEmployeeId())) {
				switch(userroleIdEmployee) {
					case "10988d26-0986-11e7-b918-28d2444b860a":{	//管理员
						dataArrayString
						.append(",")
						.append("\"<button class='btn btn-primary'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='editEmployee(this);'><i class='icon-pencil'></i></button>\"");
					};break;	
					case "6566dff0-0987-11e7-b918-28d2444b860a":{	//总经理
						if(!"6566dff0-0987-11e7-b918-28d2444b860a".equals(employeeVo.getUserroleIdEmployee())) {
							dataArrayString
							.append(",")
							.append("\"<button class='btn btn-primary'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='editEmployee(this);'><i class='icon-pencil'></i></button>\"");
						}else {
							dataArrayString
							.append(",")
							.append("\"\"");
						}
					};break;	
					case "5e8d627f-0987-11e7-b918-28d2444b860a":{	//部门经理
						if(departmentIdEmployee.equals(employeeVo.getDepartmentIdEmployee()) && !"5e8d627f-0987-11e7-b918-28d2444b860a".equals(employeeVo.getUserroleIdEmployee())) {
							dataArrayString
							.append(",")
							.append("\"<button class='btn btn-primary'  data-id='"+ employeeVo.getEmployeeId() + "' onclick='editEmployee(this);'><i class='icon-pencil'></i></button>\"");
						}else {
							dataArrayString
							.append(",")
							.append("\"\"");
						}
					};break;	
					case "57695387-0987-11e7-b918-28d2444b860a":{	//销售人员
						dataArrayString
						.append(",")
						.append("\"\"");
					};break;	
				}
			}else {
				dataArrayString
				.append(",")
				.append("\"\"");
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
	 * 添加员工所能选择的部门列表
	 * @param departmentVo
	 * @return
	 */
	@RequestMapping(value="getAddEmployeeDepartmentVoList")
	@ResponseBody
	private List<DepartmentVo> getAddEmployeeDepartmentVoList(HttpSession session) {
		String userroleIdEmployee = (String)session.getAttribute("userroleIdEmployee");
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		List<DepartmentVo> departmentList = departmentService.selectDepartmentList(null);
		if(departmentList.size() == 0) return null;
		List<DepartmentVo> resultList = new ArrayList<DepartmentVo>();
		switch(userroleIdEmployee) {
			case "10988d26-0986-11e7-b918-28d2444b860a":{	//管理员
				for(int i=0; i<departmentList.size(); i++) {
					DepartmentVo departmentVo = departmentList.get(i);
					String departmentId = departmentVo.getDepartmentId();
					if(departmentId.equals("85ef362e-0987-11e7-b918-28d2444b860a")) {
						continue;
					}
					resultList.add(departmentVo);
				}
			};break;
			case "6566dff0-0987-11e7-b918-28d2444b860a":{	//总经理
				for(int i=0; i<departmentList.size(); i++) {
					DepartmentVo departmentVo = departmentList.get(i);
					String departmentId = departmentVo.getDepartmentId();
					if(departmentId.equals("cfd4baa2-0986-11e7-b918-28d2444b860a") || departmentId.equals("85ef362e-0987-11e7-b918-28d2444b860a")) {
						continue;
					}
					resultList.add(departmentVo);
				}
			};break;
			case "5e8d627f-0987-11e7-b918-28d2444b860a":{	//部门经理
				for(int i=0; i<departmentList.size(); i++) {
					DepartmentVo departmentVo = departmentList.get(i);
					String departmentId = departmentVo.getDepartmentId();
					if(departmentIdEmployee.equals(departmentId)) {
						resultList.add(departmentVo);
					}
				}
			};break;
			case "57695387-0987-11e7-b918-28d2444b860a":{	//销售人员
				resultList = null;
			};break;
		}
		return resultList;
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
	private Infos updateEmployeeVo(EmployeeVo employeeVo,HttpSession session) {
		if(employeeVo.getEmployeeImg() != null) {
			String webInf = this.getClass().getClassLoader().getResource("/").getPath().split("simpleCRM")[0];
			String imgPath = webInf + "simpleCRM-img/" + employeeVo.getEmployeeId() + ".png";
//			String webInf = this.getClass().getClassLoader().getResource("/").getPath().replace("classes/", "");
//			String imgPath = webInf + "mainBody/img/png/" + employeeVo.getEmployeeId() + ".png";
			employeeVo.setEmployeeImgPath(imgPath);
		}
		
		if(employeeVo.getDepartmentIdEmployee() != null) {
			if(employeeVo.getDepartmentIdEmployee().equals("85ef362e-0987-11e7-b918-28d2444b860a")) {
				employeeVo.setEmployeeInit(-1);
			}else {
				employeeVo.setEmployeeInit(0);
			}
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
			String webInf = this.getClass().getClassLoader().getResource("/").getPath().split("simpleCRM")[0];
			String imgPath = webInf + "simpleCRM-PDF/";
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
				dataArrayString
				.append("\"\"")
				.append(",")
				.append("\"\"")
				.append(",");
			}else {
				dataArrayString
				.append("\"<a target='pdfContainer' href='"+ pdfURL +"/pdf/" + productVo.getProductId() + ".pdf'" + "class='btn btn-success' onclick='showPDF();'><i class='icon-search'></i></button>\"")
				.append(",")
				.append("\"<a href='"+ projectURL +"/mainBodys/downLoadPDF?productId= "+ productVo.getProductId() + "' class='btn btn-warning'  data-id='"+ productVo.getProductId() + "'><i class='icon-arrow-down'></i></button>\"")
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

	@RequestMapping(value="getAllProductList")
	@ResponseBody
	private List<ProductVo> getAllProductList() {
		List<ProductVo> productVoList = productVoService.selectProductVoList(null);
		return productVoList;
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
	
	/**
	 * 编辑产品信息
	 * @param productPdf
	 * @param productVo
	 * @return
	 */
	@RequestMapping(value="updateProduct")
	@ResponseBody
	private Infos updateProduct(
			@RequestParam(value = "file", required = false) MultipartFile productPdf, 
			ProductVo productVo) {
		if(productPdf.getSize() > 0) {
			String webInf = this.getClass().getClassLoader().getResource("/").getPath().split("simpleCRM")[0];
			String imgPath = webInf + "simpleCRM-PDF/";
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
	private String getAllCustom(HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		String userroleIdEmployee = (String)session.getAttribute("userroleIdEmployee");
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		CustomVo customVo1 = new CustomVo();
		switch(userroleIdEmployee ) {
		case "10988d26-0986-11e7-b918-28d2444b860a":break;
		case "6566dff0-0987-11e7-b918-28d2444b860a":break;
		case "5e8d627f-0987-11e7-b918-28d2444b860a":customVo1.setDepartmentId(departmentIdEmployee); break;
		case "57695387-0987-11e7-b918-28d2444b860a":customVo1.setFollowEmployeeId(employeeId);; break;
		}
		
		List<CustomVo> allCustomVo = customVoService.getAllCustomVo(customVo1);
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
				.append("\"<button class='btn btn-info'  data-id='"+ customVo.getCustomId() + "' onclick='showAddBusinessOpportunity(\\\""+ customVo.getCustomId() +"\\\");' ><i class='icon-glass'></i></button>\"")
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
	 * 获取可以选择的销售人员
	 * @return
	 */
	@RequestMapping(value="getSalesmanList")
	@ResponseBody
	private List<EmployeeVo> getalesmanList(HttpSession session) {
		String employeeId = (String) session.getAttribute("employeeId");
		String employeeRealName = (String)session.getAttribute("employeeRealName");
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		String userroleIdEmployee = (String)session.getAttribute("userroleIdEmployee");
		List<EmployeeVo> employeeVoList = new ArrayList<EmployeeVo>();
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setEmployeeInit(0);
		switch(userroleIdEmployee ) {
		case "10988d26-0986-11e7-b918-28d2444b860a": //管理员
			employeeVo.setUserroleIdEmployee("57695387-0987-11e7-b918-28d2444b860a");
//			employeeVoList = employeeVoService.selectForNimble(employeeVo);
			employeeVoList = employeeVoService.selectcanChooseFoller(employeeVo);
			break; 
		case "6566dff0-0987-11e7-b918-28d2444b860a": //总经理
			employeeVo.setUserroleIdEmployee("57695387-0987-11e7-b918-28d2444b860a");
//			employeeVoList = employeeVoService.selectForNimble(employeeVo);
			employeeVoList = employeeVoService.selectcanChooseFoller(employeeVo);
			break; 
		case "5e8d627f-0987-11e7-b918-28d2444b860a":	//部门经理
			employeeVo.setDepartmentIdEmployee(departmentIdEmployee);
//			employeeVo.setUserroleIdEmployee("57695387-0987-11e7-b918-28d2444b860a");
//			employeeVoList = employeeVoService.selectForNimble(employeeVo);
			employeeVoList = employeeVoService.selectcanChooseFoller(employeeVo);
			List<EmployeeVo> employeeVoList2 = new ArrayList<EmployeeVo>();
			for(int i=0; i<employeeVoList.size(); i++) {
				if(!employeeVoList.get(i).getUserroleIdEmployee().equals("57695387-0987-11e7-b918-28d2444b860a"))
					continue;
				employeeVoList2.add(employeeVoList.get(i));
			}
			employeeVoList = employeeVoList2;
			break; 
		case "57695387-0987-11e7-b918-28d2444b860a": //销售人员
			employeeVo.setEmployeeId(employeeId);
			employeeVoList = employeeVoService.selectcanChooseFoller(employeeVo);
//			List<EmployeeVo> selectForNimble = employeeVoService.selectForNimble(employeeVo);
//			if(selectForNimble.size() > 0) {
//				employeeVo = selectForNimble.get(0);
//				employeeVoList.add(employeeVo); 
//			}
			break; 
		}
		
		return employeeVoList;
	}
	
	@RequestMapping(value="getCanChooseDepartmentsList")
	@ResponseBody
	private List<DepartmentVo> getCanChooseDepartmentsList(HttpSession session) {
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		List<DepartmentVo> departmentList = new ArrayList<DepartmentVo>();
		if(departmentIdEmployee.equals("cfd4baa2-0986-11e7-b918-28d2444b860a")) { //总裁办
			List<DepartmentVo> selectDepartmentList = departmentService.selectDepartmentList(null);
			for(int i=0; i<selectDepartmentList.size(); i++) {
				DepartmentVo departmentVo = selectDepartmentList.get(i);
				if(departmentVo.equals("cfd4baa2-0986-11e7-b918-28d2444b860a") || 
				   departmentVo.equals("7fc51cfa-0986-11e7-b918-28d2444b860a") ||
				   departmentVo.equals("85ef362e-0987-11e7-b918-28d2444b860a")){ 
					continue; 
				}else {
					departmentList.add(departmentVo);
				}
			}
		}else {
			DepartmentVo departmentVo = new DepartmentVo();
			departmentVo.setDepartmentId(departmentIdEmployee);
			departmentList = departmentService.selectDepartmentList(departmentVo);
		}
		return departmentList;
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
			String followEmployeeId = customVo.getFollowEmployeeId();
			EmployeeVo employeeVo = new EmployeeVo();
			employeeVo.setEmployeeId(followEmployeeId);
//			employeeVo.setEmployeeId((String)session.getAttribute("employeeId"));
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
//		List<CustomVo> customVoList = customVoService.selectCustomVoList(customVo);
		List<CustomVo> customVoList = customVoService.selectDetailedList(customVo);
		if(customVoList.size() > 0)
			return customVoList.get(0);
		return null;
	}
	
	@RequestMapping(value="editCustom")
	@ResponseBody
	private Infos editCustom(CustomVo customVo) {
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setEmployeeId(customVo.getFollowEmployeeId());
		employeeVo = employeeVoService.getOneEmployeeVo(employeeVo);
		customVo.setDepartmentId(employeeVo.getDepartmentIdEmployee());
		Infos infos = customVoService.updateCustomVo(customVo);
		return infos;
	}
	
	/**
	 * 获取客户的详细信息，包含客户表、客户级别表、客户状态表、商机表、销售阶段表、产品表、员工表
	 * @param customVo
	 * @return
	 */
	@RequestMapping(value="selectCustomDetailed")
	@ResponseBody
	private CustomVo selectCustomDetailed(CustomVo customVo) {
		customVo = customVoService.selectDetailed(customVo);
		return customVo;
	}
	
	@RequestMapping(value="selectCustomDetailedTable/{customId}")
	@ResponseBody
	private String selectCustomDetailedTable(@PathVariable(value="customId") String customId) {
		CustomVo customVo = new CustomVo();
		customVo.setCustomId(customId);
		customVo = customVoService.selectDetailed(customVo);
		if(customVo == null) return "{\"data\": []}";
		List<BusinessOpportunityVo> businessOpportunityVoList = customVo.getBusinessOpportunityVoList();
		if(businessOpportunityVoList.size() == 0 
				|| businessOpportunityVoList.size() == 1 && businessOpportunityVoList.get(0).getBusinessOpportunityId()==null) 
			return "{\"data\": []}";
		StringBuilder dataArrayString = new StringBuilder();
		dataArrayString.append("{").append("\"data\": [");
		for(int i=0; i<businessOpportunityVoList.size(); i++) {
			BusinessOpportunityVo businessOpportunityVo = businessOpportunityVoList.get(i);
			
			dataArrayString
			.append("[")
				.append("\""+ businessOpportunityVo.getProductVo().getProductName() +"\"")
				.append(",")
				.append("\""+ businessOpportunityVo.getPreSalesAmount() +"\"")
				.append(",")
				.append("\""+ StringToTimestamp.fromLongToString(businessOpportunityVo.getPreDealTime().getTime(), "yyyy-MM-dd") +"\"")
				.append(",");
			
			switch(businessOpportunityVo.getSalesStageVo().getSalesStageId()) {
			case "ddc2e328-0d4b-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-info'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "fbf40d99-0d4b-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-warning'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "011bc899-0d4c-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-inverse'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "053bd26b-0d4c-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-success'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "0b16581b-0d4c-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-danger'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			}
			dataArrayString
				.append(",")
				.append("\""+ customVo.getReceiver().getEmployeeRealName() +"\"")
				.append(",")
				.append("\""+ businessOpportunityVo.getRemark() +"\"")
				.append(",")
				.append("\"<button class='btn btn-info'  data-id='"+ businessOpportunityVo.getBusinessOpportunityId() + "' onclick='showCustomBusinessOpportunity(\\\""+ businessOpportunityVo.getBusinessOpportunityId() +"\\\");' ><i class='icon-tags'></i></button>\"")
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		
		return substring;
	} 
	
/*** 客户管理 /end ***/
	
/*** 商机管理 begin ***/
	/**
	 * 添加一个商机
	 * @param businessOpportunityVo
	 * @return
	 */
	@RequestMapping(value="addBusinessOpportunityVo")
	@ResponseBody
	private Infos addBusinessOpportunityVo(BusinessOpportunityVo businessOpportunityVo) {
		businessOpportunityVo.setBusinessOpportunityId(UUID.randomUUID().toString());
		Infos infos = businessOpportunityVoService.addBusinessOpportunityVo(businessOpportunityVo);
		return infos;
	}
	
	/**
	 * 根据跟进人查询商机
	 * @return
	 */
	@RequestMapping(value="getBusinessOpportunityVoByFollwer")
	@ResponseBody
	private String getBusinessOpportunityVoByFollwer(HttpSession session) {
		String followEmployeeId = (String)session.getAttribute("employeeId");
		String departmentId = (String) session.getAttribute("departmentIdEmployee");
		String userroleIdEmployee = (String) session.getAttribute("userroleIdEmployee");
		List<BusinessOpportunityVo> businessOpportunityByfollowId = null;
		CustomVo customVo = new CustomVo();
		switch(userroleIdEmployee) {
		case "10988d26-0986-11e7-b918-28d2444b860a": //管理员
			businessOpportunityByfollowId = businessOpportunityVoService.selectBusinessOpportunityByfollowId(null);
			break; 
		case "6566dff0-0987-11e7-b918-28d2444b860a": //总经理
			businessOpportunityByfollowId = businessOpportunityVoService.selectBusinessOpportunityByfollowId(null);
			break; 
		case "5e8d627f-0987-11e7-b918-28d2444b860a":	//部门经理
			customVo.setDepartmentId(departmentId);
			businessOpportunityByfollowId = businessOpportunityVoService.selectBusinessOpportunityByfollowId(customVo);
			break; 
		case "57695387-0987-11e7-b918-28d2444b860a": //销售人员
			customVo.setFollowEmployeeId(followEmployeeId);
			businessOpportunityByfollowId = businessOpportunityVoService.selectBusinessOpportunityByfollowId(customVo);
			break; 
		}
		
		//如果没有商机
		String data = "";
		if(businessOpportunityByfollowId.size() == 0) return "{\"data\": []}";
		
		BusinessOpportunityVo businessOpportunityVo = null;
		StringBuilder dataArrayString = new StringBuilder();
		dataArrayString.append("{").append("\"data\": [");
		
		for(int i=0; i<businessOpportunityByfollowId.size(); i++) {
			businessOpportunityVo = businessOpportunityByfollowId.get(i);
			dataArrayString
			.append("[")
			.append("\""+ businessOpportunityVo.getCustomVo().getCustomName() +"\"")
			.append(",")
			.append("\""+ businessOpportunityVo.getProductVo().getProductName() +"\"")
			.append(",")
			.append("\""+ businessOpportunityVo.getPreSalesAmount()  + "\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(businessOpportunityVo.getPreDealTime().getTime(), "yyyy-MM-dd") +"\"")
			.append(",");
			switch(businessOpportunityVo.getSalesStageVo().getSalesStageId()) {
			case "ddc2e328-0d4b-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-info'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "fbf40d99-0d4b-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-warning'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "011bc899-0d4c-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-inverse'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "053bd26b-0d4c-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-success'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			case "0b16581b-0d4c-11e7-9e9d-28d2444b860a" : dataArrayString.append("\"<span class='label label-danger'>"+ businessOpportunityVo.getSalesStageVo().getSalesStageName() +"</span>\"");break;
			}
			dataArrayString
			.append(",")
			.append("\""+ businessOpportunityVo.getCustomVo().getReceiver().getEmployeeRealName() + "\"")
			.append(",")
			.append("\"<button class='btn btn-success'  data-id='"+ businessOpportunityVo.getBusinessOpportunityId() + "' onclick='showCustomBusinessOpportunity(\\\""+ businessOpportunityVo.getBusinessOpportunityId() +"\\\");' ><i class='icon-tags'></i></button>\"")
			.append(",");
			
			if(!"0b16581b-0d4c-11e7-9e9d-28d2444b860a".equals(businessOpportunityVo.getSalesStageVo().getSalesStageId()) && !"053bd26b-0d4c-11e7-9e9d-28d2444b860a".equals(businessOpportunityVo.getSalesStageVo().getSalesStageId())) {
				dataArrayString
				.append("\"<button class='btn btn-info'  data-id='"+ businessOpportunityVo.getBusinessOpportunityId() + "' onclick='editBusinessOpportunityShow(\\\""+ businessOpportunityVo.getBusinessOpportunityId() +"\\\");' ><i class='icon-pencil'></i></button>\"");
			}else {
				dataArrayString
				.append("\"\"");
			}
			dataArrayString
			.append(",")
			.append("\"<button class='btn btn-success'  data-id='"+ businessOpportunityVo.getBusinessOpportunityId() + "' onclick='showBusinessOpportunitysTask(\\\""+ businessOpportunityVo.getBusinessOpportunityId() +"\\\");' ><i class='icon-tags'></i></button>\"")
			.append(",")
			.append("\"<button class='btn btn-info'  data-id='"+ businessOpportunityVo.getBusinessOpportunityId() + "' onclick='addTaskShow(\\\""+ businessOpportunityVo.getBusinessOpportunityId() +"\\\",\\\""+ businessOpportunityVo.getCustomVo().getReceiver().getEmployeeId() +"\\\",\\\""+ businessOpportunityVo.getCustomVo().getReceiver().getEmployeeRealName() +"\\\");' ><i class='icon-wrench'></i></button>\"")
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		
		return substring;
	}
	
	/**
	 * 根据id查询商机
	 * @param businessOpportunityVo
	 * @return
	 */
	@RequestMapping(value="selectBusinessOpportunityVoByPrimaryKey")
	@ResponseBody
	private BusinessOpportunityVo selectBusinessOpportunityVoByPrimaryKey(BusinessOpportunityVo businessOpportunityVo) {
		businessOpportunityVo = businessOpportunityVoService.selectBusinessOpportunityVoByPrimaryKey(businessOpportunityVo);
		return businessOpportunityVo;
	}
	
	/**
	 * 获取可以选择的销售阶段
	 * @param salesStageVo
	 * @return
	 */
	@RequestMapping(value="canChooseSalesStageVo")
	@ResponseBody
	public List<SalesStageVo> canChooseSalesStageVo(SalesStageVo salesStageVo) {
		List<SalesStageVo> salesStageVoList = salesStageVoService.selectUpOrZeroSalesStageVo(salesStageVo);
		return salesStageVoList;
	}
	
	@RequestMapping(value="updateBusinessOpportunityVoByPrimaryKey")
	@ResponseBody
	private Infos updateBusinessOpportunityVoByPrimaryKey(BusinessOpportunityVo businessOpportunityVo) {
		Infos infos = businessOpportunityVoService.updateBusinessOpportunityVo(businessOpportunityVo);
		return infos;
	}
	
	@RequestMapping(value="selectBusinessOpportunityVoDeatailNoTask")
	@ResponseBody
	private BusinessOpportunityVo selectBusinessOpportunityVoDeatailNoTask(BusinessOpportunityVo businessOpportunityVo) {
		businessOpportunityVo = businessOpportunityVoService.selectBusinessOpportunityVoDeatailNoTask(businessOpportunityVo);
		return businessOpportunityVo;
	}
	
/*** 商机管理 /end ***/
	
/*** 任务管理 begin ***/
	@RequestMapping(value="addTask")
	@ResponseBody
	private Infos addTask(TaskVo taskVo, HttpSession session) {
		taskVo.setTaskId(UUID.randomUUID().toString());
		taskVo.setTaskStop(0);
		taskVo.setSponsorIdTask((String)session.getAttribute("employeeId"));
		
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long longtime=df.parse(df.format(c.getTime())).getTime();
			taskVo.setTaskReportDate(new Timestamp(longtime));
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		Infos infos = taskVoService.insertTaskVo(taskVo);
		return infos;
	}
	
	/**
	 * 查看收到的任务
	 * @param taskVo
	 * @param session
	 * @return
	 */
	@RequestMapping(value="getReceiveTask")
	@ResponseBody
	private String getReceiveTask(TaskVo taskVo, HttpSession session) {
		taskVo.setFollowEmployeeIdTask((String)session.getAttribute("employeeId"));
		List<TaskVo> receiveTaskVoList = taskVoService.selectReceiveTaskVo(taskVo);
		
		taskVo = null;
		StringBuilder dataArrayString = new StringBuilder();
		if(receiveTaskVoList.size() == 0) {
			dataArrayString.append("{").append("\"data\": []}");
			return dataArrayString.toString();
		}
		dataArrayString.append("{").append("\"data\": [");
		
		for(int i=0; i<receiveTaskVoList.size(); i++) {
			taskVo = receiveTaskVoList.get(i);
			dataArrayString
			.append("[")
			.append("\""+ taskVo.getTaskContent() +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskReportDate().getTime(), "yyyy-MM-dd") +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskStartTime().getTime(), "yyyy-MM-dd")  + "\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskEndTime().getTime(), "yyyy-MM-dd")  + "\"")
			.append(",")
			.append("\""+ taskVo.getSpEmployee().getEmployeeRealName() +"\"")
			.append(",")
			.append("\""+ taskVo.getReEmployee().getEmployeeRealName() +"\"");
			if(taskVo.getTaskStop() == 0) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-warning'>"+ "未完成" + "</span>\"");
			}else if(taskVo.getTaskStop() == 1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-success'>"+ "已完成" + "</span>\"");
			}else if(taskVo.getTaskStop() == -1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-danger'>"+ "无法完成" + "</span>\"");
			}
			if(taskVo.getTaskEndTime().getTime() < new Date().getTime()) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-danger'>"+ "已过期" + "</span>\"");
			}else {
				dataArrayString
				.append(",")
				.append("\"<button class='btn btn-info'  onclick='addFeedBackShow(\\\""+ taskVo.getTaskId() +"\\\",\\\""+ taskVo.getTaskContent() +"\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskReportDate().getTime(), "yyyy-MM-dd") +"\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskStartTime().getTime(), "yyyy-MM-dd")  + "\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskEndTime().getTime(), "yyyy-MM-dd")  + "\\\"," + "\\\""+ taskVo.getSpEmployee().getEmployeeRealName() +"\\\"," + "\\\""+ taskVo.getReEmployee().getEmployeeRealName() +"\\\"," + "\\\""+ taskVo.getFollowEmployeeIdTask() +"\\\");' ><i class='icon-wrench'></i></button>\"");
			}
			dataArrayString
			.append(",")
			.append("\"<button class='btn btn-success'  onclick='showCustomBusinessOpportunity(\\\""+ taskVo.getBusinessOpportunityIdTask() +"\\\");' ><i class='icon-tags'></i></button>\"");
			
			dataArrayString
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		return substring;
	}
	
	/**
	 * 根据任务id获取反馈记录
	 * @param feedbackVo
	 * @return
	 */
	@RequestMapping(value="selectFeedbackVoByTaskId")
	@ResponseBody
	private List<FeedbackVo> selectFeedbackVoByTaskId(FeedbackVo feedbackVo, HttpSession session){
		List<FeedbackVo> feedbackVoList = feedbackVoService.selectFeedbackVoByTaskId(feedbackVo);
//		String imgBasePath = (String) session.getAttribute("imgFilePath");
//		String imgPath = (String) session.getAttribute("imgPath");
//		
//		for(int i=0; i<feedbackVoList.size(); i++) {
//			File file = new File(imgBasePath + feedbackVoList.get(i).getEmployeeVo().getEmployeeId() + ".png");
//			boolean exists = file.exists();
//			if(exists) {
//				feedbackVoList.get(i).getEmployeeVo()
//				.setEmployeeImgPath(imgPath + feedbackVoList.get(i).getEmployeeVo().getEmployeeId() + ".png");;
//			}else {
//				feedbackVoList.get(i).getEmployeeVo()
//				.setEmployeeImgPath(imgPath + "no_image.png");;
//			}
//		}
		
		String webInf = this.getClass().getClassLoader().getResource("/").getPath().split("simpleCRM")[0];
//		String imgBasePath = (String) session.getAttribute("imgFilePath");
		String imgPath = (String) session.getAttribute("imgPath");
		
		for(int i=0; i<feedbackVoList.size(); i++) {
			File file = new File(webInf + "simpleCRM-img/" + feedbackVoList.get(i).getEmployeeVo().getEmployeeId() + ".png");
			boolean exists = file.exists();
			if(exists) {
				feedbackVoList.get(i).getEmployeeVo()
				.setEmployeeImgPath(pdfURL + "/img/" + feedbackVoList.get(i).getEmployeeVo().getEmployeeId() + ".png");;
			}else {
				feedbackVoList.get(i).getEmployeeVo()
				.setEmployeeImgPath(imgPath + "no_image.png");;
			}
		}
		
		return feedbackVoList;
	}
	
	@RequestMapping(value="insertFeedback")
	@ResponseBody
	private Infos insertFeedback(FeedbackVo feedbackVo){
		feedbackVo.setFeedbackId(UUID.randomUUID().toString());
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			long longtime=df.parse(df.format(c.getTime())).getTime();
			feedbackVo.setFeedbackTime(new Timestamp(longtime));
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		Infos infos = feedbackVoService.insertFeedbackVo(feedbackVo);
		return infos;
	}
	
	/**
	 * 查看已经发布的任务
	 * @param taskVo
	 * @param session
	 * @return
	 */
	@RequestMapping(value="getSenderTask")
	@ResponseBody
	private String getSenderTask(TaskVo taskVo, HttpSession session) {
		String userroleIdEmployee = (String) session.getAttribute("userroleIdEmployee");
		List<TaskVo> receiveTaskVoList = null;
		switch(userroleIdEmployee) {
		case "10988d26-0986-11e7-b918-28d2444b860a": //管理员
			receiveTaskVoList = taskVoService.selectSenderTaskVo(null);
			break; 
		case "6566dff0-0987-11e7-b918-28d2444b860a": //总经理
			receiveTaskVoList = taskVoService.selectSenderTaskVo(null);
			break; 
		case "5e8d627f-0987-11e7-b918-28d2444b860a":	//部门经理
			taskVo.setSponsorIdTask((String)session.getAttribute("employeeId"));
			receiveTaskVoList = taskVoService.selectSenderTaskVo(taskVo);
			break; 
		}
//		taskVo.setSponsorIdTask((String)session.getAttribute("employeeId"));
//		List<TaskVo> receiveTaskVoList = taskVoService.selectSenderTaskVo(taskVo);
		taskVo = null;
		StringBuilder dataArrayString = new StringBuilder();
		if(receiveTaskVoList.size() == 0) {
			dataArrayString.append("{").append("\"data\": []}");
			return dataArrayString.toString();
		}
		dataArrayString.append("{").append("\"data\": [");
		
		for(int i=0; i<receiveTaskVoList.size(); i++) {
			taskVo = receiveTaskVoList.get(i);
			dataArrayString
			.append("[")
			.append("\""+ taskVo.getTaskContent() +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskReportDate().getTime(), "yyyy-MM-dd") +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskStartTime().getTime(), "yyyy-MM-dd")  + "\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskEndTime().getTime(), "yyyy-MM-dd")  + "\"")
			.append(",")
			.append("\""+ taskVo.getSpEmployee().getEmployeeRealName() +"\"")
			.append(",")
			.append("\""+ taskVo.getReEmployee().getEmployeeRealName() +"\"");
			if(taskVo.getTaskStop() == 0) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-warning'>"+ "未完成" + "</span>\"");
			}else if(taskVo.getTaskStop() == 1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-success'>"+ "已完成" + "</span>\"");
			}else if(taskVo.getTaskStop() == -1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-danger'>"+ "无法完成" + "</span>\"");
			}
			dataArrayString
			.append(",")
			.append("\"<button class='btn btn-success'  onclick='showCustomBusinessOpportunity(\\\""+ taskVo.getBusinessOpportunityIdTask() +"\\\");' ><i class='icon-tags'></i></button>\"")
			.append(",")
			.append("\"<button class='btn btn-info'  onclick='editTaskShow(\\\""+ taskVo.getTaskId() +"\\\",\\\""+ taskVo.getTaskContent() +"\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskReportDate().getTime(), "yyyy-MM-dd") +"\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskStartTime().getTime(), "yyyy-MM-dd")  + "\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskEndTime().getTime(), "yyyy-MM-dd")  + "\\\"," + "\\\""+ taskVo.getSpEmployee().getEmployeeRealName() +"\\\"," + "\\\""+ taskVo.getReEmployee().getEmployeeRealName() +"\\\"," + "\\\""+ taskVo.getFollowEmployeeIdTask() +"\\\"," + "\\\""+ taskVo.getTaskStop() +"\\\");' ><i class='icon-wrench'></i></button>\"")
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		return substring;
	}
	
	/**
	 * 更新任务信息
	 * @param taskVo
	 * @return
	 */
	@RequestMapping(value="updateSenderTask")
	@ResponseBody
	private Infos updateSenderTask(TaskVo taskVo) {
		Infos infos = taskVoService.updateTaskVo(taskVo);
		return infos;
	}
	
	/**
	 * 根据商机获取反馈信息
	 * @param businessOpportunityVo
	 * @return
	 */
	@RequestMapping(value="selectFeedbackByBusinessOpportunityVoId")
	@ResponseBody
	private BusinessOpportunityVo selectFeedbackByBusinessOpportunityVoId(BusinessOpportunityVo businessOpportunityVo, HttpSession session) {
		businessOpportunityVo = businessOpportunityVoService.selectBusinessOpportunityVoTaskVoFeedbackVoByBusinessOpportunityVoId(businessOpportunityVo);
		
		if(businessOpportunityVo == null || businessOpportunityVo.getFeedbackVoList().size() == 0) return null;
		
		
		String webInf = this.getClass().getClassLoader().getResource("/").getPath().split("simpleCRM")[0];
//		String imgBasePath = (String) session.getAttribute("imgFilePath");
		String imgPath = (String) session.getAttribute("imgPath");
		
		for(int i=0; i<businessOpportunityVo.getFeedbackVoList().size(); i++) {
			File file = new File(webInf + "simpleCRM-img/" + businessOpportunityVo.getFeedbackVoList().get(i).getEmployeeVo().getEmployeeId() + ".png");
			boolean exists = file.exists();
			if(exists) {
				businessOpportunityVo.getFeedbackVoList().get(i).getEmployeeVo()
				.setEmployeeImgPath(pdfURL + "/img/" + businessOpportunityVo.getFeedbackVoList().get(i).getEmployeeVo().getEmployeeId() + ".png");;
			}else {
				businessOpportunityVo.getFeedbackVoList().get(i).getEmployeeVo()
				.setEmployeeImgPath(imgPath + "no_image.png");;
			}
		}
		
		return businessOpportunityVo;
	}
	
	
	@RequestMapping(value="getbusinessOpportunitysAllTask/{businessOpportunityIdTask}")
	@ResponseBody
	private String getbusinessOpportunitysAllTask(@PathVariable(value="businessOpportunityIdTask") String businessOpportunityIdTask , TaskVo taskVo, HttpSession session) {
		taskVo.setBusinessOpportunityIdTask(businessOpportunityIdTask);
		List<TaskVo> opportunitysAllTask = taskVoService.selectBusinessOpportunitysAllTask(taskVo);
		taskVo = null;
		StringBuilder dataArrayString = new StringBuilder();
		if(opportunitysAllTask.size() == 0) {
			dataArrayString.append("{").append("\"data\": []}");
			return dataArrayString.toString();
		}
		dataArrayString.append("{").append("\"data\": [");
		
		for(int i=0; i<opportunitysAllTask.size(); i++) {
			taskVo = opportunitysAllTask.get(i);
			dataArrayString
			.append("[")
			.append("\""+ taskVo.getTaskContent() +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskReportDate().getTime(), "yyyy-MM-dd") +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskStartTime().getTime(), "yyyy-MM-dd")  + "\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(taskVo.getTaskEndTime().getTime(), "yyyy-MM-dd")  + "\"")
			.append(",")
			.append("\""+ taskVo.getSpEmployee().getEmployeeRealName() +"\"")
			.append(",")
			.append("\""+ taskVo.getReEmployee().getEmployeeRealName() +"\"");
			if(taskVo.getTaskStop() == 0) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-warning'>"+ "未完成" + "</span>\"");
			}else if(taskVo.getTaskStop() == 1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-success'>"+ "已完成" + "</span>\"");
			}else if(taskVo.getTaskStop() == -1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-danger'>"+ "无法完成" + "</span>\"");
			}
			dataArrayString
			.append(",")
			.append("\"<button class='btn btn-success'  onclick='taskDetailShow(\\\""+ taskVo.getTaskId() +"\\\",\\\""+ taskVo.getTaskContent() +"\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskReportDate().getTime(), "yyyy-MM-dd") +"\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskStartTime().getTime(), "yyyy-MM-dd")  + "\\\"," + "\\\""+ StringToTimestamp.fromLongToString(taskVo.getTaskEndTime().getTime(), "yyyy-MM-dd")  + "\\\"," + "\\\""+ taskVo.getSpEmployee().getEmployeeRealName() +"\\\"," + "\\\""+ taskVo.getReEmployee().getEmployeeRealName() +"\\\"," + "\\\""+ taskVo.getFollowEmployeeIdTask() +"\\\");' ><i class='icon-tags'></i></button>\"");
			
			dataArrayString
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		return substring;
	}
/*** /任务管理 /end ***/

/***  外勤管理 begin ***/
	
	@RequestMapping(value="selectProcessVo")
	@ResponseBody
	private String selectProcessVo(ProcessVo processVo, HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		EmployeeVo spOutEmployee = new EmployeeVo();
		spOutEmployee.setEmployeeId(employeeId);
		processVo.setSpOutEmployee(spOutEmployee);
		
		List<ProcessVo> ProcessVoList = processVoService.selectProcessVo(processVo);
		StringBuilder dataArrayString = new StringBuilder();
		if(ProcessVoList.size() == 0) {
			dataArrayString.append("{").append("\"data\": []}");
			return dataArrayString.toString();
		}
		dataArrayString.append("{").append("\"data\": [");
		
		for(int i=0; i<ProcessVoList.size(); i++) {
			processVo = ProcessVoList.get(i);
			dataArrayString
			.append("[")
			.append("\""+ processVo.getProcessContent() +"\"")
			.append(",")
			.append("\""+ processVo.getSpOutEmployee().getEmployeeRealName() +"\"")
			.append(",")
			.append("\""+ processVo.getReOutEmployee().getEmployeeRealName() +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(processVo.getProcessStartTime().getTime(), "yyyy/MM/dd HH:mm") +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(processVo.getProcessEndTime().getTime(), "yyyy/MM/dd HH:mm")  + "\"");
			if(processVo.getProcessState() == 0) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-warning'>"+ "等待审核" + "</span>\"");
			}else if(processVo.getProcessState() == 1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-success'>"+ "审核通过" + "</span>\"");
			}else if(processVo.getProcessState() == -1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-danger'>"+ "未通过审核" + "</span>\"");
			}
//			dataArrayString
//			.append(",")
//			.append("\"<button class='btn btn-success'  onclick='takeBackProcess(\\\""+ processVo.getProcessId() +"\\\");' ><i class='icon-tags'></i></button>\"");
			
			dataArrayString
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		return substring;
	}
	
	/**
	 * 获取当前用户信息
	 * @param employeeVo
	 * @return
	 */
	@RequestMapping(value="getUserInfos")
	@ResponseBody
	private EmployeeVo getUserInfos(HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setEmployeeId(employeeId);
		employeeVo = employeeVoService.getOneEmployeeVo(employeeVo);
		return employeeVo;
	}
	
	/**
	 * 获取审批人信息
	 * @param session
	 * @return
	 */
	@RequestMapping(value="getApproverList")
	@ResponseBody
	private List<EmployeeVo> getApproverList(HttpSession session) {
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setDepartmentIdEmployee(departmentIdEmployee);
//		employeeVo.setUserroleIdEmployee("5e8d627f-0987-11e7-b918-28d2444b860a");
		List<EmployeeVo> approverList = employeeVoService.selectForNimble(employeeVo);
		
		List<EmployeeVo> approverList2 = new ArrayList<EmployeeVo>();
		for(int i=0; i<approverList.size(); i++) {
			if("5e8d627f-0987-11e7-b918-28d2444b860a".equals(approverList.get(i).getUserroleIdEmployee())) {
				approverList2.add(approverList.get(i));
			}
		}
		approverList = approverList2;
		
		if(approverList.size() == 0) {
			EmployeeVo employeeVo2 = new EmployeeVo();
			employeeVo2.setUserroleIdEmployee("6566dff0-0987-11e7-b918-28d2444b860a");
			approverList = employeeVoService.selectForNimble(employeeVo2);
			if(approverList.size() > 0) {
				for(int i=0; i<approverList.size(); i++) {
					EmployeeVo employeeVo3 = approverList.get(i);
					if(employeeVo3 != null) {
						if(employeeVo3.getEmployeeInit() > -1)
							approverList2.add(approverList.get(i));
					}
				}
			}
		}
		approverList = approverList2;
		return approverList;
	}
	
	/**
	 * 添加申请
	 * @param processVo
	 * @return
	 */
	@RequestMapping(value="addProcessVo")
	@ResponseBody
	private Infos addProcessVo(ProcessVo processVo) {
		processVo.setProcessId(UUID.randomUUID().toString());
		processVo.setProcessState(0);
		Infos infos = processVoService.insertProcess(processVo);
		return infos;
	}
	
	
	@RequestMapping(value="selectProcessVoApprove")
	@ResponseBody
	private String selectProcessVoApprove(ProcessVo processVo, HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		EmployeeVo reOutEmployee = new EmployeeVo();
		reOutEmployee.setEmployeeId(employeeId);
		processVo.setReOutEmployee(reOutEmployee);
		
		List<ProcessVo> ProcessVoList = processVoService.selectProcessVo(processVo);
		StringBuilder dataArrayString = new StringBuilder();
		if(ProcessVoList.size() == 0) {
			dataArrayString.append("{").append("\"data\": []}");
			return dataArrayString.toString();
		}
		dataArrayString.append("{").append("\"data\": [");
		
		for(int i=0; i<ProcessVoList.size(); i++) {
			processVo = ProcessVoList.get(i);
			dataArrayString
			.append("[")
			.append("\""+ processVo.getProcessContent() +"\"")
			.append(",")
			.append("\""+ processVo.getSpOutEmployee().getEmployeeRealName() +"\"")
			.append(",")
			.append("\""+ processVo.getReOutEmployee().getEmployeeRealName() +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(processVo.getProcessStartTime().getTime(), "yyyy/MM/dd HH:mm") +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(processVo.getProcessEndTime().getTime(), "yyyy/MM/dd HH:mm")  + "\"");
			if(processVo.getProcessState() == 0) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-warning'>"+ "等待审核" + "</span>\"");
			}else if(processVo.getProcessState() == 1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-success'>"+ "审核通过" + "</span>\"");
			}else if(processVo.getProcessState() == -1) {
				dataArrayString
				.append(",")
				.append("\"<span class='label label-danger'>"+ "未通过审核" + "</span>\"");
			}
			if(processVo.getProcessState() == 0) {
				dataArrayString
				.append(",")
				.append("\"<button class='btn btn-success'  onclick='processOkResult(\\\""+ processVo.getProcessId() +"\\\");' ><i class='icon-ok'></i></button>")
				.append("<button class='btn btn-danger'  onclick='processTrashResult(\\\""+ processVo.getProcessId() +"\\\");' ><i class='icon-trash'></i></button>\"");
			}else {
				dataArrayString
				.append(",")
				.append("\"\"");
			}
			dataArrayString
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		return substring;
	}
	
	/**
	 * 更新申请
	 * @param processVo
	 * @return
	 */
	@RequestMapping(value="updateProcessVo")
	@ResponseBody
	private Infos updateProcessVo(ProcessVo processVo) {
		Infos infos = processVoService.updateProcess(processVo);
		return infos;
	}
	
	/**
	 * 出勤统计
	 * @param session
	 * @return
	 */
	@RequestMapping(value="selectProcessVoForCalendar")
	@ResponseBody
	private List<CalendarInfos> selectProcessVoForCalendar(ProcessVo processVo , HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		String userroleIdEmployee = (String)session.getAttribute("userroleIdEmployee");

		List<ProcessVo> processVoList = null;
		switch(userroleIdEmployee) {
		case "10988d26-0986-11e7-b918-28d2444b860a" :	//管理员
			processVoList = processVoService.selectProcessVo(processVo);
			break;
		case "6566dff0-0987-11e7-b918-28d2444b860a" :
			processVoList = processVoService.selectProcessVo(processVo);
			break;
		case "5e8d627f-0987-11e7-b918-28d2444b860a" : 
			EmployeeVo reOutEmployee = new EmployeeVo();
			reOutEmployee.setDepartmentIdEmployee(departmentIdEmployee);
			processVo.setReOutEmployee(reOutEmployee);
			processVoList = processVoService.selectProcessVo(processVo);
			break;
		case "57695387-0987-11e7-b918-28d2444b860a" :
			EmployeeVo spOutEmployee = new EmployeeVo();
			spOutEmployee.setEmployeeId(employeeId);
			processVo.setSpOutEmployee(spOutEmployee);
			processVoList = processVoService.selectProcessVo(processVo);
			break;
		}
		
		if(processVoList.size() == 0) return null;
		List<CalendarInfos> calendarInfosList = new ArrayList<CalendarInfos>();
		for(int i=0; i<processVoList.size(); i++) {
			ProcessVo processVo2 = processVoList.get(i);
			CalendarInfos calendarInfos = new CalendarInfos();
			calendarInfos.setTitle(processVo2.getProcessContent() + "(" +  processVo2.getSpOutEmployee().getEmployeeRealName() +")");
			
			Timestamp processStartTime = processVo2.getProcessStartTime();
			Timestamp processEndTime = processVo2.getProcessEndTime();
			Calendar calendar = Calendar.getInstance();
			
			calendar.setTime(new Date(processStartTime.getTime()));
			calendarInfos.setStartY(calendar.get(Calendar.YEAR));
			calendarInfos.setStartM(calendar.get(Calendar.MONTH) + 1);
			calendarInfos.setStartD(calendar.get(Calendar.DAY_OF_MONTH));
			calendarInfos.setStartH(calendar.get(Calendar.HOUR_OF_DAY));
			calendarInfos.setStartI(calendar.get(Calendar.MINUTE));
			
			calendar.setTime(new Date(processEndTime.getTime()));
			calendarInfos.setEndY(calendar.get(Calendar.YEAR));
			calendarInfos.setEndM(calendar.get(Calendar.MONTH) + 1);
			calendarInfos.setEndD(calendar.get(Calendar.DAY_OF_MONTH));
			calendarInfos.setEndH(calendar.get(Calendar.HOUR_OF_DAY));
			calendarInfos.setEndI(calendar.get(Calendar.MINUTE));
			
			calendarInfosList.add(calendarInfos);
		}
		return calendarInfosList;
	}
	
	/**
	 * 根据主键获取出勤信息
	 * @param processVo
	 * @return
	 */
	@RequestMapping(value="getProcessVoByProcessVoId")
	@ResponseBody
	public ProcessVo getProcessVoByProcessVoId(ProcessVo processVo) {
		List<ProcessVo> processVoList = processVoService.selectProcessVo(processVo);
		if(processVoList.size() == 0) return null;
		if(processVoList.get(0).getProcessId() != null) return processVoList.get(0);
		return null;
	}
	
/***  /外勤管理 /end ***/
	
/***  商机分析 begin ***/
	
	/**
	 * 商机分析表格
	 * @param businessOpportunityVo
	 * @param session
	 * @return
	 */
	@RequestMapping(value="selectForAnalyse")
	@ResponseBody
	private String selectForAnalyse(HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		String departmentIdEmployee = (String)session.getAttribute("departmentIdEmployee");
		String userroleIdEmployee = (String)session.getAttribute("userroleIdEmployee");

		List<BusinessOpportunityVo> forAnalyse = null;
		BusinessOpportunityVo businessOpportunityVo = new BusinessOpportunityVo();
		CustomVo customVo = new CustomVo();
		switch(userroleIdEmployee) {
		case "10988d26-0986-11e7-b918-28d2444b860a" :	//管理员
			forAnalyse = businessOpportunityVoService.selectBusinessOpportunityVoForAnalyse(null);
			break;
		case "6566dff0-0987-11e7-b918-28d2444b860a" :	//总经理
			forAnalyse = businessOpportunityVoService.selectBusinessOpportunityVoForAnalyse(null);
			break;
		case "5e8d627f-0987-11e7-b918-28d2444b860a" : 	//部门经理
			customVo.setDepartmentId(departmentIdEmployee);
			businessOpportunityVo.setCustomVo(customVo);
			forAnalyse = businessOpportunityVoService.selectBusinessOpportunityVoForAnalyse(businessOpportunityVo);
			break;
		case "57695387-0987-11e7-b918-28d2444b860a" :	//销售人员
			customVo.setFollowEmployeeId(employeeId);
			businessOpportunityVo.setCustomVo(customVo);
			forAnalyse = businessOpportunityVoService.selectBusinessOpportunityVoForAnalyse(businessOpportunityVo);
			break;
		}
		
		StringBuilder dataArrayString = new StringBuilder();
		if(forAnalyse.size() == 0) {
			dataArrayString.append("{").append("\"data\": []}");
			return dataArrayString.toString();
		}
		dataArrayString.append("{").append("\"data\": [");
		
		for(int i=0; i<forAnalyse.size(); i++) {
			businessOpportunityVo = forAnalyse.get(i);
			dataArrayString
			.append("[")
			.append("\""+ businessOpportunityVo.getCustomVo().getCustomName() +"\"")
			.append(",")
			.append("\""+ businessOpportunityVo.getCustomVo().getCustomRankVo().getCustomRankName() +"\"")
			.append(",")
			.append("\""+ businessOpportunityVo.getProductVo().getProductNum() +"\"")
			.append(",")
			.append("\""+ businessOpportunityVo.getProductVo().getProductName() +"\"")
			.append(",")
			.append("\""+ businessOpportunityVo.getPreSalesAmount() +"\"")
			.append(",")
			.append("\""+ StringToTimestamp.fromLongToString(businessOpportunityVo.getPreDealTime().getTime(), "yyyy/MM/dd")  +"\"")
			.append(",")
			.append("\""+  businessOpportunityVo.getSalesStageVo().getSalesStageName()  +"\"")
			.append(",");
			
			String analyseRatio = "";
			if(businessOpportunityVo.getSalesStageVo().getRateOfProgress()==100) {
				analyseRatio = "--";
			}else {
				analyseRatio = Analyse.AnalyseRatio(businessOpportunityVo);
			}
			dataArrayString
			.append("\""+  analyseRatio  +"\"")
			.append(",");
			
			dataArrayString
			.append("\"<button class='btn btn-success'  onclick='showAnalyse(\\\""+ businessOpportunityVo.getBusinessOpportunityId() +"\\\");' ><i class='icon-ok'></i></button>\"")
			.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		return substring;
	}
	
	
	@RequestMapping(value="selectForChar")
	@ResponseBody
	private CharData selectForChar(BusinessOpportunityVo businessOpportunityVo) {
		List<BusinessOpportunityVo> BusinessOpportunityVoList = businessOpportunityVoService.selectBusinessOpportunityVoForAnalyse(businessOpportunityVo);
		if(BusinessOpportunityVoList.size() == 0) return null;
		businessOpportunityVo = BusinessOpportunityVoList.get(0);

		CharData charData = new CharData();
		LineCharData lineCharData = Analyse.getLineCharData(businessOpportunityVo);
		charData.setLineCharData(lineCharData);
		
		List<PieChar> pieCharList = charData.getPieCharList();
		PieChar pieChar = new PieChar();
		pieChar.setName("产品价格");
		pieChar.setValue(businessOpportunityVo.getProductVo().getProductPrice());
		pieCharList.add(pieChar);
		
		PieChar pieChar2 = new PieChar();
		pieChar2.setName("预计出售价格");
		pieChar2.setValue(businessOpportunityVo.getPreSalesAmount());
		pieCharList.add(pieChar2);
		
		return charData;
	}
/***  /商机分析 /end ***/
}
