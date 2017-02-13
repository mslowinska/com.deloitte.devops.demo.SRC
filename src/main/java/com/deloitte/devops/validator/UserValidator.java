package com.deloitte.devops.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.deloitte.devops.model.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
		
		if(user.getFirstName().length()<2 && user.getFirstName().length()>0) {
			errors.rejectValue("firstName", "Min2.firstName");
		}
		
/*		if(user.getFirstName().)*/
		
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



/*private Pattern pattern;
private Matcher matcher;

private static final String EMAIL_PATTERN =
	"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

public EmailValidator() {
	pattern = Pattern.compile(EMAIL_PATTERN);
}

*//**
 * Validate hex with regular expression
 *
 * @param hex
 *            hex for validation
 * @return true valid hex, false invalid hex
 *//*
public boolean validate(final String hex) {

	matcher = pattern.matcher(hex);
	return matcher.matches();

}*/
