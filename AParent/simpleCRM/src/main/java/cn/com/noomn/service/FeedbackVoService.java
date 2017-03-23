package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.po.Feedback;
import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.FeedbackVo;

public interface FeedbackVoService {

	/**
	 * 根据任务查询反馈记录
	 * @return
	 */
	 List<FeedbackVo> selectFeedbackVoByTaskId(FeedbackVo feedbackVo);
	 
	 /**
	  * 添加一条反馈
	  * @param feedbackVo
	  * @return
	  */
	 Infos insertFeedbackVo(FeedbackVo feedbackVo);
}
