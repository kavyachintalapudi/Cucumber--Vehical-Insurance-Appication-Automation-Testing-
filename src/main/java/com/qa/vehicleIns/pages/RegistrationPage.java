package com.qa.vehicleIns.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.vehicleIns.utils.EleInt;

public class RegistrationPage {
       
	/***********************first name********************/
	@FindBy(xpath = "//input[@placeholder=\"Enter full name\"]")
	private WebElement first;
	@FindBy(xpath = "//input[@name=\"address\"]")
	private WebElement addres;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void firstdata(String value) {
		EleInt.typeText(first, value);
	}
	public void addressfield(String value) {
		EleInt.typeText(addres, value);
	}
}
