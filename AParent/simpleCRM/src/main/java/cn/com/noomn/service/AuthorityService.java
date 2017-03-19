package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.vo.AuthorityVo;
import cn.com.noomn.vo.UserroleAuthorityVo;

public interface AuthorityService {

	/**
	 * 初始化权限表
	 * @return
	 */
	public void initAuthority();
	
	/**
	 * 获取管理员可以设置(员工)的权限
	 * @return
	 */
	public List<AuthorityVo> getAllAuthorityManager(UserroleAuthorityVo userroleAuthorityVo);
	
}
