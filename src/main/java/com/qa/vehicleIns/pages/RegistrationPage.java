package com.qa.vehicleIns.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.vehicleIns.driverfactory.DriverFactory;
import com.qa.vehicleIns.utils.EleInt;
import com.qa.vehicleIns.utils.JSEUtility;

public class RegistrationPage{
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	/***********************first name********************/
	/*********************module button********************/
    @FindBy(xpath = "//a[@href='/Bikeentry']")
    private WebElement insurance;
	/********************** valid data *************/
	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement bike;
	
	/****************** view price button************/
	@FindBy(xpath = "//button[text()=\"view prices\"]")
	private WebElement viewPrice;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter full name\"]")
	private WebElement first;
	
	@FindBy(xpath = "//input[@name=\"address\"]")
	private WebElement addres;
	
	@FindBy(xpath="//option[@value=\"Telangana\"]")
  	private WebElement telangana ;
	
	@FindBy(xpath="//input[@id=\"mobile\"]")
  	private WebElement mobile;
  	
  	@FindBy(xpath="(//button[text()=\"Send OTP\"])[1]")
  	private WebElement sendotp ;
	
  	@FindBy(xpath="//div[@class='sp-form-group ']//h4 ")
  	private WebElement otp;
  	
  	@FindBy(xpath="//div[@class='sp-otp-inputs']/input[1] ")
  	private WebElement otpbox;
  	
  	@FindBy(xpath="//button[text()='Verify OTP'] ")
	private WebElement verifyotp ;
	
  	@FindBy(xpath=" //p[text()=\"Mobile OTP verified successfully!\"]")
	private WebElement successotp ;
	
	@FindBy(xpath="//input[@name=\"email\"] ")
	private WebElement email ;
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/form/div[5]/button ")
	private WebElement sendemailotp ;
	
	@FindBy(xpath="(//h4[@class='text-danger'])[2]")
    private WebElement enetrotp;
	
	@FindBy(xpath="(//input[@class='sp-otp-input'])[1]")
  	private WebElement enterotpbox;
  	
	
	@FindBy(xpath="//button[text()=\"Verify OTP\"] ")
	private WebElement verifyemailotp ;
	
	
	@FindBy(xpath="//p[text()=\"Email OTP verified successfully!\"] ")
	private WebElement successemailotp ;
	
	@FindBy(xpath="//button[@type=\"submit\"] ")
	private WebElement submit ;
	
	
	//**************** methods ***************//
	public void clickinsurance() {
		EleInt.click(insurance);
	}
	public void bikenum(String value)
	{
	EleInt.typeText(bike, value);;
	}
	
	public void clickonviewprice() {
		EleInt.click(viewPrice);
	}
	
	public void firstdata(String value) {
		EleInt.typeText(first, value);
	}
	
	public void addressfield(String value) {
		EleInt.typeText(addres, value);
	}
	
	public void clicktelangana() {
		EleInt.click(telangana);
	}
	public void mobile(String value)
	 {
		EleInt.typeText(mobile, value);
	}

	public void clicksendotp()
	{
		EleInt.click(sendotp);
	}
	
	public void enterotp()
	{
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		String value=otp.getText();
		System.out.println("otpvalue----->"+value);
		EleInt.typeText(otpbox, value);
	}

	public void clickverifyotp()
	{
		EleInt.click(verifyotp);
	}
	public boolean verifymobileotpsuccess() {
		boolean b2=EleInt.isDisplayed(successotp);
		return b2;
	}
		


	public void enteremail(String value)
	{
		System.out.println("user enter the mail-------------------");
		JavascriptExecutor js=(JavascriptExecutor)DriverFactory.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);",email);
		EleInt.typeText(email, value);
	}

	public void clickonmailsendotp()
	{
		EleInt.click(sendemailotp);
		JSEUtility.scrollToBottom(DriverFactory.getDriver());
		
	}



	public void entermailotp()
	{
		try {
			Thread.sleep(5000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
			}
		String value1=enetrotp.getText();
		System.out.println("mailotpvalue----"+value1);
		EleInt.typeText(enterotpbox, value1);
	}

	public void clickverifyemailotp()
	{
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		EleInt.click(verifyemailotp);
		
	}

	public boolean verifyemailotp() {
		boolean b3=EleInt.isDisplayed(successemailotp);
		return b3;

	}
	public void clicksubmit()
	{
		EleInt.click(submit);
	}

}
