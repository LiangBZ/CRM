package cn.com.noomn.service;

import java.util.List;
import java.util.Map;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.UserroleAuthorityVo;
import cn.com.noomn.vo.UserroleVo;

public interface UserroleAuthorityVoService {
	
	/**
	 * 初始化 "角色-权限" 表
	 * @return
	 */
	Infos initUserroleAuthorityVo();
	
	/**
	 * 查询UserroleAuthorityVo列表
	 * @return
	 */
	List<UserroleAuthorityVo> selectUserroleAuthorityVo(UserroleAuthorityVo userroleAuthorityVo);
	
	/**
	 * 查询UserroleAuthorityVo列表，并将其转化为键值对。key：权限id，value：1
	 * @return
	 */
	Map<String, String> selectAuthorityToMap(UserroleAuthorityVo userroleAuthorityVo);

	/**
	 * 更新角色权限
	 * @param userroleAuthorityVoList
	 * @return
	 */
	Infos updateUserroleAuthorityVo(List<UserroleAuthorityVo> userroleAuthorityVoList,UserroleVo userroleVo);
}
