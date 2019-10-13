package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarsSteps {
	@Given("^I am on Home Page \"([^\"]*)\" of CarsGuide website$")
	public void i_am_on_Home_Page_of_CarsGuide_website(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@And("^Click on \"([^\"]*)\"link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^Select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_from_AnyMake_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^Select carmodel as \"([^\"]*)\" from SelectModel dropdown$")
	public void select_carmodel_as_from_SelectModel_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^Select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_from_SelectLocation_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^Select price as \"([^\"]*)\" from Price dropdown$")
	public void select_price_as_from_Price_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^click on Find_My_Next car button$")
	public void click_on_Find_My_Next_car_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I Should see list of searched cars$")
	public void i_Should_see_list_of_searched_cars() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^Page title should be \"([^\"]*)\"$")
	public void page_titile_showuld_be(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
