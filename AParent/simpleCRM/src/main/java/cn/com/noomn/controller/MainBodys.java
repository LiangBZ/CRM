package cn.com.noomn.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.noomn.service.DepartmentService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.DepartmentVo;

@Controller
@RequestMapping(value="/mainBodys/")
public class MainBodys {
	
	@Value("${project.url}")
	private String projectURL;
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="loadMainBody")
	private String loadMainBody(String jspURL) {
		return jspURL;
	}
	
	@RequestMapping(value="getTreeJson")
	@ResponseBody
	private String getTreeJson() {
		return departmentService.selectDepartmentJson();
	}
	
	@RequestMapping(value="getDepartmentVoDataArray", produces={"text/html;charset=UTF-8;","application/text;"})
	@ResponseBody
	private String getDepartmentVoDataArray() {
		List<DepartmentVo> departmentList = departmentService.selectDepartmentAndEmployee(null);
		
		StringBuilder dataArrayString = new StringBuilder();
		dataArrayString.append("{").append("\"data\": [");
		for(int i=0; i<departmentList.size(); i++) {
			DepartmentVo departmentVo = departmentList.get(i);
			dataArrayString
				.append("[")
				.append("\"<input type='checkbox' class='checkboxes' data-id=' "+ departmentVo.getDepartmentId() + "' />\",")
				.append("\""+ departmentVo.getDepartmentName() +"\",");
				if(departmentVo.getEmployeeVoList().size() == 0) {
					dataArrayString.append("\"<span class='label label-danger'>"+ departmentVo.getEmployeeVoList().size()+"</span>\",");
				}else if(departmentVo.getEmployeeVoList().size() >0 && departmentVo.getEmployeeVoList().size() < 5){
					dataArrayString.append("\"<span class='label label-success'>"+ departmentVo.getEmployeeVoList().size()+"</span>\",");
				}else {
					dataArrayString.append("\"<span class='label label-inverse'>"+ departmentVo.getEmployeeVoList().size()+"</span>\",");
				}
			dataArrayString
				.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='addEmployee(this);'><i class='icon-plus'></i> 添加</a>\",")
				.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='editDepartment(this,\\\""+ projectURL +"\\\");'><i class='icon-edit'></i> 编辑</a>\",")
				.append("\"<a href='javascript:void(0);' data-id='"+ departmentVo.getDepartmentId() + "' onclick='deleteConfirmWarm(this,\\\""+ projectURL +"/mainBodys/deleteDepartmentVo\\\");'><i class='icon-minus'></i> 删除</a>\"")
				.append("],");
		}
		String substring = dataArrayString.substring(0, dataArrayString.toString().length()-1);
		substring += 
					"]" +
						"}";
		return substring;
	}
	
	@RequestMapping(value="deleteDepartmentVo")
	@ResponseBody
	private Infos deleteDepartmentVo(DepartmentVo departmentVo) {
		Infos infos = departmentService.deleteDepartmentById(departmentVo);
		return infos;
	}
	
	@RequestMapping(value="getDepartmentVoList")
	@ResponseBody
	private List<DepartmentVo> getDepartmentVoList(DepartmentVo departmentVo) {
		List<DepartmentVo> departmentList = departmentService.selectDepartmentList(departmentVo);
		return departmentList;
	}
	
	@RequestMapping(value="updateDepartmentVo")
	@ResponseBody
	private Infos updateDepartmentVo(DepartmentVo departmentVo) {
		return departmentService.updateDepartment(departmentVo);
	}
	
	@RequestMapping(value="insertDepartmentVo")
	@ResponseBody
	private Infos insertDepartmentVo(DepartmentVo departmentVo) {
		departmentVo.setDepartmentId(UUID.randomUUID().toString());
		departmentVo.setDepartmentInit(0);
		return departmentService.insertDepartment(departmentVo);
	}
	
	@RequestMapping(value="deleteDepartmentVoList")
	@ResponseBody
	private Infos deleteDepartmentVoList(@RequestBody List<DepartmentVo> departmentVoList) {
		return departmentService.deleteDepartmentList(departmentVoList);
	}
	
}
