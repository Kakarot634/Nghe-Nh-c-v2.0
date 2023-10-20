package Controller;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "trung", "trunglqm142@gmail.com", "0973311634"));
        userList.add(new User(1, "Kim anh", "anh.dinhthikim2004", "0985713433"));
        userList.add(new User(1, "minh đức", "nmduck2004@gmail.com", "0975345335"));
        return userList;
    }
}
