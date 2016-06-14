package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class VenueUrl implements Serializable{

	private String value;

	public VenueUrl() {
		value = "";
	}

	public VenueUrl(String value) {
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
		return String.format("VenueUrl [value=%s]", value);
	}

	private static final long serialVersionUID = 5556849021391668343L;

}
