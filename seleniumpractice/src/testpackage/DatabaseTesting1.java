package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.testng.annotations.AfterClass;

public class DatabaseTesting1 {
	
	public static Connection conn = null;
	public static Statement stmt;
	public static ResultSet results = null;
	public static String DB_URL = "jdbc:mysql://localhost:3306/users";
	public static String DB_USER = "root";
	public static String DB_PASSWORD = "root";
	public static String driver = "com.mysql.jdbc.Driver";
	
@BeforeClass
	 public void beforeClass() {
	Properties prop = new Properties();
	prop.setProperty("user", "root");
	prop.setProperty("password", "root");
	
	try {
		Class.forName(driver).newInstance();
		System.out.println("Connecting to the database...");
		conn = DriverManager.getConnection(DB_URL, prop);
		//conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		System.out.println("Connected successfully to the database...");
		System.out.println("Creating statement...");
		stmt = conn.createStatement();
	} catch (Exception e) {
		e.printStackTrace();
	}

	  }
  @Test
  public void test() {
	  String query = "select * from user_info";
	try {
		results = stmt.executeQuery(query);
		while (results.next()) {
			int id = results.getInt("user_id");
			String last = results.getString("last_name");
			String first = results.getString("first_name");
			String city = results.getString("city");
			
			System.out.println("ID: " + id);
			System.out.println("Last Name: " + last);
			System.out.println("First Name: " + first);
			System.out.println("city: " + city);
		}
		results.close();
	} catch (SQLException se) {
		se.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
  

  @AfterClass
  public void afterClass() {
	  try {
		  if (results != null)
		  results.close();
		  if (stmt != null)
		  stmt.close();
		  if (conn != null)
		  conn.close();
	  } catch (SQLException se) {
		  se.printStackTrace();
	  }
  }

}
