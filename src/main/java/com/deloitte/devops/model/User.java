
package com.deloitte.devops.model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;;

public class User implements Serializable{
	
	@NotNull
	@Size(min=2, max=20, message="Name must be between 2 and 20 characters")
	private String firstName;
	/*2-30 characters, not null*/
	private String lastName;
	/*type email, must-have @ */
	@Email
	private String email;
	@NotEmpty
	/*not empty*/
/*	private String phone;*/
	
	private String address1;
	//no particular ones, can be empty
	private String address2;
	//here we can add custom validator or search for validator online
	@NotEmpty
	@Size(min=3, max=7)
	private String postcode;
	//not null
	@NotEmpty
	private String city;
	//not null
	@NotEmpty
	private String nameCard;
	//16 digits avoid 12345678910 etc can be custom
	@NumberFormat
	private String numberCard;
	//type date mm/yy
	@NotEmpty
	private String expiryDate;
	//3 digits, ints
	@NotEmpty
	private String securityCard;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
/*	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}*/

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getNameCard() {
		return nameCard;
	}

	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}
	
	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSecurityCard() {
		return securityCard;
	}

	public void setSecurityCard(String securityCard) {
		this.securityCard = securityCard;
	}
}
