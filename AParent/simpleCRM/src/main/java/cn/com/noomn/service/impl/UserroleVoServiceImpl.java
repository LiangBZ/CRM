package cn.com.noomn.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.AuthorityMapper;
import cn.com.noomn.mapper.dao.EmployeeMapper;
import cn.com.noomn.mapper.dao.UserroleAuthorityMapper;
import cn.com.noomn.mapper.dao.UserroleMapper;
import cn.com.noomn.mapper.vo.EmployeeVoMapper;
import cn.com.noomn.mapper.vo.UserroleVoMapper;
import cn.com.noomn.po.Authority;
import cn.com.noomn.po.AuthorityExample;
import cn.com.noomn.po.Employee;
import cn.com.noomn.po.EmployeeExample;
import cn.com.noomn.po.Userrole;
import cn.com.noomn.po.UserroleAuthority;
import cn.com.noomn.po.UserroleExample;
import cn.com.noomn.po.UserroleExample.Criteria;
import cn.com.noomn.service.UserroleVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.InitXMLResolve;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.EmployeeVo;
import cn.com.noomn.vo.UserroleVo;

@Service
public class UserroleVoServiceImpl implements UserroleVoService {
	
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
	private InitXMLResolve initXMLResolve;

	@Override
	public Infos initUserroleVo() {
		List<UserroleVo> userroleVoList = initXMLResolve.getUserroleXMLByXPathExpression();
		List<String> userroleIds = userroleVoMapper.selectUserroleId();
		int insertCount = 0;
		Iterator<UserroleVo> iterator = userroleVoList.iterator();
		while(iterator.hasNext()) {
			UserroleVo userroleVo = iterator.next();
			boolean isContains = userroleIds.contains(userroleVo.getUserroleId());
			if(isContains) continue;
			insertCount += userroleMapper.insertSelective(userroleVo);
		}
		Infos infos = Infos.getInfosInstance();
		if(insertCount == userroleVoList.size()) {
			infos.setMessage(Message.SUCCESS);
			infos.setObj("添加成功");
			return infos;
		}else {
			infos.setMessage(Message.WARN);
			infos.setObj("添加成功"+ insertCount + "条，添加失败" + (userroleVoList.size()-insertCount) + "条");
			return infos;
		}
	}

}
