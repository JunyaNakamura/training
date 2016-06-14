package jp.genuine.training.scheduler.model.performance;

public class EndDate {
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

}
