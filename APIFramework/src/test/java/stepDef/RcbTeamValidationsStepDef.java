package stepDef;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestDataBuild;

public class RcbTeamValidationsStepDef {

	@Given("a JSON response is returned with the team's player information for RCB Team")
	public void a_json_response_is_returned_with_the_team_s_player_information_for_rcb_team() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    TestDataBuild.setData();
	}
	
	@When("I check the number of foreign players in the team")
	public void i_check_the_number_of_foreign_players_in_the_team() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("the number of foreign players should be four")
	public void the_number_of_foreign_players_should_be_four() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("I check the list of players in the team")
	public void i_check_the_list_of_players_in_the_team() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("at least one player should be a wicket-keeper")
	public void at_least_one_player_should_be_a_wicket_keeper() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
