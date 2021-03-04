package com.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.DAO.User;
import com.repository.LoginRepository;

public class LoginService {
	private LoginRepository loginRepository;
	public LoginService() {
		loginRepository=new LoginRepository();
	}
	public boolean dangNhap(User user,HttpSession session) {
		List<User> users = loginRepository.findAll();
		System.out.println("");
		for (User item : users) {
			if (user.getUsername().equals(item.getUsername()) && user.getPassword().equals(item.getPassword())) {
				session.setAttribute("fullname",item.getFullName());
				return true;
			}
		}
		return false;
		
	}
}
