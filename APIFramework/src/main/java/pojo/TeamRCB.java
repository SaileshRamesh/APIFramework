package pojo;

import java.util.List;

public class TeamRCB {
	
	private String name;
	private String location;
	private List<Players> players;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Players> getPlayers() {
		return players;
	}
	public void setPlayers(List<Players> players) {
		this.players = players;
	}
}
