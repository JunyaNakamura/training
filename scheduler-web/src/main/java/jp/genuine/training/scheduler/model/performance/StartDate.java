package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class StartDate implements Serializable{

	private String value;

	public StartDate() {
		value = "";
	}

	public StartDate(String value) {
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
		return String.format("StartDate [value=%s]", value);
	}

	private static final long serialVersionUID = 2197579183735290271L;

}
