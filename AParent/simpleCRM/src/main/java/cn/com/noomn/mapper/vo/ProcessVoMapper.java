package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.vo.ProcessVo;

public interface ProcessVoMapper {
	
	/**
	 * 根据[外勤id， 申请人，接收人，申请人部门号, 接收人部门号] 查询
	 * @param processVo
	 * @return
	 */
	List<ProcessVo> selectProcessVo(ProcessVo processVo);
	
	/**
	 * 查询不在某个时间出勤的人员
	 * @param time
	 * @return
	 */
	List<ProcessVo> selectProcessVoNoOut(ProcessVo processVo);
}