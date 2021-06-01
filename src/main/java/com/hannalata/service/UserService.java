package com.hannalata.service;

import com.hannalata.dao.UserDAO;
import com.hannalata.model.User;

public class UserService {
	
	public static User getByLoginAndPassword(String login, String password) {
		return UserDAO.getByLoginAndPassword(login, password);
	}

}
