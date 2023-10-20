package com.example.zingmp3.Model;

import com.example.zingmp3.Controller.User;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private String url = "jdbc:mysql://localhost:3306/UserInfo";
    private String username = "root";
    private String password = "07122004";

    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "SELECT id, username, email FROM users";
            Statement statement = connection.createStatement();
            ResultSet resultSet =  statement.executeQuery(sql);
            while (resultSet.next()){
                int id =  resultSet.getInt("id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                User user = new User(id, username, email, phone);
                userList.add(user);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return userList;
    }

//    public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
//        Connection conn = null;
//        Class.forName("com.mysql.jdbc.Driver");
//        conn = DriverManager.getConnection(url, username, password);
//        return connection;
//    }
}
