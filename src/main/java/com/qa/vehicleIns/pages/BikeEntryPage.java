package com.qa.vehicleIns.pages;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.vehicleIns.driverfactory.DriverFactory;
import com.qa.vehicleIns.utils.EleInt;

public class BikeEntryPage extends DriverFactory {
	EleInt elem;

	public BikeEntryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Page Objects
	
	/*Bike number to search */
	/****
	@FindBy(xpath="//input[@type='text']")
	private WebElement viewPrices;
	***/
	/********************insurance module button**********/
	
//	@FindBy(xpath = "//h6[text()='Vehicle Insurance']")
//	private WebElement insuranceButton;
	/*********************module button********************/
    @FindBy(xpath = "//a[@href=\"/Bikeentry\"]")
    private WebElement button;
	/********************** valid data *************/
	@FindBy(xpath = "//input[@ type=\"text\"]")
	private WebElement enterthebikenum;
	
	/****************** view price button************/
	@FindBy(xpath = " //button[text()='view prices']")
	private WebElement viewPrice;
	
	/********************invalid data*************/
	@FindBy(xpath = "//input[@maxlength=\"10\"]")
	private WebElement bike;
	/************* call us button***************/
	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary text-center me-4 css-1e6y48t-MuiButtonBase-root-MuiButton-root\"]")
	private WebElement call;
	
	/**************login page*************/
	@FindBy(xpath = "//a[@class=\"option-link\"]")
	private WebElement login;

	
	//***************************************************//
	public void clickinsurance() {
		EleInt.click(button);
	}
	
	public void enterbikenum(String value)
	{
	EleInt.typeText(enterthebikenum, value);
	}
	
	public void clickonviewprice() {
		EleInt.click(viewPrice);
	}
	
	public void bikedata(String value) {
		EleInt.typeText(bike, value);
	}
	
	public void callclick() {
		EleInt.click(call);
	}
	
	public void loginclick()
	{
		EleInt.click(login);
	}
	
}
