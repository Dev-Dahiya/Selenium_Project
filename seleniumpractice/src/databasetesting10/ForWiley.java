package databasetesting10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForWiley {

	public static void main(String[] args) {
//		WebDriver driver = new FirefoxDriver();

		try {
			// Initialize 'Driver' class
			Class.forName("com.mysql.jdbc.Driver");
			// Create connection to DB
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev_dahiya", "root", "root");
			// Create a Statement object for sending SQL statements to the database
			Statement stmt = conn.createStatement();
			/*
			 * For practice I used below variable. But with actual site, we will
			 * first find the element, then find value of ID attribute of this
			 * element and store this value in below variable.
			 */
			String quesId = "Q_100";
			/*
			 * In the below query 'ans_id' is name of the column which contains
			 * ids of answer options. And 'status' column contains status of the
			 * answers, whether it is true or false.
			 */
			String query = "select ans_id from " + quesId + " where status = 1";
			// Execute query and store returned result in 'ResultSet' data type
			ResultSet results = stmt.executeQuery(query);
			// Iterate over the results
			while (results.next()) {
				String ansId = results.getString("ans_id");
				System.out.println("Answer id is: " + ansId);
				// Print statement, above is just for practice. In actual site code will be:
				// driver.findElement(By.id(ansId)).click();
			}
			results.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
