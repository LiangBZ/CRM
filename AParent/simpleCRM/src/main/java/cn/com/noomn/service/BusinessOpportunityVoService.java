package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.BusinessOpportunityVo;
import cn.com.noomn.vo.CustomVo;

public interface BusinessOpportunityVoService {
	
	/**
	 * 添加一条商机
	 * @return
	 */
	Infos addBusinessOpportunityVo(BusinessOpportunityVo businessOpportunityVo);
	
	/**
	 * 根据跟进人id查询商机
	 * @param customVo
	 * @return
	 */
	List<BusinessOpportunityVo> selectBusinessOpportunityByfollowId(CustomVo customVo);
	
	/**
	 * 通过主键查询商机表、销售阶段表、产品表
	 * @param businessOpportunityVo
	 * @return
	 */
	cn.com.noomn.vo.BusinessOpportunityVo selectBusinessOpportunityVoByPrimaryKey(BusinessOpportunityVo businessOpportunityVo);
	
	/**
	 * 根据更新一条记录
	 * @param businessOpportunityVo
	 * @return
	 */
	Infos updateBusinessOpportunityVo(BusinessOpportunityVo businessOpportunityVo);
	
	/**
	 * 获取商机信息，不包括任务表。通过商机id查询
	 * @param businessOpportunityVo
	 * @return
	 */
	cn.com.noomn.vo.BusinessOpportunityVo selectBusinessOpportunityVoDeatailNoTask(BusinessOpportunityVo businessOpportunityVo);
}
