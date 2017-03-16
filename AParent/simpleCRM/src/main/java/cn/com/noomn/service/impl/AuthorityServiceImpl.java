package cn.com.noomn.service.impl;

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

}
