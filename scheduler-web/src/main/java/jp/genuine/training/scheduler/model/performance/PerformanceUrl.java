package jp.genuine.training.scheduler.model.performance;

public class PerformanceUrl {
	private String value;

	public PerformanceUrl() {
		value = "";
	}

	public PerformanceUrl(String value) {
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
		return String.format("PerformanceUrl [value=%s]", value);
	}

}
