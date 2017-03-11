package cn.com.noomn.mapper.vo;

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
}