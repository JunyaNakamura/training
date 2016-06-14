package jp.genuine.training.scheduler.model.performance;

public class StartDate {
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


}
