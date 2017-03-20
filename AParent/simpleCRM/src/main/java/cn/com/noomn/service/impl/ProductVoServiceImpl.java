package cn.com.noomn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.ProductMapper;
import cn.com.noomn.mapper.vo.ProductVoMapper;
import cn.com.noomn.service.ProductVoService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.util.RandomUtil;
import cn.com.noomn.vo.ProductVo;

@Service
public class ProductVoServiceImpl implements ProductVoService {

	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private ProductVoMapper productVoMapper;
	
	@Override
	public Infos addProduct(ProductVo productVo) {
		String productNum = RandomUtil.getRandomNumber(0, 10000) + "";
		while(productNum.length() < 5) {
			productNum = "0" + productNum;
		}
		productNum = "DX" + productNum;
		productVo.setProductNum(productNum);
		int insertCount = productMapper.insertSelective(productVo);
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "保存产品信息成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "保存失败";
		}
		return infos;
	}

	@Override
	public List<ProductVo> selectProductVoList(ProductVo productVo) {
		List<ProductVo> productVoList = productVoMapper.selectForNimble(productVo);
		return productVoList;
	}

	@Override
	public Infos updateProduct(ProductVo productVo) {
		int updateCount = productMapper.updateByPrimaryKeySelective(productVo);
		Infos infos = Infos.getInfosInstance();
		if(updateCount == 1) {
			infos.message = Message.SUCCESS;
			infos.obj = "产品信息修改成功";
		}else {
			infos.message = Message.ERROR;
			infos.obj = "修改失败";
		}
		return infos;
	}

}
