package com.example.demo.model;

public class Limits {
	private Integer max;
	private Integer min;
	
	public Limits(Integer max, Integer min) {
		super();
		this.max = max;
		this.min = min;
	}
	
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	
	
}
