package cn.com.noomn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.CustomRankMapper;
import cn.com.noomn.po.CustomRank;
import cn.com.noomn.service.CustomRankVoService;
import cn.com.noomn.util.InitXMLResolve;
import cn.com.noomn.vo.CustomRankVo;

@Service
public class CustomRankVoServiceImpl implements CustomRankVoService {

	@Autowired
	private InitXMLResolve initXMLResolve;
	@Autowired
	private CustomRankMapper customRankMapper;
	
	@Override
	public void initCustomRank() {
		List<CustomRank> CustomRankList = customRankMapper.selectByExample(null);
		List<String> customRankIdList = new ArrayList<String>();
		for(int i=0; i<CustomRankList.size(); i++) {
			customRankIdList.add(CustomRankList.get(i).getCustomRankId());
		}
		
		List<CustomRankVo> customRankVoList = initXMLResolve.getCustomRankXMLByXPathExpression();
		int insertCount = 0;
		for(int i=0; i<customRankVoList.size(); i++) {
			CustomRankVo customRankVo = customRankVoList.get(i);
			if(customRankIdList.contains(customRankVo.getCustomRankId())) 
				continue;
			insertCount += customRankMapper.insert(customRankVo);
		}
		System.err.println("插入" + insertCount + "条数据");
	}

}
