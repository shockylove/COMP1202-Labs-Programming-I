package lab4part2;

import java.util.SplittableRandom;

/*
A User:
has a username e.g 'fj3'
has a userType which can be: 'user', 'editor' or 'admin'
has a name e.g 'Francis'
has a constructor which takes the username, userType and name as parameters
has a getUsername() method
has a getUserType() method
has a getName() method
has a setUserType() method which takes one of the user types as a parameter


**/
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
