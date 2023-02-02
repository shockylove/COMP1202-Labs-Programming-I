package lab4part1;


/*Prints a times table
1.The user will specify the multiplication table to calculate, which you should obtain from the command line using Toolbox.
 You must instanitate Toolbox from the main method.
Use a simple for loop to output a multiplication table up to 20 times the number specified by the user.
For example if the user specifies 2,
you would output 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40 (you may choose how to lay this out)
2.Calculate how many successive integers to add to make a total over 500
Use a while loop to sum consecutive integers starting from 1 (eg. 1+2+3...), until the sum of those integers is greater than 500.
Your code should print how many iterations were required to do this.
**/
public class Main {
    public static void main(String[] args){

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
        System.out.println(z-1);


    }



}
