package cn.com.noomn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.CustomMapper;
import cn.com.noomn.mapper.vo.CustomVoMapper;
import cn.com.noomn.service.CustomVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.CustomVo;

@Service
public class CustomVoServiceImpl implements CustomVoService {

	@Autowired
	private CustomMapper customMapper;
	@Autowired
	private CustomVoMapper customVoMapper;
	
	@Override
	public List<CustomVo> getAllCustomVo(CustomVo customVo) {
		List<CustomVo> customVoList = customVoMapper.selectForNimble(customVo);
		return customVoList;
	}

	@Override
	public List<CustomVo> selectCustomVoList(CustomVo customVo) {
		return customVoMapper.selectForNimble(customVo);
	}

	@Override
	public Infos insertCustomVo(CustomVo customVo) {
		int insertCount = customMapper.insertSelective(customVo);
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "添加客户成功";
		} else {
			infos.message = Message.ERROR;
			infos.obj = "添加失败";
		}
		return infos;
	}

	@Override
	public Infos updateCustomVo(CustomVo customVo) {
		int updateCount = customMapper.updateByPrimaryKeySelective(customVo);
		Infos infos = Infos.getInfosInstance();
		if(updateCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "更新客户信息成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "更新失败";
		}
		return infos;
	}

	@Override
	public CustomVo selectDetailed(CustomVo customVo) {
		List<CustomVo> selectDetailed = customVoMapper.selectDetailed(customVo);
		if(selectDetailed.size() != 0) return selectDetailed.get(0);
		return null;
	}
	
	@Override
	public List<CustomVo> selectDetailedList(CustomVo customVo) {
		return customVoMapper.selectDetailed(customVo);
	}

}
