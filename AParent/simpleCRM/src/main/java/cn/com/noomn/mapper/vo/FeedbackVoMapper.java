package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.po.Feedback;
import cn.com.noomn.vo.FeedbackVo;

public interface FeedbackVoMapper {
	
	/**
	 * 根据任务id查询反馈记录
	 * @param feedbackVo
	 * @return
	 */
	List<FeedbackVo> selectFeedbackVoByTaskId(FeedbackVo feedbackVo);
}