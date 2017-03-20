package cn.com.noomn.mapper.vo;

import cn.com.noomn.vo.ProductVo;

import java.util.List;

public interface ProductVoMapper {
	/**
	 * 动态查询
	 * @param productVo
	 * @return
	 */
	List<ProductVo> selectForNimble(ProductVo productVo);
}