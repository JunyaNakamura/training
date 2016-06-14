package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class Budget implements Serializable{

	private Integer value;

	public Budget() {
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
	private static final long serialVersionUID = 1020787878998492689L;

}
