package jp.genuine.training.scheduler.model.schedule;

public class Memo {
	private String value;

	public Memo() {
		value = "";
	}

	public Memo(String value) {
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
		return String.format("Memo [value=%s]", value);
	}


}
