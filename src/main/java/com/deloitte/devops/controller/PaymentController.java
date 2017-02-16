package com.deloitte.devops.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.devops.model.User;
import com.deloitte.devops.validator.UserValidator;
@Controller
public class PaymentController {

	@Autowired
	UserValidator userValidator;
	
	@Autowired
	JavaMailSenderImpl mailSender;
	
	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public String viewPayment(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "Form";
	}
	

	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public String processPayment(Model model, @Valid @ModelAttribute("user") User user, BindingResult result) {
		
		userValidator.validate(user, result);

		if (result.hasErrors()) {
			System.out.println(result.toString());
			return "Form";
		}
		
		return "Form2";
	}
	
	@RequestMapping(value = "/confirmation", method = RequestMethod.POST)
	public String processPayment(Model model, @Valid @ModelAttribute("user") User user) {
		
		
		mailSender.send(new MimeMessagePreparator() {
			  public void prepare(MimeMessage mimeMessage) throws MessagingException {
			    MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
			    message.setFrom("devops-demo@deloitte.co.uk");
			    message.setTo(user.getEmail());
			    message.setSubject("Purchase Confirmation");
			    message.setText("<center><b>" + user.getFirstName() + "</b>, thank you for your purchase. <br> Your camera is on its way to <b>" + user.getPostcode() + "</b><br>Your order number is <b>3785</b>.</center>", true);
			  }

			});
		
		return "PaymentSuccess";
	}
	
	
	
	
	
}
