package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

public class TicketPrice implements Serializable{
	@Pattern(regexp = "[0-9]*")
	private String value;

	public TicketPrice() {
		value = "";
	}

	public TicketPrice(String value) {
		this.value = value;
	}


	public String getValue() {
		return value;
	}


	public Integer getIntegerValue(){
		if(value.isEmpty())
			return null;
		return Integer.parseInt(value);
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("TicketPrice [value=%s]", value);
	}

	private static final long serialVersionUID = 9095861961665964422L;

}
