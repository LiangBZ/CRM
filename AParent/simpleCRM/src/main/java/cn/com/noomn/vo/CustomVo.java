package cn.com.noomn.vo;

import cn.com.noomn.po.Custom;

public class CustomVo extends Custom {
	private CustomRankVo customRankVo;
	private CustomStateVo customStateVo;

	public CustomRankVo getCustomRankVo() {
		return customRankVo;
	}

	public void setCustomRankVo(CustomRankVo customRankVo) {
		this.customRankVo = customRankVo;
	}

	public CustomStateVo getCustomStateVo() {
		return customStateVo;
	}

	public void setCustomStateVo(CustomStateVo customStateVo) {
		this.customStateVo = customStateVo;
	}

	@Override
	public String toString() {
		return "CustomVo [customRankVo=" + customRankVo + ", customStateVo="
				+ customStateVo + "]";
	}

}
