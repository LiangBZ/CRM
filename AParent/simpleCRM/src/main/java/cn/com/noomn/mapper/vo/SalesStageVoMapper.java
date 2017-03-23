package cn.com.noomn.mapper.vo;

import cn.com.noomn.vo.SalesStageVo;

import java.util.List;


public interface SalesStageVoMapper {
	/**
	 * 查询后续销售阶段，包括当前阶段
	 * @param salesStageVo
	 * @return
	 */
	List<SalesStageVo> selectUpOrZeroSalesStageVo(SalesStageVo salesStageVo);
}