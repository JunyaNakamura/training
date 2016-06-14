package jp.genuine.training.scheduler.model.performance;

public class VenueUrl {
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

}
