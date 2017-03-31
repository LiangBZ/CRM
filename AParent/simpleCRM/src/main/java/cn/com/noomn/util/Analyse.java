package cn.com.noomn.util;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import cn.com.noomn.vo.BusinessOpportunityVo;
import cn.com.noomn.vo.FeedbackVo;
import cn.com.noomn.vo.TaskVo;

public class Analyse {
	
	/**
	 * （潜在/销售）成功概率分析
	 * @param businessOpportunityVo
	 * @return
	 */
	public static String AnalyseRatio(BusinessOpportunityVo businessOpportunityVo) {
		int Ratio = 10;
		String result = "";

		Long nowTime = new Date().getTime();
		Long lastTalkingTime = 999999999999999999L;	
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 30);
		long thirtyDay = calendar.getTime().getTime();
		
		List<TaskVo> taskVoList = businessOpportunityVo.getTaskVoList();
		for(int i=0; i<taskVoList.size(); i++) {
			List<FeedbackVo> feedbackVoList = taskVoList.get(i).getFeedbackVo();
			if(feedbackVoList.size() == 0 ) continue;
			for(int j=0; j<feedbackVoList.size(); j++) {
				if(feedbackVoList.get(j).getFeedbackId() == null) continue;
				Long d = nowTime - feedbackVoList.get(j).getFeedbackTime().getTime();
				if(d < lastTalkingTime) lastTalkingTime = d;
			}
		}
		
		String salesStageId = businessOpportunityVo.getSalesStageId();
		if("ddc2e328-0d4b-11e7-9e9d-28d2444b860a".equals(salesStageId)) {	//初步沟通阶段
			
			BigDecimal preSalesAmount = businessOpportunityVo.getPreSalesAmount();	//预期销售金额
			String customRankId = businessOpportunityVo.getCustomVo().getCustomRankId();	//客户类型(大、中、小)
			BigDecimal b16 = new BigDecimal(1000000); 	//一百万
			BigDecimal b56 = new BigDecimal(5000000); 	//五百万
			BigDecimal b17 = new BigDecimal(10000000); 	//一千万
			
			switch(customRankId) {
				case "84084e44-0d45-11e7-9e9d-28d2444b860a": {	//小型客户
						int compareTo = preSalesAmount.compareTo(b16);	
						if(compareTo >= 0){ 	//预期大于一百万
							Ratio -= 8;
						}else { 
							Ratio += 5;
						}
						
						if(lastTalkingTime < thirtyDay){ 
							Ratio += 5;
						} else {
							Ratio -= 5;
						}
						break;
					}
				case "8ac12910-0d45-11e7-9e9d-28d2444b860a":  {	//中型客户
						int compareTo = preSalesAmount.compareTo(b56);	//预期大于五百万
						if(compareTo >= 0){ 
							Ratio -= 8;
						}else { 
							Ratio += 5;
						}
						
						if(lastTalkingTime < thirtyDay){ 	//上次沟通大于30天
							Ratio += 5;
						} else {
							Ratio -= 5;
						}
						break;
					}
				case "8efeffc1-0d45-11e7-9e9d-28d2444b860a": {	//大型客户
						int compareTo = preSalesAmount.compareTo(b17);	//预期大于一千万
						if(compareTo >= 0){ 
							Ratio -= 8;
						}else { 
							Ratio += 5;
						}
						
						if(lastTalkingTime < thirtyDay){ 	//上次沟通大于30天
							Ratio += 5;
						} else {
							Ratio -= 5;
						}
						break;
					}
			}
			
			if(Ratio > 7) result = "☆☆☆☆☆"; 
			else if(Ratio > 5) result = "☆☆☆☆"; 
			else if(Ratio > 2) result = "☆☆☆"; 
			else if(Ratio > 0) result = "☆☆"; 
			else if(Ratio > -2) result = "☆"; 
			else result = "☆"; 
			
		}else {	//销售阶段
			Ratio = 0;
			for(int i=0; i<taskVoList.size(); i++) {
				List<FeedbackVo> feedbackVoList = taskVoList.get(i).getFeedbackVo();
				for(int j=0; j<feedbackVoList.size(); j++) {
					if(feedbackVoList.get(j).getFeedbackId() != null) 
						Ratio += 1;
				}
			}
			
			if(lastTalkingTime < thirtyDay){ 
				Ratio += 2;
			} else {
				Ratio -= 5;
			}
			
			if(Ratio > 7) result = "☆☆☆☆☆"; 
			else if(Ratio > 5) result = "☆☆☆☆"; 
			else if(Ratio > 2) result = "☆☆☆"; 
			else if(Ratio > 0) result = "☆☆"; 
			else if(Ratio > -2) result = "☆"; 
			else result = "☆"; 
		}
		return result;
	}
	
	/**
	 * 线型分析
	 * @param businessOpportunityVo
	 * @return
	 */
	public static LineCharData getLineCharData(BusinessOpportunityVo businessOpportunityVo) {
		Long nowTime = new Date().getTime();
		//去除位数
		nowTime = StringToTimestamp.formStringToLong(StringToTimestamp.fromLongToString(nowTime, "yyyy-MM-dd"), "yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		long sevenDaysAgo  = calendar.getTime().getTime();
		calendar.add(Calendar.DATE, -7);
		long fourteenDaysAgo  = calendar.getTime().getTime();
		calendar.add(Calendar.DATE, -7);
		long twentyOneDaysAgo  = calendar.getTime().getTime();
		calendar.add(Calendar.DATE, -7);
		long twentyEightDaysAgo  = calendar.getTime().getTime();
		calendar.add(Calendar.DATE, -7);
		long thirtyFiveDaysAgo  = calendar.getTime().getTime();
		
		LineCharData lineCharData = new LineCharData();
		Integer[] data = lineCharData.getData();
		for(int i=0; i<data.length; i++) {
			data[i] = 0;
		}
		String[] getxAxisData = lineCharData.getxAxisData();
		getxAxisData[4] = StringToTimestamp.fromLongToString(nowTime, "yyyy-MM-dd");
		getxAxisData[3] = StringToTimestamp.fromLongToString(sevenDaysAgo, "yyyy-MM-dd");
		getxAxisData[2] = StringToTimestamp.fromLongToString(fourteenDaysAgo, "yyyy-MM-dd");
		getxAxisData[1] = StringToTimestamp.fromLongToString(twentyOneDaysAgo, "yyyy-MM-dd");
		getxAxisData[0] = StringToTimestamp.fromLongToString(twentyEightDaysAgo, "yyyy-MM-dd");
		
		List<TaskVo> taskVoList = businessOpportunityVo.getTaskVoList();
		for(int i=0; i<taskVoList.size(); i++) {
			TaskVo taskVo = taskVoList.get(i);
			if(taskVo.getTaskId() == null) continue;
			List<FeedbackVo> feedbackVoList = taskVo.getFeedbackVo();
			for(int j=0; j<feedbackVoList.size(); j++) {
				FeedbackVo feedbackVo = feedbackVoList.get(j);
				if(feedbackVo.getFeedbackId() == null) continue;
				long time = feedbackVo.getFeedbackTime().getTime();
				
				if(time <= nowTime && time >= sevenDaysAgo) {
					data[4] += 1;
				}else if(time < sevenDaysAgo && time >= fourteenDaysAgo) {
					data[3] += 1;
				}else if(time < fourteenDaysAgo && time >= twentyOneDaysAgo) {
					data[2] += 1;
				}else if(time < twentyOneDaysAgo && time >= twentyEightDaysAgo) {
					data[1] += 1;
				}else if(time < twentyEightDaysAgo && time >= thirtyFiveDaysAgo) {
					data[0] += 1;
				}
			}
		}
		
		return lineCharData;
	}
	
}
