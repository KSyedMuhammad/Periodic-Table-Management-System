package service;

import dao.UserDAO;
import model.User;

public class UserService {
	
	private UserDAO dao = new UserDAO();
	
	public boolean signup(String username, String password) {
		
		return dao.signup(new User(username,password));
		
	}
	
	public User login(String username, String password) {
		return dao.login(username, password);
	}
}
