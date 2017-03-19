package cn.com.noomn.mapper.vo;

import java.util.List;

public interface UserroleVoMapper {
	
	/**
	 * 查询已经存在的主键
	 * @param userroleVoList
	 * @return
	 */
	List<String> selectUserroleId();
}