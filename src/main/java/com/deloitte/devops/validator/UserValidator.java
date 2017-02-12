package com.deloitte.devops.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.deloitte.devops.model.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		System.out.println("Inside Validator");
		
		if(user.getFirstName().isEmpty()) {
			errors.rejectValue("firstName", "NotEmpty.firstName");	
		}
		
		if(user.getLastName().isEmpty()) {
			errors.rejectValue("lastName", "NotEmpty.lastName");	
		}
		
		if(user.getEmail().isEmpty()) {
			errors.rejectValue("email", "NotEmpty.email");	
		}
		
		if(user.getAddress1().isEmpty()) {
			errors.rejectValue("address1", "NotEmpty.address1");	
		}
		
//		if(user.getAddress2().isEmpty()) {
//			errors.rejectValue("address2", "NotEmpty.address2");	
//		}
		
		if(user.getPostcode().isEmpty()) {
			errors.rejectValue("postcode", "NotEmpty.postcode");	
		}
		
		if(user.getCity().isEmpty()) {
			errors.rejectValue("city", "NotEmpty.city");	
		}
		
		if(user.getNameCard().isEmpty()) {
			errors.rejectValue("nameCard", "NotEmpty.nameCard");	
		}
		
//		if(user.getNumberCard().isEmpty()) {
//			errors.rejectValue("numberCard", "NotEmpty.numberCard");	
//		}
	
		if(user.getExpiryDate().isEmpty()) {
			errors.rejectValue("expiryDate", "NotEmpty.expiryDate");	
		}
//		if(user.getSecurityCard().isEmpty()) {
//			errors.rejectValue("securityCard", "NotEmpty.securityCard");	
//		}
		
		
	}
}
