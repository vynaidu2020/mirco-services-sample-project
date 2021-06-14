package com.spring.cloud.bean;

public class LimitConfiguration {

	private int maximum;
	private int minimum;

	// no-argument constructor
	protected LimitConfiguration() {
	}

	// Generating constructor using fields
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
