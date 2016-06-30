package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class ScheduledDate implements Serializable{
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate value;

	public ScheduledDate() {
		value = LocalDate.now();
	}

	public ScheduledDate(LocalDate value) {
		this.value = value;
	}

	public LocalDate getValue() {
		return value;
	}

	public void setValue(LocalDate value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("ScheduledDate [value=%s]", value);
	}


	private static final long serialVersionUID = -3084058618511974392L;
}
