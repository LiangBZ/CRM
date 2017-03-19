package cn.com.noomn.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.noomn.service.AuthorityService;
import cn.com.noomn.service.DepartmentService;
import cn.com.noomn.service.EmployeeVoService;
import cn.com.noomn.service.UserroleAuthorityVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.AuthorityVo;
import cn.com.noomn.vo.DepartmentVo;
import cn.com.noomn.vo.EmployeeVo;
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
}
