package stepDefination;



import com.qa.vehicleIns.driverfactory.DriverFactory;
import com.qa.vehicleIns.pages.RegistrationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	RegistrationPage rs;
	
	public Registration(){
		
		System.out.println("Geting called ------------------>");
		System.out.println(DriverFactory.getDriver());
		try
		{
			rs=new RegistrationPage(DriverFactory.getDriver());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("############3 After constructor _______________________> ");
		
	}

	@Given("user should click on vehicle insurance module button")
	public void user_should_click_on_vehicle_insurance_module_button() {
	    rs.clickinsurance();
	}

	@Then("user is able to navigate the bike entry page")
	public void user_is_able_to_navigate_the_bike_entry_page() {
	    
	}	
	@Given("user enter valid bike number")
	public void user_enter_valid_bike_number() {
	    rs.bikenum("AP37DT1229");
	}

	@When("user click on view prices button")
	public void user_click_on_view_prices_button() {
		rs.clickonviewprice();
	}

	@Then("user is able to navigate the registration page")
	public void user_is_able_to_navigate_the_registration_page() {
	   
	}
	
	@Then("user able to enter valid first name")
	public void user_able_to_enter_valid_first_name() {
	    rs.firstdata("Kavya");
	}
	
	@Then("the first name field should be accepted")
	public void the_first_name_field_should_be_accepted() {
	    
	}
	@Then("user able to enter valid address")
	public void user_able_to_enter_valid_address() {
	    rs.addressfield("Avanigadda");
	}

	@Then("the address field should be accepted")
	public void the_address_field_should_be_accepted() {
	    
	}

	@Then("user able to select dropdown list in state")
	public void user_able_to_select_dropdown_list_in_state() {
	   rs.clicktelangana();
	}

	@Then("the state field should be selected")
	public void the_state_field_should_be_selected() {
	   
	}

	@Then("user able to enter valid phone number")
	public void user_able_to_enter_valid_phone_number() {
	   rs.mobile("9502305912");
	}

	@Then("the field should be accepted")
	public void the_field_should_be_accepted() {
	    
	}

	@When("click on send otp button")
	public void click_on_send_otp_button() {
	   rs.clicksendotp();
	   
	}

	@Then("the send otp is sucessfull and otp fields should be displayed")
	public void the_send_otp_is_sucessfull_and_otp_fields_should_be_displayed() {
	    
	}

	@Then("user able to enter valid otp")
	public void user_able_to_enter_valid_otp() {
		rs.enterotp();
		
	}

	@When("click on otp button")
	public void click_on_otp_button() {
	    rs.clickverifyotp();
	    
	}

	@Then("otp field should be accepted and navigated to the next field")
	public void otp_field_should_be_accepted_and_navigated_to_the_next_field() {
		
	}

	@Then("user able to enter valid gmail")
	public void user_able_to_enter_valid_gmail() {
	    rs.enteremail("kavyachintalapudi24@gmail.com");
	    
	}

	@Then("the otp field should be accepted and navigated to the next field")
	public void the_otp_field_should_be_accepted_and_navigated_to_the_next_field() {
	    
	}
	@When("click on send email otp button")
	public void click_on_send_email_otp_button() {
	    rs.clickonmailsendotp();
	}

	@Then("user able to enter valid email otp")
	public void user_able_to_enter_valid_email_otp() {
	    rs.entermailotp();
	}

	@When("click on email otp button")
	public void click_on_email_otp_button() {
	    rs.clickverifyemailotp();
	}




	@Then("user able to click on call us button")
	public void user_able_to_click_on_call_us_button() {
	    
	}

	@Then("it display the one phone number in call us button below")
	public void it_display_the_one_phone_number_in_call_us_button_below() {
	   
	}

	@Then("user able to click on register button")
	public void user_able_to_click_on_register_button() {
	  rs.clicksubmit();
	}

	@Then("it is navigated to the qutation page")
	public void it_is_navigated_to_the_qutation_page() {
	   
	}





}
