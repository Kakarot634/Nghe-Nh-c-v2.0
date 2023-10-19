package com.example.zingmp3;

import com.example.zingmp3.Controller.Database;
import com.example.zingmp3.Controller.User;
import com.example.zingmp3.Model.UserDAO;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "AdminServlet", value = "/admin-servlet")
public class AdminServlet extends HttpServlet {
    private String message;

    public void init() throws ServletException{
        UserDAO userDAO = new UserDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<User> userList = Database.getUserList();
        request.setAttribute("userList", userList);
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }

}