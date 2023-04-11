package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		// Create a HashMap to store a List of strings for each key
		Map<String, List<String>> map = new HashMap<>();

		// Add some data to the map
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		map.put("Fruits", fruits);

		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		map.put("Colors", colors);

		// Retrieve data using a For-Each loop
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

		// Retrieve data using a while loop and an Iterator
		Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<String>> entry = iterator.next();
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

		// Store and retrieve data from a database
		// Here's an example using MySQL
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "myusername";
		String password = "mypassword";

		try {
			// Connect to the database
			Connection connection = DriverManager.getConnection(url, username, password);

			// Create a prepared statement to insert data into the database
			String insertSql = "INSERT INTO mytable (key, value) VALUES (?, ?)";
			PreparedStatement insertStatement = connection.prepareStatement(insertSql);

			// Insert data into the database
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				String key = entry.getKey();
				List<String> value = entry.getValue();

				// Convert the list of strings to a comma-separated string
				String valueString = String.join(",", value);

				// Set the parameters of the prepared statement
				insertStatement.setString(1, key);
				insertStatement.setString(2, valueString);

				// Execute the statement
				insertStatement.executeUpdate();
			}

			// Create a prepared statement to retrieve data from the database
			String selectSql = "SELECT * FROM mytable";
			PreparedStatement selectStatement = connection.prepareStatement(selectSql);

			// Execute the statement and retrieve the results
			ResultSet resultSet = selectStatement.executeQuery();

			// Create a new map to store the retrieved data
			Map<String, List<String>> resultMap = new HashMap<>();

			// Iterate over the result set and add the data to the map
			while (resultSet.next()) {
				String key = resultSet.getString("key");
				String valueString = resultSet.getString("value");

				// Convert the comma-separated string to a list of strings
				List<String> value = Arrays.asList(valueString.split(","));

				resultMap.put(key, value);
			}

			// Print out the retrieved data
			for (Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
				String key = entry.getKey();
				List<String> value = entry.getValue();
				System.out.println("Key: " + key + ", Value: " + value);
			}

			// Close the database connection and resources
			resultSet.close();
			selectStatement.close();
			insertStatement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();

