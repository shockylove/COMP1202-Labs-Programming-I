package lab4part3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        /*part1
        Toolbox myToolbox = new Toolbox();

        int x;
        x = myToolbox.readIntegerFromCmd();
        for(int i = 1 ; i<=20 ; i++)
        {
            int y = x*i;
            System.out.print(y +",");
        }

        int z = 1;
        int sum = 0;
        while(sum <=500)
        {
            sum = sum +  z;
            z++;
        }
        System.out.println(z-1);*/


        //part2
        UserGroup myUserGroup = new UserGroup();
        myUserGroup.addSampleData();
        myUserGroup.printUsernames();

        //part3
        UserGroup administrators = new UserGroup();
        Iterator<User> it = myUserGroup.getUserIterator();
        while(it.hasNext())
        {
            User a = it.next();
            if(a.getUserType().equals("admin"))
            {
                administrators.users.add(a);
            }
        }

        System.out.println("Printing all administrator names:");
        administrators.printUsernames();
        administrators.getUser(administrators.users.size()-1).setUserType("user");
        System.out.println("---Printing UserGroup for all Users:---");
        myUserGroup.printUsernames();
        System.out.println("---Printing administrators UserGroup:---");
        administrators.printUsernames();
    }




}
