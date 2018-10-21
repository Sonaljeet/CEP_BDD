package com.cep.bdd.cep.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.cep.bdd.cep.domain.LoginPage;

@Configuration
@PropertySource("classpath:env/common.properties")
@PropertySource("classpath:env/${env}.properties")

public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(destroyMethod="quit")
	@Autowired
	public WebDriver webDriver(@Value("${webDriver.path}") String driverPath) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		return new ChromeDriver();
	}
	
	@Bean
	@Autowired
	public LoginPage loginPage(WebDriver webDriver) {return new LoginPage(webDriver);}
}
