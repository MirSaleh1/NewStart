package task7.user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static List<User> users = new ArrayList<>();

    public static void regist(String name, String password) {
        User user = login(name, password);
        if (user != null) {
            System.out.println("user already exists:" + user);
            return;
        }
        users.add(new User(name, password));
    }

    public static User login(String name, String password) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(name) &&
                    user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
