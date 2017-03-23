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
}
