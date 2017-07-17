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
    private User user_test1;
    private User user_test2;
    public Errors errors1;
    public Errors errors2;

    @Before
    public void setUp() {
        user_test1 = new User();
        user_test1.setFirstName("John");
        user_test1.setLastName("Doe");
        user_test1.setEmail("jdoe@gmail.com");
        
/*Phone use case*/
/*        user_test1.setPhone("07777777777");*/
        user_test1.setAddress1("23 XX Street");
        user_test1.setAddress2("XXX");
        user_test1.setPostcode("SE113UU");
        user_test1.setCity("London");
        user_test1.setNameCard("John Doe");
        user_test1.setNumberCard("1234123412341234");
        user_test1.setExpiryDate("12/12");
        user_test1.setSecurityCard("123");

        errors1 = new BeanPropertyBindingResult(user_test1, "user_test1");
        
        user_test2 = new User();
        user_test2.setFirstName("");
        user_test2.setLastName("Doe");
        user_test2.setEmail("email");
/*Phone use case*/
/*        user_test2.setPhone("0");*/
        user_test2.setAddress1("address1");
        user_test2.setAddress2("address2");
        user_test2.setPostcode("SE113UU");
        user_test2.setCity("city");
        user_test2.setNameCard("John Doe");
        user_test2.setNumberCard("1234123");
        user_test2.setExpiryDate("12/12");
        user_test2.setSecurityCard("123");

        errors2 = new BeanPropertyBindingResult(user_test2, "user_test2");
    }

    @Test
    public void testValidate1Positive() {
        validator.validate(user_test1, errors1);
        assertFalse(errors1.hasErrors());
    }
    
    @Test
    public void testValidate2Negative() {
        validator.validate(user_test2, errors2);
        assertTrue(errors2.hasErrors());
    }
}

