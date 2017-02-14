package com.deloitte.devops.config;

import java.util.Properties;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.deloitte.devops.validator.UserValidator;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.deloitte.devops")
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	@Bean
	public UserValidator userValidator() {
		return new UserValidator();
	}

	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
/*	Added just in case*/
/*	@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
	}
	@Bean(name = "multipartResolver")
    public CommonsMultipartResolver getMultipartResolver() {
        return new CommonsMultipartResolver();
    }*/
	@Bean (name ="mailSender")
	public JavaMailSenderImpl getMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtpfor.uk.deloitte.com");
		mailSender.setPort(25);
		mailSender.setUsername("mslowinska@deloitte.co.uk");
		/*mailSender.setPassword("Slow4599831!");*/
		Properties properties = new Properties();
		properties.put("mail.transport.protocol", "smtp");
		/*properties.put("mail.smtp.auth", "true");*/
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.from", "mslowinska@deloitte.co.uk");
		mailSender.setJavaMailProperties(properties);
		return mailSender;
	}
	
	
	@Bean(name = "messageSource")
    public ResourceBundleMessageSource getMessageSource() {
        ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
        resource.setBasename("messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }
       
}
