package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class PerformanceName implements Serializable{

	private String value;

	public PerformanceName() {
		value = "";
	}

	public PerformanceName(String value) {
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
		return String.format("PerformanceName [value=%s]", value);
	}

	private static final long serialVersionUID = 857141251271265206L;
}
