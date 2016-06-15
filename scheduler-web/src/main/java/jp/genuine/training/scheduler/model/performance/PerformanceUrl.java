package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class PerformanceUrl implements Serializable{

	private String value;

	public PerformanceUrl() {
		value = "";
	}

	public PerformanceUrl(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("PerformanceUrl [value=%s]", value);
	}

	private static final long serialVersionUID = 7439625526288908300L;
}
