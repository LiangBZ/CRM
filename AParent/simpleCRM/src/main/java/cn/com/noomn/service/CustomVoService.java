package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.CustomVo;

public interface CustomVoService {
	
	/**
	 * 获取客户列表(客户，客户级别，客户状态)
	 * @return
	 */
	List<CustomVo> getAllCustomVo(CustomVo customVo);
	
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
	
	/**
	 * 获取客户的详细信息，包含客户表、客户级别表、客户状态表、商机表、销售阶段表、产品表、员工表
	 * @param customVo
	 * @return
	 */
	CustomVo selectDetailed(CustomVo customVo);
}
