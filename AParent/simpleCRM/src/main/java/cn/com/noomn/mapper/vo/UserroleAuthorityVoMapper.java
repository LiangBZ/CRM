package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.vo.UserroleAuthorityVo;


public interface UserroleAuthorityVoMapper {
	
	/**
	 * 根据权限ID获取UserroleAuthorityId
	 * @param authorityIdArray
	 * @return
	 */
	String[] selectUserroleAuthorityId(Object[] authorityIdArray);
	
	/**
	 * 通过主键数组删除记录
	 * @param userroleAuthorityId
	 * @return
	 */
	int deleteByUserroleAuthorityIdArray(Object[] userroleAuthorityId);
	
	/**
	 * 根据已有属性查询
	 * @param userroleAuthorityVo
	 * @return
	 */
	List<UserroleAuthorityVo> selectForNimble(UserroleAuthorityVo userroleAuthorityVo);
	
}