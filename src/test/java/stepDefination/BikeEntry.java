package stepDefination;

import com.qa.vehicleIns.driverfactory.DriverFactory;
import com.qa.vehicleIns.pages.BikeEntryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BikeEntry {
	
	BikeEntryPage bp;
	
	public BikeEntry ()
	{
	  bp=new BikeEntryPage(DriverFactory.getDriver());	
	 
	}
	
//	@Given("user enters valid bike number as {string}")
//	public void user_enters_valid_bike_number_as(String bikeNum) {
//		bikeEntP=new BikeEntryPage(DriverFactory.getDriver());
//		//bikeEntP.enterBikeNum("AP37DT1228");
//	}

	
	@Given("user enter valid bike number")
	public void user_enter_valid_bike_number() {
	    bp.enterbikenum("TS29AA2049");
	}


	@When("user click on view prices button")
	public void user_click_on_view_prices_button() {
		bp.clickonviewprice();
	}

	@Then("user is able to navigate the registration page")
	public void user_is_able_to_navigate_the_registration_page() {
	   
	}
	@Given("user enter invalid bike number")
	public void user_enter_invalid_bike_number() {
	    bp.bikedata("TS29AA204");
	}
	
	@Then("user is able to see error message at bike number text box field")
	public void user_is_able_to_see_error_message_at_bike_number_text_box_field() {
	    
	}
	@Given("user click on call us button")
	public void user_click_on_call_us_button() {
	    bp.callclick();
	}

	@Then("user can able to view the call number")
	public void user_can_able_to_view_the_call_number() {
	    
	}
	@Given("user click on login hyperlink")
	public void user_click_on_login_hyperlink() {
	    bp.loginclick();
	}

	@Then("user is able to navigate the login page")
	public void user_is_able_to_navigate_the_login_page() {
	    
	}
	
}
