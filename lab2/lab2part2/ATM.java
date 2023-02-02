package lab2.lab2part2;

public class ATM {
    public static void main(String[] args){
        ATM  myATM = new ATM();
        ATM.go();
    }

    public static void go(){
        Toolbox myToolbox = new Toolbox();
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

        while(true)
        {
            System.out.println("What do you want to do?\n" +
                    "1 : Withdraw\n" +
                    "2 : Deposit\n" +
                    "3 : Inquire\n" +
                    "4 : Quit\n" );


            int choice = myToolbox.readIntegerFromCmd();
            if(choice == 1)
            {
                    amount = withdraw(amount);
            }
            else if(choice ==2)
            {
                amount = deposit(amount);
            }
            else if (choice == 3)
            {
                inquire(amount);
            }
            else if(choice == 4)
            {
                quit();
            }
            else
            {
                System.out.println("Wrong choice");
            }
        }

    }

    public static int withdraw(int amount){
        System.out.println("*****************************************\n" +
                "              Withdrawal                 \n" +
                "*****************************************\n" +
                "How much would you like to withdraw?\n" );
        Toolbox myToolbox = new Toolbox();
        int withdraw = 0;
        while (true)
        {
            withdraw = myToolbox.readIntegerFromCmd();
            if(withdraw >=0 && withdraw<= amount)
            {
                amount += withdraw;
                System.out.println("*****************************************\n" +
                        "         Your new balance is " +
                        amount+ "  \n" +
                        "***************************************** ");
                break;
            }else{
                System.out.println("Wrong number");
            }
        }
        return amount;
    }

    public static int deposit(int amount){
        System.out.println("*****************************************\n" +
                "              Deposit                 \n" +
                "*****************************************\n" +
                "How much would you like to deposit?\n" );
        Toolbox myToolbox = new Toolbox();
        int withdraw = 0;
        while (true)
        {
            withdraw = myToolbox.readIntegerFromCmd();
            if(withdraw >=0 && withdraw<= amount)
            {
                amount -= withdraw;
                System.out.println("*****************************************\n" +
                        "         Your new balance is " +
                        amount+ "  \n" +
                        "***************************************** ");
                break;
            }else{
                System.out.println("Wrong number");
            }
        }
        return amount;
    }

    public static void inquire(int amount){
        System.out.println("*****************************************\n" +
                "          Your balance is" +
                amount +"  \n" +
                "***************************************** ");
    }

    public static void quit(){
        System.out.println("******************************************\n" +
                "         GoodBye!\n" +
                "******************************************");
        System.exit(0);
    }

}
