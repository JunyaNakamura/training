package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class VenueName implements Serializable{

	private String value;

	public VenueName() {
		value = "";
	}

	public VenueName(String value) {
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
		return String.format("VenueName [value=%s]", value);
	}

	private static final long serialVersionUID = -5750274602902900122L;

}
