package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class EndDate implements Serializable{

	private String value;

	public EndDate() {
		value = "";
	}

	public EndDate(String value) {
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
		return String.format("EndDate [value=%s]", value);
	}

	private static final long serialVersionUID = -99796780262669284L;
}
