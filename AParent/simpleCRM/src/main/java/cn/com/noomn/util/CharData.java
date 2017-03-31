package cn.com.noomn.util;

import java.util.ArrayList;
import java.util.List;

public class CharData {

	private LineCharData lineCharData;
	private List<PieChar> pieCharList = new ArrayList<PieChar>();
	
	public LineCharData getLineCharData() {
		return lineCharData;
	}
	public void setLineCharData(LineCharData lineCharData) {
		this.lineCharData = lineCharData;
	}
	public List<PieChar> getPieCharList() {
		return pieCharList;
	}
	public void setPieCharList(List<PieChar> pieCharList) {
		this.pieCharList = pieCharList;
	}
	@Override
	public String toString() {
		return "CharData [lineCharData=" + lineCharData + ", pieCharList="
				+ pieCharList + "]";
	}

}
