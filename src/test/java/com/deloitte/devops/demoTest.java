package com.deloitte.devops;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import com.deloitte.devops.model.User;
import com.deloitte.devops.validator.UserValidator;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class demoTest {

    @Configuration
    static class ContextConfiguration {

        @Bean
        public UserValidator validator() {
            return new UserValidator();
        }
    }

    @Autowired
    private UserValidator validator;
    private User user1;
    private User user2;
    public Errors errors1;
    public Errors errors2;

    @Before
    public void setUp() {
        user1 = new User();
        user1.setFirstName("John");
        user1.setLastName("Doe");
        user1.setEmail("email");
        user1.setAddress1("address1");
        user1.setAddress2("address2");
        user1.setPostcode("SE113UU");
        user1.setCity("city");
        user1.setNameCard("John Doe");
        user1.setNumberCard("1234123412341234");
        user1.setExpiryDate("12/12");
        user1.setSecurityCard("123");

        errors1 = new BeanPropertyBindingResult(user1, "user1");
        
        user2 = new User();
        user2.setFirstName("");
        user2.setLastName("Doe");
        user2.setEmail("email");
        user2.setAddress1("address1");
        user2.setAddress2("address2");
        user2.setPostcode("SE113UU");
        user2.setCity("city");
        user2.setNameCard("John Doe");
        user2.setNumberCard("1234123");
        user2.setExpiryDate("12/12");
        user2.setSecurityCard("123");

        errors2 = new BeanPropertyBindingResult(user2, "user2");
    }

    @Test
    public void testValidate1Positive() {
        validator.validate(user1, errors1);
        assertFalse(errors1.hasErrors());
    }
    
    @Test
    public void testValidate2Negative() {
        validator.validate(user2, errors2);
        assertTrue(errors2.hasErrors());
    }
}

