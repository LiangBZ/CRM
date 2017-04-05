package cn.com.noomn.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.AuthorityMapper;
import cn.com.noomn.mapper.dao.EmployeeMapper;
import cn.com.noomn.mapper.dao.UserroleAuthorityMapper;
import cn.com.noomn.mapper.dao.UserroleMapper;
import cn.com.noomn.mapper.vo.EmployeeVoMapper;
import cn.com.noomn.mapper.vo.UserroleAuthorityVoMapper;
import cn.com.noomn.mapper.vo.UserroleVoMapper;
import cn.com.noomn.po.Authority;
import cn.com.noomn.po.Employee;
import cn.com.noomn.po.EmployeeExample;
import cn.com.noomn.po.Userrole;
import cn.com.noomn.po.UserroleAuthority;
import cn.com.noomn.po.UserroleAuthorityExample;
import cn.com.noomn.po.UserroleExample;
import cn.com.noomn.po.UserroleExample.Criteria;
import cn.com.noomn.service.UserroleAuthorityVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.InitXMLResolve;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.UserroleAuthorityVo;
import cn.com.noomn.vo.UserroleVo;

@Service
public class UserroleAuthorityVoServiceImpl implements UserroleAuthorityVoService {

	@Autowired
	private UserroleMapper userroleMapper;
	@Autowired
	private UserroleVoMapper userroleVoMapper;
	@Autowired
	private AuthorityMapper authorityMapper;
	@Autowired
	private EmployeeVoMapper employeeVoMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private UserroleAuthorityMapper userroleAuthorityMapper;
	@Autowired
	private UserroleAuthorityVoMapper userroleAuthorityVoMapper;
	
	@Autowired
	private InitXMLResolve initXMLResolve;
	
	@Override
	public Infos initUserroleAuthorityVo() {
		//获取所有权限
		List<Authority> authorityList = authorityMapper.selectByExample(null);

		//获取管理员角色的id
		UserroleExample userroleExample = new UserroleExample();
		Criteria criteria = userroleExample.createCriteria();
		criteria.andUserroleIdEqualTo("10988d26-0986-11e7-b918-28d2444b860a");
		userroleExample.or(criteria);
		Userrole userRole = userroleMapper.selectByExample(userroleExample).get(0);
		String userroleId = userRole.getUserroleId();
		
		//获取管理员角色的员工
		EmployeeExample employeeExample = new EmployeeExample();
		cn.com.noomn.po.EmployeeExample.Criteria employeeCriteria = employeeExample.createCriteria();
		employeeCriteria.andUserroleIdEmployeeEqualTo(userroleId);
		employeeExample.or(employeeCriteria);
		List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
		
		//删除所有管理员的所有权限
		UserroleAuthorityExample deleteExample = new UserroleAuthorityExample();
		cn.com.noomn.po.UserroleAuthorityExample.Criteria deleteCriteria = deleteExample.createCriteria();
		deleteCriteria.andUserroleIdEqualTo(userroleId);
		deleteExample.or(deleteCriteria);
		userroleAuthorityMapper.deleteByExample(deleteExample);
		
		//为管理员添加所有权限
		Iterator<Employee> iterator = employeeList.iterator();
		int insertCount = 0;
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			
			for(int i=0; i<authorityList.size(); i++) {
				if("06765f5e-0f9e-11e7-8663-28d2444b860a".equals(authorityList.get(i).getAuthorityId())) continue;
				if("7584310e-1030-11e7-8663-28d2444b860a".equals(authorityList.get(i).getAuthorityId())) continue;
				if("96dd987b-1138-11e7-8663-28d2444b860a".equals(authorityList.get(i).getAuthorityId())) continue;
				if("769c7965-1394-11e7-aa71-28d2444b860a".equals(authorityList.get(i).getAuthorityId())) continue;
				if("a4a35af4-167f-11e7-a0f7-94de80188a22".equals(authorityList.get(i).getAuthorityId())) continue;
				UserroleAuthority userroleAuthority = new UserroleAuthority();
				userroleAuthority.setUserroleAuthorityId(UUID.randomUUID().toString());
				userroleAuthority.setAuthorityId(authorityList.get(i).getAuthorityId());
				userroleAuthority.setUserroleId(employee.getUserroleIdEmployee());
				insertCount += userroleAuthorityMapper.insertSelective(userroleAuthority);
			}
		}
		
		Infos infos = Infos.getInfosInstance();
		if(insertCount == (employeeList.size() * authorityList.size())) {
			infos.setMessage(Message.SUCCESS);
			infos.setObj("添加成功");
		}else {
			infos.setMessage(Message.WARN);
			infos.setObj("添加成功"+ insertCount + "条，添加失败" + ((employeeList.size() * authorityList.size())-insertCount) + "条");
		}
		return infos;
	}

	@Override
	public List<UserroleAuthorityVo> selectUserroleAuthorityVo(UserroleAuthorityVo userroleAuthorityVo) {
		List<UserroleAuthorityVo> UserroleAuthorityVoList = userroleAuthorityVoMapper.selectForNimble(userroleAuthorityVo);
		return UserroleAuthorityVoList;
	}

	@Override
	public Map<String, String> selectAuthorityToMap(UserroleAuthorityVo userroleAuthorityVo) {
		List<UserroleAuthorityVo> UserroleAuthorityVoList = userroleAuthorityVoMapper.selectForNimble(userroleAuthorityVo);
		Map<String, String> authorityMap = new HashMap<String, String>();
		for(int i=0; i<UserroleAuthorityVoList.size(); i++) {
			UserroleAuthorityVo UserroleAuthorityVo = UserroleAuthorityVoList.get(i);
			String key = UserroleAuthorityVo.getAuthorityId();
			String value = "1";
			authorityMap.put(key, value);
		}
		return authorityMap;
	}

	@Override
	public Infos updateUserroleAuthorityVo(List<UserroleAuthorityVo> userroleAuthorityVoList, UserroleVo userroleVo) {
		//删除该角色所有权限
		UserroleAuthorityExample deleteExample = new UserroleAuthorityExample();
		cn.com.noomn.po.UserroleAuthorityExample.Criteria deleteCriteria = deleteExample.createCriteria();
		deleteCriteria.andUserroleIdEqualTo(userroleVo.getUserroleId());
		deleteExample.or(deleteCriteria);
		userroleAuthorityMapper.deleteByExample(deleteExample);
		
		Infos infos = Infos.getInfosInstance();
		if(userroleAuthorityVoList.size() == 1 && userroleAuthorityVoList.get(0).getAuthorityId() == null) {
			infos.message = Message.SUCCESS;
			infos.obj = "权限设置成功";
			return infos;
		}
		
		Iterator<UserroleAuthorityVo> iterator = userroleAuthorityVoList.iterator();
		int insertCount = 0;
		while(iterator.hasNext()) {
			UserroleAuthorityVo userroleAuthorityVo = iterator.next();
			userroleAuthorityVo.setUserroleAuthorityId(UUID.randomUUID().toString());
			insertCount += userroleAuthorityMapper.insert(userroleAuthorityVo);
		}
		
		infos = Infos.getInfosInstance();
		if(insertCount == userroleAuthorityVoList.size()) {
			infos.message = Message.SUCCESS;
			infos.obj = "权限设置成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "权限设置失败";
		}
		return infos;
	}



	
}
