package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.vo.CustomVo;

public interface CustomVoMapper {
	
	/**
	 * 获取客户信息，包括客户级别、客户状态
	 * @return
	 */
	List<CustomVo> selectForNimble(CustomVo customVo);
}