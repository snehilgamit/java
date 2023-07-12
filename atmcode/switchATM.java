// @snehilgamit 
// This code only for learing purpose.There are many bugs or many other type of writing code easly, better syntax :)
import java.util.Scanner;

public class switchATM {
    public static void main(String[] args) {
        int balance = 2000, withdraw, deposit;
        Scanner Input = new Scanner(System.in);
        System.out.println("\nWelcome in Reserve Bank of Snehil ATM\n");
        while(true)
        {

        System.out.println("->For check balance enter [1]\n->For withdraw money enter [2]\n->For deposit enter [3]\n->For exit enter [0]");
        int userinput = Input.nextInt();


        switch (userinput){
            case 1:
                System.out.println("your balance is : "+balance);
                break;
            case 2:
                System.out.println("Withdraw money 😉");
                System.out.print("Enter amount 😁: ");
                int amount = Input.nextInt();
                System.out.println("Money deducted:)😎");
                int newbalance = balance-amount;
                System.out.println("new balance is : "+newbalance);
                break;

            case 3:
                System.out.println("deposit money 😉");
                System.out.print("Enter amount 😁: ");
                int depositamount = Input.nextInt();
                if(depositamount<=0){
                    System.out.println("Enter valid amount:) 🥲");
                }

                else {
                System.out.println("Money has been added:)😎");
                int newdepositbalance = balance+depositamount;
                System.out.println("new balance is : "+newdepositbalance);}
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("invalid Input");
        }

        System.out.println("visit again in Reserve Bank of Snehil ATM ");
    }}
}