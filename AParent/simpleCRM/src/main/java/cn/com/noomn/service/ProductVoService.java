package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.ProductVo;

public interface ProductVoService {
	
	/**
	 * 添加新产品
	 * @param productVo
	 * @return
	 */
	public Infos addProduct(ProductVo productVo);
	
	/**
	 * 查询产品列表
	 * @param productVo
	 * @return
	 */
	public List<ProductVo> selectProductVoList(ProductVo productVo);
	
	/**
	 * 更新产品信息
	 * @param productVo
	 * @return
	 */
	public Infos updateProduct(ProductVo productVo);
}
