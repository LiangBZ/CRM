package cn.com.noomn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.FeedbackMapper;
import cn.com.noomn.mapper.vo.FeedbackVoMapper;
import cn.com.noomn.po.Feedback;
import cn.com.noomn.po.FeedbackExample;
import cn.com.noomn.po.FeedbackExample.Criteria;
import cn.com.noomn.service.FeedbackVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.vo.FeedbackVo;

@Service
public class FeedbackVoServiceImpl implements FeedbackVoService {

	@Autowired
	private FeedbackMapper feedbackMapper;
	@Autowired
	private FeedbackVoMapper feedbackVoMapper;
	
	@Override
	public List<FeedbackVo> selectFeedbackVoByTaskId(FeedbackVo feedbackVo) {
		List<FeedbackVo> FeedbackVoList = feedbackVoMapper.selectFeedbackVoByTaskId(feedbackVo);
		return FeedbackVoList;
	}

	@Override
	public Infos insertFeedbackVo(FeedbackVo feedbackVo) {
		int insertCount = feedbackMapper.insertSelective(feedbackVo);
		
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "反馈成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "反馈失败";
		}
		
		return infos;
	}

}
