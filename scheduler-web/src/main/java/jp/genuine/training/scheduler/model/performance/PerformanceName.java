package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class PerformanceName implements Serializable{
	@NotEmpty
	@Length(min=1,max=20)
	@Pattern(regexp = "^[^\"#$%&'()*+,-./\\:;<=>?@^_`]*$", message = "半角記号は使用しないでください。")
	private String value;

	public PerformanceName() {
		value = "";
	}

	public PerformanceName(String value) {
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
		return String.format("PerformanceName [value=%s]", value);
	}

	private static final long serialVersionUID = 857141251271265206L;
}
