package cn.com.noomn.util;

import java.util.Arrays;

public class LineCharData {

	private Integer[] data = new Integer[5];
	private String[] xAxisData = new String[5];
	
	public Integer[] getData() {
		return data;
	}
	public void setData(Integer[] data) {
		this.data = data;
	}
	public String[] getxAxisData() {
		return xAxisData;
	}
	public void setxAxisData(String[] xAxisData) {
		this.xAxisData = xAxisData;
	}
	@Override
	public String toString() {
		return "LineCharData [data=" + Arrays.toString(data) + ", xAxisData="
				+ Arrays.toString(xAxisData) + "]";
	}
	
}
