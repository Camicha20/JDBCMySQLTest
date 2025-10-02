package ConnectionTest;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args)throws SQLException {
		
		String dbURL ="jdbc:mysql://localhost:3306/test";
		String username = "";
		String password = "";
		
		
		
		DriverManager driverManager;
		ConnectionTest connection;
		DriverManager.getConnection(dbURL, username, password);
	}

}
