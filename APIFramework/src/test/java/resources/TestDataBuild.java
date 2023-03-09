package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;
import pojo.Players;
import pojo.TeamRCB;

public class TestDataBuild {

	public static void setData() throws IOException {
		TeamRCB rcb = new TeamRCB();
		String response = new String(
				Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/src/test/java/resources/RCB.json")));
		JsonPath js = rawToJson(response);
		rcb.setName(js.getString("name"));
		rcb.setLocation(js.getString("location"));

		Gson gson = new Gson();
		
		// read the JSON file into a String
		String json = Files.readString(Paths.get(System.getProperty("user.dir") + "/src/test/java/resources/RCB.json"));
		
		// parse the JSON into a JsonObject
		JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
		JsonArray playerJsonArray = jsonObject.getAsJsonArray("player");
		List<Players> players = new ArrayList<>();
		// iterate over the player JSON array and create Player objects for each element
		for (JsonElement playerElement : playerJsonArray) {
			// create a new Player object
			Players player = new Players();

			// set the values for the Player object
			player.setName(playerElement.getAsJsonObject().get("name").getAsString());
			player.setCountry(playerElement.getAsJsonObject().get("country").getAsString());
			player.setRole(playerElement.getAsJsonObject().get("role").getAsString());
			player.setPrice_in_crores(playerElement.getAsJsonObject().get("price-in-crores").getAsString());

			// add the Player object to the players list
			players.add(player);
		}
		// set the players list for the Team object
		rcb.setPlayers(players);
	}

	public static JsonPath rawToJson(String response) {
		JsonPath js = new JsonPath(response);
		return js;
	}

}
