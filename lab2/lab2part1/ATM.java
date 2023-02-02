package lab2.lab2part1;

public class ATM {


    public static void main(String[] args){
        ATM  myATM = new ATM();
        ATM.go();
    }

    public static void go(){
        Toolbox myToolbox;
        myToolbox = new Toolbox();
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");

        int amount  = 0;
        int input = 0;

        while (true)
        {
            input = myToolbox.readIntegerFromCmd();
            if(input >= 0 )
            {
                amount = input;
                break;
            }
            else
            {
                System.out.println("Wrong number, enter again");
            }
        }

        System.out.println(amount);



}
}
