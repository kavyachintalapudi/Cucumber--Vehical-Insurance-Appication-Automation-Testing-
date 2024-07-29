package stepDefination;

import com.qa.vehicleIns.driverfactory.DriverFactory;
import com.qa.vehicleIns.pages.BikeEntryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BikeEntry {
	
	BikeEntryPage bikeEntP;
	
	@Given("user enters valid bike number as {string}")
	public void user_enters_valid_bike_number_as(String bikeNum) {
		bikeEntP=new BikeEntryPage(DriverFactory.getDriver());
		bikeEntP.enterBikeNum(bikeNum);
	}

	@When("user clicks on search on view prices")
	public void user_clicks_on_search_on_view_prices() {
	}

	@Then("user is able to see the info of that bike")
	public void user_is_able_to_see_the_info_of_that_bike() {
	}

}
