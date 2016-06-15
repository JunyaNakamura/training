package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class StartTime implements Serializable{

	private String value;

	public StartTime() {
		value = "";
	}

	public StartTime(String value) {
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
		return String.format("StartTime [value=%s]", value);
	}
	private static final long serialVersionUID = 7966960361119115551L;

}
