package com.auca.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("aline") && password.equals("aline@123")) {
            response.sendRedirect("/DemoServlet/home.html");
            return;
        } else {
            response.sendRedirect("/DemoServlet/resetpassword.html");
            return;
        }
    }

}
