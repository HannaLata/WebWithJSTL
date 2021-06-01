package com.hannalata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hannalata.dao.UserDAO;
import com.hannalata.model.User;
import com.hannalata.service.UserService;

@WebServlet(urlPatterns = "/user")
public class UserController extends HttpServlet{

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPut(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");

        if (action != null && action.equals("login")) {
        	String login = req.getParameter("login");
            String password = req.getParameter("password");

            User user = UserService.getByLoginAndPassword(login, password);
            if (user!=null){
                RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/items.jsp");
                req.getSession().setAttribute("user-name", user.getFirstName() + " " + user.getLastName());
                dispatcher.forward(req, resp);
            }
            else{
                RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/wrong-auth.jsp");
                dispatcher.forward(req, resp);
            }
        } else if(action.equals("register")) {
        	String login = req.getParameter("login");
        	String password = req.getParameter("password");
        	String firstName = req.getParameter("first_name");
        	String lastName = req.getParameter("last_name");
        	String email = req.getParameter("email");
        	String phone = req.getParameter("phone");
        	User user = new User(login, password, firstName, lastName, email, phone);
        	
        	User savedUser = UserDAO.save(user);
        	RequestDispatcher dispatcher = null;
        	if(savedUser.getId() != null ) {
        		dispatcher = req.getRequestDispatcher("jsp/items.jsp");
            	req.setAttribute("user", savedUser);
        	} else {
        		dispatcher = req.getRequestDispatcher("jsp/registration.jsp");
        	}
        	dispatcher.forward(req, resp);
        	
        }
    }

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doDelete(req, resp);
	}
	
}
