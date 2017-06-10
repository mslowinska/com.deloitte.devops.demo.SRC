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
		
/*		First name not empty and longer than min 1 character*/
		if(user.getFirstName().isEmpty()) {
			errors.rejectValue("firstName", "NotEmpty.firstName");	
		}
		if(user.getFirstName().length()<2 && user.getFirstName().length()>0) {
			errors.rejectValue("firstName", "Min2.firstName");
		}
		
/*		Last name not empty and longer than 1 character*/
		if(user.getLastName().isEmpty()) {
			errors.rejectValue("lastName", "NotEmpty.lastName");	
		}
		if(user.getLastName().length()<2 && user.getLastName().length()>0) {
			errors.rejectValue("lastName", "Min2.lastName");
		}
		
/*		Email not empty and containing @ */
		if(user.getEmail().isEmpty()) {
			errors.rejectValue("email", "NotEmpty.email");	
		}
		if(user.getEmail().isEmpty()==false && user.getEmail().matches("^(.+)@(.+).([A-Za-z]{2,5})$")==false) {
			errors.rejectValue("email", "Valid.email");	
		}
		
/*Phone use case scenario*/
		
/*		Phone number not empty and 11 digits with leading 0*/
		
		if(user.getPhone().isEmpty()) {
			errors.rejectValue("phone", "NotEmpty.phone");	
		}
		if(user.getPhone().isEmpty()==false && user.getPhone().matches("[0-9]{10,11}")==false) {
			errors.rejectValue("phone", "Valid.phone");	
		}
		
		
/*		Address 1 field not empty*/
		if(user.getAddress1().isEmpty()) {
			errors.rejectValue("address1", "NotEmpty.address1");	
		}
		
/*		Postcode field is not empty and of certain format	*/
		if(user.getPostcode().isEmpty()) {
			errors.rejectValue("postcode", "NotEmpty.postcode");	
		}
		if(user.getPostcode().isEmpty()==false && user.getPostcode().matches("^[A-Z]{1,2}[0-9R][0-9A-Z]? {0,1}[0-9][ABD-HJLNP-UW-Z]{2}$")==false) {
			errors.rejectValue("postcode", "Valid.postcode");	
		}
		
/*		City field not empty*/
		if(user.getCity().isEmpty()) {
			errors.rejectValue("city", "NotEmpty.city");	
		}
		
/*		Name on card not empty*/
		if(user.getNameCard().isEmpty()) {
			errors.rejectValue("nameCard", "NotEmpty.nameCard");	
		}
		
/*		Card number not empty and 16 digits no spaces*/
		if(user.getNumberCard().isEmpty()) {
			errors.rejectValue("numberCard", "NotEmpty.numberCard");	
		}
		if(user.getNumberCard().isEmpty()==false && user.getNumberCard().matches("[0-9]{16}")==false) {
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
