package cn.com.noomn.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.EmployeeMapper;
import cn.com.noomn.mapper.dao.UserroleMapper;
import cn.com.noomn.mapper.vo.EmployeeVoMapper;
import cn.com.noomn.po.EmployeeExample;
import cn.com.noomn.po.Userrole;
import cn.com.noomn.po.UserroleExample;
import cn.com.noomn.po.EmployeeExample.Criteria;
import cn.com.noomn.service.EmployeeVoService;
import cn.com.noomn.util.Base64ToImg;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.InitXMLResolve;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.EmployeeVo;

@Service
public class EmployeeVoServiceImpl implements EmployeeVoService {

	@Autowired
	private InitXMLResolve initXMLResolve;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private EmployeeVoMapper employeeVoMapper;
	@Autowired
	private UserroleMapper userroleMapper;
	
	@Override
	public Infos initEmployeeVo() {
		//获取管理员角色的id
		UserroleExample userroleExample = new UserroleExample();
		cn.com.noomn.po.UserroleExample.Criteria userroleCriteria = userroleExample.createCriteria();
//		userroleCriteria.andUserroleNameEqualTo("manager");
		userroleCriteria.andUserroleIdEqualTo("10988d26-0986-11e7-b918-28d2444b860a");
		userroleExample.or(userroleCriteria);
		Userrole userRole = userroleMapper.selectByExample(userroleExample).get(0);
		String userroleId = userRole.getUserroleId();
		
		//删除所有管理员
		EmployeeExample employeeExample = new EmployeeExample();
		Criteria deleteCriteria = employeeExample.createCriteria();
		deleteCriteria.andUserroleIdEmployeeEqualTo(userroleId);
		employeeExample.or(deleteCriteria);
		employeeMapper.deleteByExample(employeeExample);
		
		List<EmployeeVo> employeeList = initXMLResolve.getEmployeeXMLByXPathExpression();
		List<String> employeeVoIdList = employeeVoMapper.selectEmployeeVoId();
		int insertCount = 0;
		Iterator<EmployeeVo> iterator = employeeList.iterator();
		while(iterator .hasNext()) {
			EmployeeVo employeeVo = iterator.next();
			boolean isContains = employeeVoIdList.contains(employeeVo.getEmployeeId());
			if(isContains) continue;
			insertCount += employeeMapper.insertSelective(employeeVo);
		}
		Infos infos = Infos.getInfosInstance();
		if(insertCount == employeeList.size()) {
			infos.message = Message.SUCCESS;
			infos.obj = "添加成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "添加成功" + insertCount + "条,添加失败" + (employeeList.size() - insertCount) + "条";
		}
		return infos;
	}

	@Override
	public List<EmployeeVo> getAllEmployeeVo() {
		List<EmployeeVo> employeeVoList = employeeVoMapper.selectRoleRightEmployeeLeftDepartment(null);
		return employeeVoList;
	}

	@Override
	public Infos insertEmployeeVo(EmployeeVo employeeVo) {
		employeeVo.setEmployeePassword("123456");
		employeeVo.setEmployeeId(UUID.randomUUID().toString());
		employeeVo.setEmployeeInit(0);
		Integer num = employeeVoMapper.selectMaxEmployeeNumber();
		if(num == null) {
			num = 0;
		}
		String employeeNumber = ( num + 1) + "" ;
		while(employeeNumber.length() < 4) {
			employeeNumber = "0" + employeeNumber;
		}
		employeeVo.setEmployeeNumber(employeeNumber);
		int insertCount = employeeMapper.insertSelective(employeeVo);
		
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "添加员工成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "添加员工失败，请重试";
		}
		return infos;
	}

	@Override
	public EmployeeVo getOneEmployeeVo(EmployeeVo employeeVo) {
		List<EmployeeVo> employeeVoList = employeeVoMapper.selectRoleRightEmployeeLeftDepartment(employeeVo);
		if(employeeVoList.size() > 0) return employeeVoList.get(0);
		return null;
	}

	@Override
	public Infos updateEmployeeVo(EmployeeVo employeeVo) {
		String employeeImg = employeeVo.getEmployeeImg();
		
		if(employeeImg != null) {
			Base64ToImg.generateImage(employeeImg, employeeVo.getEmployeeImgPath());
		}
		
		int updateCount = employeeMapper.updateByPrimaryKeySelective(employeeVo);
		Infos infos = Infos.getInfosInstance();
		if(updateCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "修改成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "修改失败";
		}
		return infos;
	}

}
