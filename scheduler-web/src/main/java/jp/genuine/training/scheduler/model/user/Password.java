package jp.genuine.training.scheduler.model.user;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import jp.genuine.training.scheduler.validation.PasswordEqualsValidator;

@PasswordEqualsValidator(field = "value")
public class Password {

	@Pattern(regexp = "^[0-9a-zA-Z_]*$", message = "半角英数字と_以外は使用しないでください。")
	@Length(min = 5, max = 16)
	private String value;

	@Pattern(regexp = "^[0-9a-zA-Z_]*$", message = "半角英数字と_以外は使用しないでください。")
	@Length(min = 5, max = 16)
	private String confirmValue;

	public Password() {
		value = "";
		confirmValue = "";
	}

	public Password(String value, String confirmValue) {
		this.value=value;
		this.confirmValue=confirmValue;
	}

	public String getValue() {
		return value;
	}

	public String getConfirmValue() {
		return confirmValue;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setConfirmValue(String confirmValue) {
		this.confirmValue = confirmValue;
	}

	@Override
	public String toString() {
		return String.format("Password [value=%s, confirmValue=%s]", value, confirmValue);
	}

}
