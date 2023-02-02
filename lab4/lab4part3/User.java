package lab4part3;

import java.util.Iterator;

public class User {
    String userName = "fj3";
    String userType;
    String name = "Francis";

    public User(String username, String usertype, String name) {
        this.userName = username;
        this.userType = usertype;
        this.name = name;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return userName;
    }

    public String getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }


}
