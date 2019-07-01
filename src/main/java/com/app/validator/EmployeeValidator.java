package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.Employee;
@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Employee e=(Employee)target;
		if(!Pattern.compile("[A-Za-z]{4,6}").matcher(e.getEmname()).matches())
		{
			errors.rejectValue("emname",null, "emnameError");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empgen", "empgenError");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empsal", "empsalError");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empept", "empeptError");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emploc", "emplocError");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empaddr", "empaddrError");	


	}

}
