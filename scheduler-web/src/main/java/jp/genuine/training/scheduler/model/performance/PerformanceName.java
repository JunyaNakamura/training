package jp.genuine.training.scheduler.model.performance;

public class PerformanceName {
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

}
