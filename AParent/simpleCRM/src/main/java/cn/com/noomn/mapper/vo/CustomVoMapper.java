package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.vo.CustomVo;

public interface CustomVoMapper {
	
	/**
	 * 获取客户信息，包括客户级别、客户状态
	 * @return
	 */
	List<CustomVo> selectForNimble(CustomVo customVo);
	
	/**
	 * 获取客户的详细信息，包含客户表、客户级别表、客户状态表、商机表、销售阶段表、产品表、员工表
	 * @param customVo
	 * @return
	 */
	List<CustomVo> selectDetailed(CustomVo customVo);
	
}