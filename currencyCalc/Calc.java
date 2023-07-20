import java.util.Scanner;

public class Calc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int USDT = 88;
        System.out.print("\n$ Enter - 1 for INR to USDT \n$ Enter - 2 for USDT to INR\n$ ");
        int userinput = input.nextInt();
        switch (userinput) {
            case 1:
                System.out.println("$ INR to USDT");
                System.out.print("$ Enter your INR value : ");
                int usertemp = input.nextInt();
                int tempValue = usertemp/USDT;
                System.out.println("$ You will get --> "+tempValue+"$");
                break;
            case 2:
                System.out.println("$ USDT to INR");
                System.out.print("$ Enter your USDT value : ");
                usertemp = input.nextInt();
                tempValue = usertemp*USDT;
                System.out.println("$ You will get --> "+tempValue+"\u20B9");
                break;
            default:
            System.out.println("$ invalid input");
                break;
        }
        input.close();
    }
}