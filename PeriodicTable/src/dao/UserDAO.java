package dao;

import db.DBConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	public boolean signup(User user) {
		String sql = "INSERT INTO users(username,password) VALUES (?,?)";
		
		try (Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, user.getUsername());
			ps.setString(2,user.getPassword());
			return ps.executeUpdate() >0;
		} catch (Exception e) {
			System.out.println("Username alredy exists!");
		}
		return false;
	}
	
	public User login(String username, String password) {
		String sql = "SELECT * FROM users WHERE username=? AND password=? ";
		
		try (Connection conn = DBConnection.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)){
			
			ps.setString(1, username);
			ps.setString(2,password);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return new User (
						rs.getInt("id"),
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("role")
						);
						
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

