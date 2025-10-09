package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	public static Connection getConnection() {
		
		try {
			connection = DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	static String dbURL = "jdbc:mysql://localhost:3306/test";
	static String username = "root";
	static String password = "admin";
	DriverManager driverManager;
	static Connection connection;
}
	//creamos una conexion de la base de datos
	 

		

