package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class Budget implements Serializable{

	private String value;

	public Budget() {
		value = "";
	}

	public Budget(String value) {
		this.value = value;
	}


	public Integer getIntegerValue(){
		if(value.isEmpty())
			return null;
		return Integer.parseInt(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return String.format("Budget [value=%s]", value);
	}


	private static final long serialVersionUID = 1020787878998492689L;

}
