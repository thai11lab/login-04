package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.User;
import com.repository.LoginRepository;
import com.service.LoginService;

@WebServlet(urlPatterns = {"/login","/home","/logout"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	private LoginService loginService;
	
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
        loginService =new LoginService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		HttpSession session = request.getSession();
		switch (path) {
		case "/home":
			System.out.println(request.getContextPath());
			request.getRequestDispatcher("views/home.jsp").forward(request, response);			
			break;
		case "/logout":
			System.out.println("dasd");
			session.removeAttribute("fullname");
			request.getRequestDispatcher("index.jsp").forward(request, response);		
		default:
			break;
		}		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username").toString();
		String password = request.getParameter("password").toString();
		HttpSession httpSession = request.getSession();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		if (loginService.dangNhap(user,httpSession)) {
			request.setAttribute("User", user);			
		}else {
			System.out.println("Dang nhap that bao");
		}
		response.sendRedirect("home");
	}

}
