package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.TaskVo;

public interface TaskVoService {
	
	/**
	 * 增加一项任务
	 * @param taskVo
	 * @return
	 */
	Infos insertTaskVo(TaskVo taskVo);
	
	/**
	 * 根据接收方查询收到的任务
	 * @param taskVo
	 * @return
	 */
	List<TaskVo> selectReceiveTaskVo(TaskVo taskVo);
	
	/**
	 * 根据发送方查询发布的任务
	 * @param taskVo
	 * @return
	 */
	List<TaskVo> selectSenderTaskVo(TaskVo taskVo);
	
	/**
	 * 更新一条任务
	 * @param taskVo
	 * @return
	 */
	Infos updateTaskVo(TaskVo taskVo);
	
	/**
	 * 获取该商机所有发布的任务
	 * @param taskVo
	 * @return
	 */
	List<TaskVo> selectBusinessOpportunitysAllTask(TaskVo taskVo);
}
