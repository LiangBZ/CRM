package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.CustomVo;

public interface CustomVoService {
	
	/**
	 * 获取客户列表(客户，客户级别，客户状态)
	 * @return
	 */
	List<CustomVo> getAllCustomVo();
	
	/**
	 * 查询客户
	 * @param customVo
	 * @return
	 */
	List<CustomVo> selectCustomVoList(CustomVo customVo);
	
	/**
	 * 添加客户
	 * @param customVo
	 * @return
	 */
	Infos insertCustomVo(CustomVo customVo);
	
	/**
	 * 更新客户信息
	 * @param customVo
	 * @return
	 */
	Infos updateCustomVo(CustomVo customVo);
}
