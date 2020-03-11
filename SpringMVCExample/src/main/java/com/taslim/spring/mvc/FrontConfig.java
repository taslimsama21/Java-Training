package com.taslim.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.taslim.spring.mvc"})
public class FrontConfig {
	@Bean
	 public InternalResourceViewResolver viewResolver()
	 {
		 InternalResourceViewResolver vr = new InternalResourceViewResolver();
		 vr.setPrefix("/WEB-INF/");
		 vr.setSuffix(".jsp");
		 
		 return vr;
		 
	 }
}
