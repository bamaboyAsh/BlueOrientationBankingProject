package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.LoginBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step 1: Pulling values from Login jsp page and checking if 
		// if the login credential are for admin or user?
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.equals("admin")&&password.equals("admin123"))
		{
			request.setAttribute(username, password);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
		else
		{
			LoginBean loginbean= new LoginBean();
			
			
		}
	}

}
