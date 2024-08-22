package stepDefination;

import com.qa.vehicleIns.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	RegistrationPage rs;
	@Given("user able to enter valid first name field")
	public void user_able_to_enter_valid_first_name_field() {
	    rs.firstdata("Kavya");
	}

	@Then("the first name field should be accepted")
	public void the_first_name_field_should_be_accepted() {
	    
	}

	@Then("user able to enter valid address field")
	public void user_able_to_enter_valid_address_field() {
	   rs.addressfield("Avanigadda");
	}

	@Then("the address field should be accepted")
	public void the_address_field_should_be_accepted() {
	    
	}

	@Then("user able to select dropdown list in state")
	public void user_able_to_select_dropdown_list_in_state() {
	   
	}

	@Then("the state field should be selected")
	public void the_state_field_should_be_selected() {
	   
	}

	@Then("user able to enter valid phone number")
	public void user_able_to_enter_valid_phone_number() {
	   
	}

	@Then("the field should be accepted")
	public void the_field_should_be_accepted() {
	    
	}

	@When("click on send otp button")
	public void click_on_send_otp_button() {
	   
	}

	@Then("the send otp is sucessfull and otp fields should be displayed")
	public void the_send_otp_is_sucessfull_and_otp_fields_should_be_displayed() {
	    
	}

	@Then("user able to enter valid otp")
	public void user_able_to_enter_valid_otp() {
	    
	}

	@When("click on otp button")
	public void click_on_otp_button() {
	    
	}

	@Then("otp field should be accepted and navigated to the next field")
	public void otp_field_should_be_accepted_and_navigated_to_the_next_field() {
	    
	}

	@Then("user able to enter valid gmail")
	public void user_able_to_enter_valid_gmail() {
	    
	}

	@Then("the otp field should be accepted and navigated to the next field")
	public void the_otp_field_should_be_accepted_and_navigated_to_the_next_field() {
	    
	}

	@Then("user able to click on call us button")
	public void user_able_to_click_on_call_us_button() {
	    
	}

	@Then("it display the one phone number in call us button below")
	public void it_display_the_one_phone_number_in_call_us_button_below() {
	   
	}

	@Then("user able to click on register button")
	public void user_able_to_click_on_register_button() {
	   
	}

	@Then("it is navigated to the qutation page")
	public void it_is_navigated_to_the_qutation_page() {
	   
	}





}
