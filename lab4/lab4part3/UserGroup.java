package lab4part3;
import java.util.ArrayList;
import java.util.Iterator;


public class UserGroup {
    ArrayList<User> users;


    //part2
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
    public User getUser(int index){
        return users.get(index);
    }

    //loop through Arraylist
    public void printUsernames(){
        for(User i : users){
            System.out.println(i.getUsername() + " " + i.getUserType());
        }
    }//part2 finish

    //part3
    /**
     * Why cannot I use "this.users.remove(0);"
     * and "this.users.remove(this.users.size() -1 );"
     * for these two method.
     * */
    public void removeFirstUser(){
        users.remove(0);
    }

    public void removeLastUser(){
        users.remove(this.users.size()-1);
    }

    //remove a user by username
    //have a String as parameter,which is the username need to be removed.
    //difficulty: 1 user obj has three variable, how to extract username
    //2 iterator through, adn judge
    public void removeUser(String username){
        Iterator<User> it = this.users.iterator();
        while(it.hasNext())
        {
            User user = it.next();
            if(user.getUsername().equals(username)) {
                it.remove();
            }
        }
    }

    //separate how consumers of your class loops through its items,
    // from how your class stores it.
    public Iterator<User> getUserIterator() {
        Iterator<User> it = users.iterator();
        return it;
    }




}

