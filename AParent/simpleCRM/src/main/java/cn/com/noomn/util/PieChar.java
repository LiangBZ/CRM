package cn.com.noomn.util;

import java.math.BigDecimal;

public class PieChar {
	
	private BigDecimal value;
	private String name;
	
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "PieChar [value=" + value + ", name=" + name + "]";
	}
	
}
