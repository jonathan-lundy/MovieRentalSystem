import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MovieRentalSystem {

	public static void main(String[] args) throws Exception{

		Connection dbConnection = DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/MovieRentalSystem",
        		"root", "testpw");
		
		dbAPI api = new dbAPI(dbConnection);
		TestAPI testAPI = new TestAPI(api);
		
		testAPI.TestConnection();
		testAPI.TestCreateUser();
		testAPI.TestIsUser();
		testAPI.TestAddCreditCard();
			
		
	}
	
}
