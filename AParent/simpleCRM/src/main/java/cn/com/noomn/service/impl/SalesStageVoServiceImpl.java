package cn.com.noomn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.SalesStageMapper;
import cn.com.noomn.mapper.vo.SalesStageVoMapper;
import cn.com.noomn.po.SalesStage;
import cn.com.noomn.service.SalesStageVoService;
import cn.com.noomn.util.InitXMLResolve;
import cn.com.noomn.vo.SalesStageVo;

@Service
public class SalesStageVoServiceImpl implements SalesStageVoService {

	@Autowired
	private InitXMLResolve initXMLResolve;
	@Autowired
	private SalesStageMapper salesStageMapper;
	@Autowired
	private SalesStageVoMapper salesStageVoMapper;
	
	@Override
	public void initSalesStageVo() {
		List<SalesStage> salesStageList = salesStageMapper.selectByExample(null);
		List<String> salesStageIdList = new ArrayList<String>();
		for(int i=0; i<salesStageList.size(); i++) {
			SalesStage salesStage = salesStageList.get(i);
			salesStageIdList.add(salesStage.getSalesStageId());
		}
		int insertCount = 0;
		List<SalesStageVo> salesStageVoList = initXMLResolve.getSalesStageXMLByXPathExpression();
		for(int i=0; i<salesStageVoList.size(); i++) {
			SalesStageVo salesStageVo = salesStageVoList.get(i);
			if(salesStageIdList.contains(salesStageVo.getSalesStageId())) continue;
			insertCount += salesStageMapper.insertSelective(salesStageVo);
		}
		System.err.println("插入" + insertCount + "条数据");
	}

	@Override
	public List<SalesStageVo> selectUpOrZeroSalesStageVo(
			SalesStageVo salesStageVo) {
		List<SalesStageVo> selectUpOrZeroSalesStageVo = salesStageVoMapper.selectUpOrZeroSalesStageVo(salesStageVo);
		return selectUpOrZeroSalesStageVo;
	}

}
