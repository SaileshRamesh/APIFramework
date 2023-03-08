Feature: Validate the RCB team based on four foreign players and atleast a wicket keeper 

Scenario: Validate if the team has only four foreign players 
	Given a JSON response is returned with the team's player information for RCB Team 
	When I check the number of foreign players in the team 
	Then the number of foreign players should be four 
	
	
Scenario: Verify team has at least one wicket-keeper 
	Given a JSON response is returned with the team's player information for RCB Team 
	When I check the list of players in the team 
	Then at least one player should be a wicket-keeper 
	
	
	
	
