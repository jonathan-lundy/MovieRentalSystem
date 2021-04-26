import java.sql.Connection;
import java.sql.DriverManager;

public class TestAPI {
	public dbAPI db;
	public TestAPI(dbAPI connection) {
		db = connection;
	}
	
	public void TestConnection() throws Exception {
		Connection conn = DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/MovieRentalSystem",
        		"root", "testpw"); 
		if(conn != null)
			System.out.println("Sucessfully connected to mysql database!");
		else 
			System.out.println("DB connection error");
	}
	
	public void TestCreateUser() throws Exception{
		if(db.CreateAccount("testAccount6@test.com", "TestPW6", "Test6", "CA6"))
			System.out.println("Account Added");
		else 
			System.out.println("Account failed to add, see exception.");
	}
	
	public void TestIsUser() throws Exception {
		if(db.IsUser("testAccount6@test.com", "TestPW6"))
			System.out.println("Correct PW, login successful");
		else 
			System.out.println("Incorrect PW!");
	}
	
	public void TestAddCreditCard() throws Exception{
		if(db.AddCreditCard(87654321, "2022-01-01", 321, "Test", "User",
				"123 test ave", "Testville", "CT", 654321))
			System.out.println("Added credit card!");
		else
			System.out.println("Failure to add card");
	}
}
