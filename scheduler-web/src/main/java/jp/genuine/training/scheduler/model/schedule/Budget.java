package jp.genuine.training.scheduler.model.schedule;

public class Budget {
	private Integer value;

	public Budget() {
		value = new Integer(0);
	}

	public Budget(Integer value) {
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
		return String.format("Budget [value=%s]", value);
	}

}
