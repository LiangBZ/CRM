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
			if(userroleAuthorityIdArray.length > 0) { 
				userroleAuthorityVoMapper.deleteByUserroleAuthorityIdArray(userroleAuthorityIdArray);
				//删除权限表数据
				int deleteCount = authorityVoMapper.deleteAuthorityIfXmlNoExistByPrimaryKeys(primaryKeys);
				if(deleteCount == primaryKeys.length)
					System.err.println("===================" + "删除成功");
			}
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
		AuthorityVo authorityVo = null;
		String[] notIn = null;
		switch(userroleId) {
		case "6566dff0-0987-11e7-b918-28d2444b860a":	//总经理
			notIn = new String[]{
					"8699fb77-0ace-11e7-a1cf-28d2444b860a", //管理员职务权限修改
					"fb9ccbab-0ac3-11e7-991c-28d2444b860a", //修改总经理权限
					"b7b79e68-0beb-11e7-9e9d-28d2444b860a",	//添加总经理
					"2ff28e74-0c0c-11e7-9e9d-28d2444b860a",	//管理员角色
					"8ee8e7eb-0ca9-11e7-9e9d-28d2444b860a",	//添加产品
					"523c4eee-0d3b-11e7-9e9d-28d2444b860a", //编辑产品
					"06765f5e-0f9e-11e7-8663-28d2444b860a",	//发布任务
					"7584310e-1030-11e7-8663-28d2444b860a",	//收到的任务
					"769c7965-1394-11e7-aa71-28d2444b860a",	//编辑任务
					"a4a35af4-167f-11e7-a0f7-94de80188a22"	//外勤申请
					};	
			for(int i=0; i<notIn.length; i++) {
				authorityVo = new AuthorityVo();
				authorityVo.setAuthorityId(notIn[i]);
				authorityVoList.add(authorityVo);
			}
			break;
		case "5e8d627f-0987-11e7-b918-28d2444b860a":	//部门经理
			notIn = new String[]{
					"346093a3-0a3d-11e7-8d42-28d2444b860a", //添加部门
					"4d8a6d36-0a3d-11e7-8d42-28d2444b860a", //编辑部门
					"6fb1f7c9-0a3d-11e7-8d42-28d2444b860a", //删除部门 
					"8d1bacfa-0ac3-11e7-991c-28d2444b860a", //总经理职务权限
					"8699fb77-0ace-11e7-a1cf-28d2444b860a",	//管理员职务权限
					"fb9ccbab-0ac3-11e7-991c-28d2444b860a",	//修改总经理权限
					"b7b79e68-0beb-11e7-9e9d-28d2444b860a",	//添加总经理
					"2ff28e74-0c0c-11e7-9e9d-28d2444b860a",	//管理员角色
//					"72621594-0d83-11e7-9e9d-28d2444b860a", //选择客户所属部门
					"7584310e-1030-11e7-8663-28d2444b860a", //查看已经收到的任务
					"a4a35af4-167f-11e7-a0f7-94de80188a22",	//外勤申请
					"1102a510-16a9-11e7-a0f7-94de80188a22"	//添加部门经理
					};	
			for(int i=0; i<notIn.length; i++) {
				authorityVo = new AuthorityVo();
				authorityVo.setAuthorityId(notIn[i]);
				authorityVoList.add(authorityVo);
			}
			break;
		case "57695387-0987-11e7-b918-28d2444b860a":	//销售人员
			notIn = new String[]{
					"346093a3-0a3d-11e7-8d42-28d2444b860a", //添加部门
					"4d8a6d36-0a3d-11e7-8d42-28d2444b860a", //编辑部门
					"6fb1f7c9-0a3d-11e7-8d42-28d2444b860a", //删除部门 
					"8d1bacfa-0ac3-11e7-991c-28d2444b860a", //总经理职务权限
					"8699fb77-0ace-11e7-a1cf-28d2444b860a",	//管理员职务权限
					"fb9ccbab-0ac3-11e7-991c-28d2444b860a",	//修改总经理权限
					"b3184bfb-0bfc-11e7-9e9d-28d2444b860a",	//员工入职
					"e23df149-1686-11e7-a0f7-94de80188a22",	//编辑员工信息
					"b7b79e68-0beb-11e7-9e9d-28d2444b860a",	//添加总经理
					"2ff28e74-0c0c-11e7-9e9d-28d2444b860a",	//管理员角色
					"8ee8e7eb-0ca9-11e7-9e9d-28d2444b860a",	//添加产品
					"523c4eee-0d3b-11e7-9e9d-28d2444b860a", //编辑产品
//					"72621594-0d83-11e7-9e9d-28d2444b860a", //选择客户所属部门
					"06765f5e-0f9e-11e7-8663-28d2444b860a",	//发布任务
					"96151773-102f-11e7-8663-28d2444b860a",	//查看已经发布的任务
					"769c7965-1394-11e7-aa71-28d2444b860a",	//编辑任务
					"96dd987b-1138-11e7-8663-28d2444b860a",	//外勤审批
					"1102a510-16a9-11e7-a0f7-94de80188a22"	//添加部门经理
					};	
			for(int i=0; i<notIn.length; i++) {
				authorityVo = new AuthorityVo();
				authorityVo.setAuthorityId(notIn[i]);
				authorityVoList.add(authorityVo);
			}
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
