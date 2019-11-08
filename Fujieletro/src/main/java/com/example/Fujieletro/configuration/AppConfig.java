package com.example.Fujieletro.configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.Fujieletro.interceptor.LoginInterceptor;

public class AppConfig implements WebMvcConfigurer {
	

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(
	new LoginInterceptor()).
	addPathPatterns("/**").
	excludePathPatterns("/about", "/", "/fazerLogin");
	}

}
