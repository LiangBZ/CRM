package cn.com.noomn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.ProcessMapper;
import cn.com.noomn.mapper.vo.ProcessVoMapper;
import cn.com.noomn.service.ProcessVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.ProcessVo;

@Service
public class ProcessVoServiceImpl implements ProcessVoService {

	@Autowired
	private ProcessMapper processMapper;
	@Autowired
	private ProcessVoMapper processVoMapper;
	
	@Override
	public List<ProcessVo> selectProcessVo(ProcessVo processVo) {
		List<ProcessVo> processVoList = processVoMapper.selectProcessVo(processVo);
		return processVoList;
	}

	@Override
	public Infos insertProcess(ProcessVo processVo) {
		int insertCount = processMapper.insertSelective(processVo);
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "申请成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "申请失败，请重试";
		}
		return infos;
	}

	@Override
	public Infos updateProcess(ProcessVo processVo) {
		int updateCount = processMapper.updateByPrimaryKeySelective(processVo);
		Infos infos = Infos.getInfosInstance();
		if(updateCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "申请成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "申请失败，请重试";
		}
		return infos;
	}

	@Override
	public List<ProcessVo> selectProcessVoNoOut(ProcessVo processVo) {
		List<ProcessVo> selectProcessVoNoOut = processVoMapper.selectProcessVoNoOut(processVo);
		return selectProcessVoNoOut;
	}

}
