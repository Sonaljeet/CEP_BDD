package com.cep.bdd.cep.common;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.awaitility.Awaitility;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
	public boolean wait(WebElement element) {
		try{
			Awaitility.await().atMost(30,TimeUnit.SECONDS).ignoreException(NoSuchElementException.class)
			.until(() -> element.isDisplayed());
			return true;	
		} catch(Exception e){
			return false;
		}
		
	}
}
