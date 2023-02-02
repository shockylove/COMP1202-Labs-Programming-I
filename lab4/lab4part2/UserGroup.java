package lab4part2;

import java.util.ArrayList;

/**
 * The UserGroup class must have an ArrayList of Users.
 * Write a constructor for the UserGroup class. It should instantiate the ArrayList<User>.
 * In the UserGroup class write a method called getUsers, which returns the ArrayList<User>.
 * In the UserGroup class write a method called addSampleData,
 * which creates 10 Users and using the ArrayList's add() method put the 10 new User objects into the ArrayList.
 *
 * In UserGroup write a getUser method which returns the 3rd User in the list.
 *
 * Change the method to so it takes an int as a parameter and returns the User in that slot of the ArrayList.
 *
 * In UserGroup write a printUsernames() method in UserGroup:
 * Using an enhanced for loop (see above),
 * loop through the ArrayList and print the username and userType of each user in the ArrayList.
 * The username and userType must be separated by a single space, and nothing else. e.g:
 * */
public class UserGroup {
    ArrayList<User> users;


    public UserGroup() {
        users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }


    //pattern of using  while loop to create objectives in arraylist.
    public void addSampleData(){
        User user1 = new User("john", "user", "John Smith");
        User user2 = new User("soton", "admin", "Southampton");
        User user3 = new User("snowden", "admin", "Edward Snowden");
        User user4 = new User("isolutions", "admin", "iSolutions");
        User user5 = new User("i<3maths", "editor", "John Doe");
        User user6 = new User("oscar", "user", "Oscar Smith");
        User user7 = new User("z3no", "user", "Zeno Dude");
        User user8 = new User("j4n3", "editor", "Jane Smith");
        User user9 = new User("sesh", "user", "Zach Sutherland");
        User user10 = new User("jojo", "editor", "Joanna Cooke");
        this.users.add(user1);
        this.users.add(user2);
        this.users.add(user3);
        this.users.add(user4);
        this.users.add(user5);
        this.users.add(user6);
        this.users.add(user7);
        this.users.add(user8);
        this.users.add(user9);
        this.users.add(user10);
         /*
        int i = 1;
        while(i <=10){
            User usera = new User("nima","shige","shabi");
            this.users.add(usera);
            i++;}
            */

    }

    //watch out this is User type, not UserGroup type
    public User getUser(int Index){
        return users.get(Index);
    }

    public void printUsernames(){
        for(User i : users){
            System.out.println(i.getUsername() + " " + i.getUserType());
        }
    }
}
