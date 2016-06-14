package jp.genuine.training.scheduler.model.schedule;

public class TicketPrice {
	private Integer value;

	public TicketPrice() {
		value = new Integer(0);
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


}
