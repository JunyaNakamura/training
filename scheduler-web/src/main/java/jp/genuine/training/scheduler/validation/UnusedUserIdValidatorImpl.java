package jp.genuine.training.scheduler.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import jp.genuine.training.scheduler.service.user.UserRegisterService;

public class UnusedUserIdValidatorImpl implements ConstraintValidator<UnusedUserIdValidator, String> {

	@Autowired
	UserRegisterService service;

	@Override
	public void initialize(UnusedUserIdValidator constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		return service.isUnusedUserId(value);
	}

}
