package db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Connection pooling
 */

public class DBUtil {
	HikariDataSource h;
	
	private static final String dbURL = "jdbc:mysql://localhost:3306/test";
	private static final String username = "root";
	private static final String password = "admin";
	
	
	private static HikariDataSource dataSource;
	public static void main(String[] args) {
		HikariConfig config = new HikariConfig();
		config.setUsername(username);
		config.setJdbcUrl(dbURL);
		config.setPassword(password);
		config.setMaximumPoolSize(20);
		dataSource = new HikariDataSource(config);
	}
}
