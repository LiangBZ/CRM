package cn.com.noomn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.BusinessOpportunityMapper;
import cn.com.noomn.mapper.vo.BusinessOpportunityVoMapper;
import cn.com.noomn.mapper.vo.CustomVoMapper;
import cn.com.noomn.service.BusinessOpportunityVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.BusinessOpportunityVo;
import cn.com.noomn.vo.CustomVo;

@Service
public class BusinessOpportunityVoServiceImpl implements BusinessOpportunityVoService {

	@Autowired
	private BusinessOpportunityMapper businessOpportunityMapper;
	@Autowired
	private BusinessOpportunityVoMapper businessOpportunityVoMapper;
	@Autowired
	private CustomVoMapper customVoMapper;
	
	@Override
	public Infos addBusinessOpportunityVo(
			cn.com.noomn.vo.BusinessOpportunityVo businessOpportunityVo) {
		int insertCount = businessOpportunityMapper.insertSelective(businessOpportunityVo);
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "成功添加一个商机";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "添加失败";
		}
		return infos;
	}

	@Override
	public List<BusinessOpportunityVo> selectBusinessOpportunityByfollowId(CustomVo customVo) {
		List<BusinessOpportunityVo> selectBusinessOpportunityVoByFollwer = businessOpportunityVoMapper.selectBusinessOpportunityVoByFollwer(customVo);
		return selectBusinessOpportunityVoByFollwer;
	}

	@Override
	public BusinessOpportunityVo selectBusinessOpportunityVoByPrimaryKey(
			BusinessOpportunityVo businessOpportunityVo) {
		businessOpportunityVo = businessOpportunityVoMapper.selectBusinessOpportunityVoByPrimaryKey(businessOpportunityVo);
		return businessOpportunityVo;
	}

	@Override
	public Infos updateBusinessOpportunityVo(
			BusinessOpportunityVo businessOpportunityVo) {
		int updateCount = businessOpportunityMapper.updateByPrimaryKeySelective(businessOpportunityVo);
		
		Infos infos = Infos.getInfosInstance();
		if(updateCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "保存成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "保存失败";
		}
		return infos;
	}

	@Override
	public BusinessOpportunityVo selectBusinessOpportunityVoDeatailNoTask(
			BusinessOpportunityVo businessOpportunityVo) {
		businessOpportunityVo = businessOpportunityVoMapper.selectBusinessOpportunityVoDeatailNoTask(businessOpportunityVo);
		return businessOpportunityVo;
	}

}
