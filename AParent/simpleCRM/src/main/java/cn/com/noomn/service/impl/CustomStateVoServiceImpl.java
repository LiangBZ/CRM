package cn.com.noomn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.CustomStateMapper;
import cn.com.noomn.po.CustomState;
import cn.com.noomn.service.CustomStateVoService;
import cn.com.noomn.util.InitXMLResolve;
import cn.com.noomn.vo.CustomStateVo;

@Service
public class CustomStateVoServiceImpl implements CustomStateVoService {

	@Autowired
	private InitXMLResolve initXMLResolve;
	@Autowired
	private CustomStateMapper customStateMapper;
	
	@Override
	public void initCustomState() {
		List<CustomState> customStateList = customStateMapper.selectByExample(null);
		List<String> customStateIdList = new ArrayList<String>();
		for(int i=0; i<customStateList.size(); i++) {
			customStateIdList.add(customStateList.get(i).getCustomStateId());
		}
		int insertCount = 0;
		List<CustomStateVo> customStateVoList = initXMLResolve.getCustomStateXMLByXPathExpression();
		for(int i=0; i<customStateVoList.size(); i++) {
			CustomStateVo customStateVo = customStateVoList.get(i);
			if(customStateIdList.contains(customStateVo.getCustomStateId())) continue;
			insertCount += customStateMapper.insertSelective(customStateVo);
		}
		System.out.println("插入" + insertCount + "条数据");
	}

}
