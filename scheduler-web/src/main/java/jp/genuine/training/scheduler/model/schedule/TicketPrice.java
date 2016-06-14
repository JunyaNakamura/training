package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class TicketPrice implements Serializable{

	private Integer value;

	public TicketPrice() {
	}

	public TicketPrice(Integer value) {
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
		return String.format("TicketPrice [value=%s]", value);
	}
	private static final long serialVersionUID = 9095861961665964422L;

}
