package com.forsfortis.springweb.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return UserVO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name", "Name is Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "error.age", "Age is Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "error.gender", "Gender is Required");
	}

}
