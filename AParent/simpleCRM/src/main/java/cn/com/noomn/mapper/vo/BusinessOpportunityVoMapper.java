package cn.com.noomn.mapper.vo;

import cn.com.noomn.vo.BusinessOpportunityVo;
import cn.com.noomn.vo.CustomVo;

import java.util.List;

public interface BusinessOpportunityVoMapper {
	
	/**
	 * 根据跟进人查找商机
	 * @return
	 */
	List<cn.com.noomn.vo.BusinessOpportunityVo> selectBusinessOpportunityVoByFollwer(CustomVo customVo);

	/**
	 * 根据主键查询商机（销售阶段表 join 商机表 join 产品表）
	 * @param businessOpportunityVo
	 * @return
	 */
	cn.com.noomn.vo.BusinessOpportunityVo selectBusinessOpportunityVoByPrimaryKey(BusinessOpportunityVo businessOpportunityVo);
	
	/**
	 * 查询商机详情，不包括任务
	 * @param businessOpportunityVo
	 * @return
	 */
	cn.com.noomn.vo.BusinessOpportunityVo selectBusinessOpportunityVoDeatailNoTask(BusinessOpportunityVo businessOpportunityVo);
}