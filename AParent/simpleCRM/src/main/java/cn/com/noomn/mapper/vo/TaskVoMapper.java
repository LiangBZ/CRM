package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.vo.TaskVo;

public interface TaskVoMapper {
	
	/**
	 * 获取接收到的任务
	 * @param taskVo
	 * @return
	 */
	List<TaskVo> selectReceiveTaskVo(TaskVo taskVo);
}