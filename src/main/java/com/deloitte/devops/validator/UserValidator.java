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
		
		
		if(user.getPostcode().isEmpty()) {
			errors.rejectValue("postcode", "NotEmpty.postcode");	
		}
		
		if(user.getCity().isEmpty()) {
			errors.rejectValue("city", "NotEmpty.city");	
		}
		
		if(user.getNameCard().isEmpty()) {
			errors.rejectValue("nameCard", "NotEmpty.nameCard");	
		}
		
		/*Card number not empty and 16 digits no spaces*/
		if(user.getNumberCard().isEmpty()) {
			errors.rejectValue("numberCard", "NotEmpty.numberCard");	
		}
		
		if(user.getNumberCard().matches("[0-9]{16}")==false) {
			errors.rejectValue("numberCard", "Valid.numberCard");	
		}
		
/*		Expiry Date - not empty and DD/MM format*/
		if(user.getExpiryDate().isEmpty()) {
			errors.rejectValue("expiryDate", "NotEmpty.expiryDate");	
		}
	
		if(user.getExpiryDate().isEmpty()==false && user.getExpiryDate().matches("[0-9]{2}\\/[0-9]{2}")==false) {
			errors.rejectValue("expiryDate", "Valid.expiryDate");	
		}
		
/*		Security Card - not empty and 3 digits*/
		if(user.getSecurityCard().isEmpty()) {
			errors.rejectValue("securityCard", "NotEmpty.securityCard");	
		}
		if(user.getSecurityCard().isEmpty()==false && user.getSecurityCard().matches("[0-9]{3}")==false) {
			errors.rejectValue("securityCard", "Valid.securityCard");	
		}
		
		
		
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
