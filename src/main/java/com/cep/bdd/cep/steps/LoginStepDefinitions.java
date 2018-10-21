package com.cep.bdd.cep.steps;

import static com.cep.bdd.cep.domain.LoginPage.getLoginButton;
import static com.cep.bdd.cep.domain.LoginPage.getPassword;
import static com.cep.bdd.cep.domain.LoginPage.getUserName;

import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

import com.cep.bdd.cep.config.AppConfig;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@ContextConfiguration(classes = AppConfig.class)
public class LoginStepDefinitions {

	@Autowired
	private WebDriver webDriver;
	
	@Value("${cep.url}")
	private String cepURL;
	@Value("${userID}")
	private String userID;
	@Value("${password}")
	private String password;

	@Given("^user is on Home Page of CEP Application$")
	public void userOnLoginPage() {
		webDriver.manage().window().maximize();
		webDriver.get(cepURL);		
	}

	@When("^user enters username and password$")
	public void userEnterDetails() {
		WebElement userElement = getUserName();
		WebElement passElement = getPassword();
		if (userElement != null) {
			userElement.sendKeys(userID);
		} else {
			System.out.println("Username field not present.");
		}
		if (passElement != null) {
			passElement.sendKeys(password);
		} else {
			System.out.println("Password field not present.");
		}
	}

	@And("^user clicks on login button$")
	public void userClicksLogin() {
		WebElement loginButton = getLoginButton();
		if (loginButton != null) {
			loginButton.click();
		} else {
			System.out.println("Button not present.");
		}
	}

	@Then("^home page should get loaded$")
	public void homePageLoaded() {
		String expectedPage = String.format("%scsdoverview", cepURL);
		Awaitility.await().atMost(10, TimeUnit.SECONDS).until(() -> expectedPage.equals(webDriver.getCurrentUrl()));
	}

}
