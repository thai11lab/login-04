package com.datasoucre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnector {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/tbluser";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "123456";

	public static Connection getConnection() throws ClassNotFoundException {
		Connection conn = null;
		try {
			// Register JDBC driver
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
