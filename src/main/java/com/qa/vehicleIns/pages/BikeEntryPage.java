package com.qa.vehicleIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BikeEntryPage {
	
	public BikeEntryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Page Objects
	
	/*Bike number to search */
	@FindBy(xpath="//input[@type='text']")
	WebElement viewPrices;
	public void enterBikeNum(String num)
	{
		viewPrices.sendKeys(num);
	}
	
	

}
