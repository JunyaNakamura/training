package jp.genuine.training.scheduler.model.user;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import jp.genuine.training.scheduler.validation.UnusedUserIdValidator;

public class UserId {

	@Pattern(regexp = "^[0-9a-zA-Z_]*$", message = "半角英数字と_以外は使用しないでください。")
	@Length(min = 5, max = 16)
	@UnusedUserIdValidator
	private String value;

	public UserId() {
		value = "";
	}

	public UserId(String value) {
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
		return String.format("UserId [value=%s]", value);
	}

}
