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
	/**
	 * 
	 * 获取发布的任务
	 * @param taskVo
	 * @return
	 */
	List<TaskVo> selectSenderTaskVo(TaskVo taskVo);
	
	/**
	 * 获取该商机所有发布的任务
	 * @param taskVo
	 * @return
	 */
	List<TaskVo> selectBusinessOpportunitysAllTask(TaskVo taskVo);
}