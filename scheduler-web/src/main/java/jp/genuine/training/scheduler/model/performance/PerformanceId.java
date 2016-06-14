package jp.genuine.training.scheduler.model.performance;

public class PerformanceId {
	private Integer value;

	public PerformanceId() {
		value = new Integer(0);
	}

	public PerformanceId(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("PerformanceId [value=%s]", value);
	}

}
