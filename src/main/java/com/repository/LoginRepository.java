package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DAO.User;
import com.datasoucre.MySqlConnector;

public class LoginRepository {
		
	
	public LoginRepository() {
		// TODO Auto-generated constructor stub
	}
	
	
	@SuppressWarnings("unused")
	public List<User> findAll()  {
		List<User> users = new ArrayList<User>();
		
		System.out.println("Creating statement...");
		try {
			Connection conn = MySqlConnector.getConnection();
			PreparedStatement statement = null;
			String sql = "SELECT * FROM tbluser.user";
			statement = conn.prepareStatement(sql);
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
			
				User user = new User();
				user.setUsername(rs.getNString("username"));
				user.setPassword(rs.getNString("password"));
				user.setFullName(rs.getNString("fullname"));
				users.add(user);
			}
			rs.close();
			statement.close();
			conn.close();
			return users;
		} catch (Exception e) {
			e.printStackTrace();
			return users;
		}
		
	}
	
}	
