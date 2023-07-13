// @snehilgamit 
// This code only for learing purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)

import java.util.Scanner;
public class using_nested_ifelse_ATM{
    public static void main(String[] args) {
        
        int userbalance = 2000;
        int userpin = 1234;
        int newbalance = userbalance;
        int[] history = new int[100];
        int historyindex = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome in snehil reserve bank !");
        meth meth = new meth(userbalance, userpin, newbalance, history, historyindex, i, 0, 0, 0, 0,0,0);
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
                                System.out.println("\nINVALID INPUT !");

                            } else 
                            {
                                meth.historyQuary();
                            }
                        }
                         else 
                         {
                         meth.depositQuary();
                         } 
                    }   
                     else
                     {
                     meth.withdrawQuary();
                     }
                    }
                else {
                    meth.balanceQuary();
                }
            }
            else {
                meth.exitATM();
            }
        }
     }
}


class meth {
    public int userbalance, userpin, newbalance, history[], historyindex, i, depositamount, depositmenu,
            withdrawamount, withdrawmenu, inputpin,load;

    public meth(int userbalance, int userpin, int newbalance, int[] history, int historyindex, int i,
            int depositamount, int depositmenu, int withdrawamount, int withdrawmenu, int inputpin,int load) {
        this.userbalance = userbalance;
        this.userpin = userpin;
        this.newbalance = newbalance;
        this.history = history;
        this.historyindex = historyindex;
        this.i = i;
        this.depositamount = depositamount;
        this.depositmenu = depositmenu;
        this.withdrawamount = withdrawamount;
        this.withdrawmenu = withdrawmenu;
        this.inputpin = inputpin;
        this.load=load;
    }





    // CODE FOR EXIT QUARY
    
    public void exitATM() {
        System.exit(0);
    }


    // CODE FOR BALANCE QUARY

    public void balanceQuary() {
        Scanner input = new Scanner(System.in);
        System.out.println("User balance :" + newbalance);
        System.out.println("\n1] Main menu\n0] Exit");
        int balancemenu = input.nextInt();
        if (balancemenu == 1) {
        } else if (balancemenu == 0) {
            System.out.print("\nExiting.");
            loading();
            System.exit(0);
        } else {
            System.out.println("\nINVALID INPUT !");
        }
    }

    // CODE FOR WITHDRAW QUARY

    public void withdrawQuary() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow much you want to withdraw : ");
        int withdrawamount = input.nextInt();
        if (withdrawamount > newbalance || withdrawamount < 0) {
            System.out.println("\nYou have insufficient balance or Invalid input)");
        } else {
            System.out.println("\nEnter your private pin : ");
            int inputpin = input.nextInt();
            if (inputpin == userpin) {
                history[i] = -withdrawamount;
                historyindex++;
                i++;
                newbalance = newbalance - withdrawamount;
                System.out.print("\nProcessing please wait");
                loading();
                System.out.println("\nWithdraw successfull !\n");
                System.out.println("\n1] Main menu\n0] Exit");
                System.out.print("\nEnter input :- ");
                int withdrawmenu = input.nextInt();
                if (withdrawmenu == 1) {
                } else if (withdrawmenu == 0) {
                    System.out.println("Exiting........");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                    System.exit(0);
                } else {
                    System.out.println("\nINVALID INPUT !");
                }
            } else {
                System.out.println("\nInvalid pin or wrong pin !");
                System.out.println("Try again later !\n");
            }
        }

    }




    // CODE FOR DEPOSIT QUARY

    public void depositQuary() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow much you want to Deposit : ");
        int depositamount = input.nextInt();
        if (depositamount < 0) {
            System.out.println("\nINVALID INPUT !");
        } else {
            System.out.print("\nEnter your private pin : ");
            int inputpin = input.nextInt();
            if (inputpin == userpin) {
                System.out.println("insert your cash !");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                System.out.print("\nCalculating Money please wait for min");
                loading();
    
                System.out.println("\n\nTotal deposit amount is : " + depositamount);
                System.out.println("Successfull !\n");
                history[i] = +depositamount;
                i++;
                historyindex++;
                newbalance = newbalance + depositamount;
                System.out.println("1] Main menu\n0] Exit");
                System.out.print("Enter input :- ");
                int depositmenu = input.nextInt();
                if (depositmenu == 1) {
                } else if (depositmenu == 0) {
                    System.out.print("Exiting.");
                    loading();
                    System.exit(0);
                } else {
                    System.out.println("INVALID INPUT !");
                }
            } else {
                System.out.println("Invalid pin or wrong pin !");
            }
        }

    }



    // CODE FOR HISTORY QUARY

    public void historyQuary() {
        System.out.println("This is your bank history: ");
        for (i = 0; i < historyindex; i++) {
            System.out.println(history[i]);
        }
    }

    public void loading(){
        for(int load =0;load<10;load++){
        System.out.print(".");
            try {
            Thread.sleep(200);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }
}