package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class ScheduledDate implements Serializable{

	private String value;

	public ScheduledDate() {
		value = "";
	}

	public ScheduledDate(String value) {
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
		return String.format("ScheduledDate [value=%s]", value);
	}

	private static final long serialVersionUID = -3084058618511974392L;
}
