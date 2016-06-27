package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


public class PerformanceId implements Serializable{
	@NotNull
	private Integer value;

	public PerformanceId() {
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

	private static final long serialVersionUID = 3423943690265249702L;
}
