package stepDef;

import java.io.IOException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestDataBuild;

public class RcbTeamValidationsStepDef {
	
	int foreignPlayerCount;
	int wicketPlayerCount;

	@Given("a JSON response is returned with the team's player information for RCB Team")
	public void a_json_response_is_returned_with_the_team_s_player_information_for_rcb_team() throws IOException {
	    TestDataBuild.setData();
	}
	
	@When("I check the number of foreign players in the team is {int}")
	public void i_check_the_number_of_foreign_players_in_the_team(int expectedForeignPlayerCount) {
		foreignPlayerCount = TestDataBuild.validateNumberofForeignPlayers();
		Assert.assertEquals(expectedForeignPlayerCount, foreignPlayerCount);
	}
	
	@Then("the team is eligible for selection")
	public void the_team_is_eligible_for_selection() {
		String result =  foreignPlayerCount == 4 ? "We have only four foreign players , eligible for selection" 
	    		: "We don't have four foreign players, not eligible for selection";
	    System.out.println(result);
	}
	
	
	@When("I check the list of players in the team")
	public void i_check_the_list_of_players_in_the_team() {
		wicketPlayerCount = TestDataBuild.validateWicketPlayer();
	}
	
	@Then("at least one player should be a wicket-keeper")
	public void at_least_one_player_should_be_a_wicket_keeper() {
	    String result =  wicketPlayerCount >= 1 ? "We have atleast one wicket-keeper, eligible for selection" 
	    		: "We don't have atleast one wicket-keeper, not eligible for selection";
	    System.out.println(result);
	}
}
