
// @snehilgamit 
// This code only for learing purpose.There many bug or many other type of writing code easly, better syntax :) 


import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        int userbalance = 2000;
        int userpin = 1234;
        int newbalance = userbalance;
        int[] history = new int[100];
        int historyindex =0;
        int i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome in snehil reserve bank !");

        while (true) {
            System.out
                    .println(
                            "\n1] Check balance \n2] Withdraw money \n3] Deposit money \n4] Check bank history \n0] Exit");
            System.out.print("Enter your input : ");

            int userinput = input.nextInt();

            if (userinput != 0) {
                if (userinput != 1) {
                    if (userinput != 2) {
                        if (userinput != 3) {
                            if (userinput != 4) {
                                System.out.println("INVALID INPUT !");
                            } else {
                                System.out.println("This is your bank history: ");
                                for (i=0;i<historyindex; i++){
                                System.out.println(history[i]);
                                }
                                
                            }
                        } else {
                            System.out.println("how much you want to Deposit : ");
                            int depositamount = input.nextInt();
                            if (depositamount < 0) {
                                System.out.println("INVALID INPUT !");
                            } else {
                                System.out.println("Enter your private pin : ");
                                int inputpin = input.nextInt();
                                if (inputpin == userpin) {
                                    System.out.println("Put your money !");
                                    try {
                                    Thread.sleep(8000);
                                    } catch (InterruptedException e) {

                                        e.printStackTrace();
                                    }
                                    System.out.println("Calculating Money please wait for min....");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {

                                        e.printStackTrace();
                                    }
                                    System.out.println("Total deposit amount is :"+depositamount);
                                    System.out.println("Successfull !\n");
                                    history[i] = +depositamount;
                                    i++;
                                    historyindex++;
                                    newbalance = newbalance + depositamount;
                                    System.out.println("1] Main menu\n0] Exit");
                                    int depositmenu = input.nextInt();
                                        if(depositmenu==1){
                                    }
                                    else if(depositmenu==0){
                                    System.out.println("Exiting..........");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {

                                        e.printStackTrace();
                                    }
                                    System.exit(0);
                                }
                                else{
                                    System.out.println("INVALID INPUT !");
                                }
                                } else {
                                    System.out.println("Invalid pin or wrong pin !");
                                }
                            }
                        }
                    } else {
                        System.out.print("How much you want to withdraw : ");
                        int withdrawamount = input.nextInt();
                        if (withdrawamount > newbalance || withdrawamount < 0) {
                            System.out.println("You have insufficient balance or Invalid input)");
                        } else {
                            System.out.println("Enter your private pin : ");
                            int inputpin = input.nextInt();
                            if (inputpin == userpin) {
                                history[i] = -withdrawamount;
                                historyindex++;
                                i++;
                                newbalance = newbalance - withdrawamount;
                                System.out.println("Processing please wait........\n");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {

                                    e.printStackTrace();
                                }
                                System.out.println("Withdraw successfull !\n");
                                System.out.println("1] Main menu\n0] Exit");
                                int withdrawmenu = input.nextInt();
                                if(withdrawmenu==1){
                                }
                                else if(withdrawmenu==0){
                                    System.out.println("Exiting........");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {

                                        e.printStackTrace();
                                    }
                                    System.exit(0);
                                }
                                else{
                                    System.out.println("INVALID INPUT !");
                                }
                            } else {
                                System.out.println("Invalid pin or wrong pin !");
                                System.out.println("Try again later !\n");
                            }
                        }
                    }
                } else {
                    System.out.println("User balance :" + newbalance);
                    System.out.println("\n1] Main menu\n0] Exit");
                                int balancemenu = input.nextInt();
                                if(balancemenu==1){
                                }
                                else if(balancemenu==0){
                                    System.out.println("Exiting........");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {

                                        e.printStackTrace();
                                    }
                                    System.exit(0);
                                }
                                else{
                                    System.out.println("INVALID INPUT !");
                                }
                }
            } else {
                System.exit(0);
            }
        }
    }
}

