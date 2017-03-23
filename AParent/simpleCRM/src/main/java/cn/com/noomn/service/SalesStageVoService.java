package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.vo.SalesStageVo;

public interface SalesStageVoService {

	/**
	 * 初始化销售阶段表
	 */
	void initSalesStageVo();
	
	/**
	 * 查询后续销售阶段，包括当前阶段
	 * @param salesStageVo
	 * @return
	 */
	public List<SalesStageVo> selectUpOrZeroSalesStageVo(SalesStageVo salesStageVo);
}
