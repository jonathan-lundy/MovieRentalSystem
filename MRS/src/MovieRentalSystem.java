import java.sql.Connection;

import java.sql.DriverManager;

public class MovieRentalSystem {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Connection dbConnection = connectToDB();
		if(dbConnection != null)
			System.out.println("Sucessfully connected Movie Rental System mySQL database");
		else
			System.out.println("Error");
		
	}
	
	public static Connection connectToDB() { 
		Connection conn = null;
		try {
			// MySQL format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
	        conn = DriverManager.getConnection(
	        		"jdbc:mysql://localhost:3306/MovieRentalSystem",
	        		"root", "testpw"); 
	        return conn;
		}
		finally {
			return conn;
		}
          
	}
}
