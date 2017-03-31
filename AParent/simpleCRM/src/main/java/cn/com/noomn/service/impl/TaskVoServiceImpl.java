package cn.com.noomn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.TaskMapper;
import cn.com.noomn.mapper.vo.TaskVoMapper;
import cn.com.noomn.service.TaskVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.TaskVo;

@Service
public class TaskVoServiceImpl implements TaskVoService {

	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private TaskVoMapper taskVoMapper;
	
	@Override
	public Infos insertTaskVo(TaskVo taskVo) {
		int insertCount = taskMapper.insertSelective(taskVo);
		
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "添加任务成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "添加任务失败";
		}
		return infos;
	}

	@Override
	public List<TaskVo> selectReceiveTaskVo(TaskVo taskVo) {
		List<TaskVo> receiveTaskVoList = taskVoMapper.selectReceiveTaskVo(taskVo);
		return receiveTaskVoList;
	}

	@Override
	public List<TaskVo> selectSenderTaskVo(TaskVo taskVo) {
		List<TaskVo> senderTaskVoList = taskVoMapper.selectSenderTaskVo(taskVo);
		return senderTaskVoList;
	}

	@Override
	public Infos updateTaskVo(TaskVo taskVo) {
		int updateCount = taskMapper.updateByPrimaryKeySelective(taskVo);
		
		Infos infos = Infos.getInfosInstance();
		if(updateCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "成功更新任务信息";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "更新任务信息失败";
		}
		return infos;
	}

	@Override
	public List<TaskVo> selectBusinessOpportunitysAllTask(TaskVo taskVo) {
		List<TaskVo> opportunitysAllTask = taskVoMapper.selectBusinessOpportunitysAllTask(taskVo);
		return opportunitysAllTask;
	}

}
