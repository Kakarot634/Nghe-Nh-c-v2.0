package Controller;

import model.User;
import service.UserDAO;

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