package com.cep.bdd.cep.domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cep.bdd.cep.common.CommonFunctions;

public class LoginPage {

	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	static CommonFunctions commonFunction = new CommonFunctions();
	@FindBy(name = "username")
	private static WebElement username;

	public static WebElement getUserName() {
		if (commonFunction.wait(username)) {
			return username;
		} else {
			return null;
		}
	}

	@FindBy(name = "password")
	private static WebElement password;

	public static WebElement getPassword() {
		if (commonFunction.wait(password)) {
			return password;
		} else {
			return null;
		}
	}

	@FindBy(xpath = "//button[contains(@class,'login-button')]")
	private static WebElement loginButton;

	public static WebElement getLoginButton() {
		if (commonFunction.wait(loginButton)) {
			return loginButton;
		} else {
			return null;
		}
	}

}
