package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DBConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/chemistry";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "redhat";
	
	public static  Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Connection Establish");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}


}
