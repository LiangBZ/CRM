package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.vo.AuthorityVo;
import cn.com.noomn.vo.UserroleVo;

public interface AuthorityVoMapper {
	
	/**
	 * 通过主键删除
	 * @param primaryKeys
	 * @return
	 */
	public int deleteAuthorityIfXmlNoExistByPrimaryKeys(String[] primaryKeys);
	
	/**
	 * 查询数据库中存在但XML中不存在的主键
	 * @param primaryKeys
	 * @return
	 */
	public String[] selectAuthorityXMLNoExistByPrimaryKeys(Object[] primaryKeys);
	
	/**
	 * 根据已有的属性查询(Vo属性除外)
	 * @return
	 */
	public List<AuthorityVo> selectForNimble(AuthorityVo authorityVo);
	
	/**
	 * 获取所有的主键
	 * @return
	 */
	public List<String> selectAllPrimaryKey();
	
	/**
	 * 获取管理员可以设置(员工)的权限
	 * @return
	 */
	public List<AuthorityVo> getAllAuthorityManager(List<AuthorityVo> authorityVoList);
	
}