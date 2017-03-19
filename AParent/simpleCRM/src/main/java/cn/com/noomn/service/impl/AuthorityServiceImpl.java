package cn.com.noomn.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.AuthorityMapper;
import cn.com.noomn.mapper.vo.AuthorityVoMapper;
import cn.com.noomn.mapper.vo.UserroleAuthorityVoMapper;
import cn.com.noomn.service.AuthorityService;
import cn.com.noomn.util.AuthorityXMLResolveUtil;
import cn.com.noomn.vo.AuthorityVo;
import cn.com.noomn.vo.UserroleAuthorityVo;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityVoMapper authorityVoMapper;
	@Autowired
	private AuthorityMapper authorityMapper;
	@Autowired
	private AuthorityXMLResolveUtil authorityXMLResolveUtil;
	@Autowired
	private UserroleAuthorityVoMapper userroleAuthorityVoMapper;
	
	
	@Override
	public void initAuthority() {
		//获取xml中所有的主键
		List<String> xmlKeysList = authorityXMLResolveUtil.getAllLeafNodeKeysByXPathExpression();
		//查询数据库中不在xml中出现的主键
		String[] primaryKeys = authorityVoMapper.selectAuthorityXMLNoExistByPrimaryKeys(xmlKeysList.toArray());
		//删除过时主键
		if(primaryKeys.length != 0) {
			//删除依赖表数据
			String[] userroleAuthorityIdArray = userroleAuthorityVoMapper.selectUserroleAuthorityId(primaryKeys);
			userroleAuthorityVoMapper.deleteByUserroleAuthorityIdArray(userroleAuthorityIdArray);
			//删除权限表数据
			int deleteCount = authorityVoMapper.deleteAuthorityIfXmlNoExistByPrimaryKeys(primaryKeys);
			if(deleteCount == primaryKeys.length)
				System.err.println("===================" + "删除成功");
		}
		//查询数据库中剩余的主键
		List<String> allPrimaryKey = authorityVoMapper.selectAllPrimaryKey();
		//获取xml中存在的，但数据库中不存在的主键
		for(int i=0; i<allPrimaryKey.size(); i++) {
			if(xmlKeysList.contains(allPrimaryKey.get(i))) 
				xmlKeysList.remove(allPrimaryKey.get(i));
		}
		if(xmlKeysList.size() != 0) {
			//插入XML中存在，但数据库中不存在的记录
			int insertCount = 0;
			for(int i=0; i<xmlKeysList.size(); i++) {
				String XPathExpression = "//key-value[@id='" + xmlKeysList.get(i) + "']";
				AuthorityVo authorityVo = authorityXMLResolveUtil.getAuthorityVoSingleByXPathExpression(XPathExpression);
				int count = authorityMapper.insert(authorityVo);
				insertCount += count;
				System.out.println("插入第" + insertCount +"条记录: " + authorityVo);
			}
			if(insertCount == xmlKeysList.size())
				System.err.println("===================" + "插入成功");
		}
		
		//更新所有权限信息
		Map<String, AuthorityVo> allAuthorityVo = authorityXMLResolveUtil.getAllLeafNodeByXPathExpression();
		Iterator<String> keySetIterator = allAuthorityVo.keySet().iterator();
		int updateFalseCount = 0;
		while(keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			AuthorityVo authorityVo = allAuthorityVo.get(key);
			int count = authorityMapper.updateByPrimaryKey(authorityVo);
			if(count == 0) updateFalseCount += 1;
		}
		if(updateFalseCount > 0) {
			System.err.println("===================" + "更新失败" + updateFalseCount + "条记录");
		}else {
			System.err.println("===================" + "更新成功");
		}
	}

	@Override
	public List<AuthorityVo> getAllAuthorityManager(UserroleAuthorityVo userroleAuthorityVo) {
		String userroleId = userroleAuthorityVo.getUserroleId();
		List<AuthorityVo> authorityVoList = new ArrayList<AuthorityVo>();
		switch(userroleId) {
		case "6566dff0-0987-11e7-b918-28d2444b860a":	//总经理
			AuthorityVo authorityVo = new AuthorityVo();
			authorityVo.setAuthorityId("8699fb77-0ace-11e7-a1cf-28d2444b860a");
			authorityVoList.add(authorityVo);
			AuthorityVo authorityVo8 = new AuthorityVo();
			authorityVo8.setAuthorityId("fb9ccbab-0ac3-11e7-991c-28d2444b860a");
			authorityVoList.add(authorityVo8);
			break;
		case "5e8d627f-0987-11e7-b918-28d2444b860a":	//部门经理
			AuthorityVo authorityVo2 = new AuthorityVo();
			authorityVo2.setAuthorityId("8d1bacfa-0ac3-11e7-991c-28d2444b860a");
			authorityVoList.add(authorityVo2);
			AuthorityVo authorityVo3 = new AuthorityVo();
			authorityVo3.setAuthorityId("8699fb77-0ace-11e7-a1cf-28d2444b860a");
			authorityVoList.add(authorityVo3);
			AuthorityVo authorityVo4 = new AuthorityVo();
			authorityVo4.setAuthorityId("fb9ccbab-0ac3-11e7-991c-28d2444b860a");
			authorityVoList.add(authorityVo4);
			break;	
		case "57695387-0987-11e7-b918-28d2444b860a":	//销售人员
			AuthorityVo authorityVo5 = new AuthorityVo();
			authorityVo5.setAuthorityId("8d1bacfa-0ac3-11e7-991c-28d2444b860a");
			authorityVoList.add(authorityVo5);
			AuthorityVo authorityVo6 = new AuthorityVo();
			authorityVo6.setAuthorityId("8699fb77-0ace-11e7-a1cf-28d2444b860a");
			authorityVoList.add(authorityVo6);
			AuthorityVo authorityVo7 = new AuthorityVo();
			authorityVo7.setAuthorityId("fb9ccbab-0ac3-11e7-991c-28d2444b860a");
			authorityVoList.add(authorityVo7);
			break;	
		}
		List<AuthorityVo> authorityManager = authorityVoMapper.getAllAuthorityManager(authorityVoList);
		
		//查询该角色已有的权限
		List<UserroleAuthorityVo> selectForNimble = userroleAuthorityVoMapper.selectForNimble(userroleAuthorityVo);
		Iterator<UserroleAuthorityVo> iterator = selectForNimble.iterator();
		List<String> authorityIdListHas = new ArrayList<String>();
		while(iterator.hasNext()) {
			UserroleAuthorityVo next = iterator.next();
			authorityIdListHas.add(next.getAuthorityId());
		}
		
		for(int i=0; i<authorityManager.size(); i++) {
			boolean isContains = authorityIdListHas.contains(authorityManager.get(i).getAuthorityId());
			authorityManager.get(i).setContain(isContains);
		}
		
		return authorityManager;
	}

}
