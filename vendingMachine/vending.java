

// @snehilgamit 
// This code only for learing purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)


import java.util.Scanner;

public class vending {


    // PAYMENT SYSTEM QUARY
    public static void payment() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment received ✅");
        System.out.println("\nThank you for shopping 😉!\n");
    }



    // INVALID SYSTEM QUARY
    public static void invalidinput() {
        System.out.println("\n-!! Invalid Input, Please try again !!-\n");
    }



    // OUT OF STOCK SYSTEM QUARY
    public static void outofstock() {
        System.out.println("\n !!- Out of Stock -!!");
    }


     // MENU SYSTEM QUARY
    public static void menu() {
        System.out.print("\n 1) confirm\n 0) exit \n->>Enter : ");
    }


     // STOCK CHECKING SYSTEM QUARY
    public static void stockcheck(int[] stock, String[] itmes) {
        for (int i = 0; i < stock.length; i++) {
            if (0 < stock[i]) {
                System.out.println(stock[i] + " quantity -> " + itmes[i]);
            } else {
                System.out.println("Stock out -> " + itmes[i]);
            }
        }
    }
    // public static void case0Quantity(int quantityChoice,int drinkChoice, int[] stock, int[] itmes,int userinput){

    // }

    public static void main(String[] args) {
        String[] itmes = { "Water", "Vodka", "Corona extra", "Mango juice", "Coco cola" };
        String[] quantity = { "0.5L", "1L", "2L", "5L" };
        int[] water = { 50, 100, 200, 500 };
        int[] vodka = { 500, 1000, 2000, 5000 };
        int[] corona_extra = { 300, 600, 1200, 2500 };
        int[] mango_juice = { 100, 200, 400, 1000 };
        int[] coco_cola = { 40, 80, 150, 300 };
        int[] stock = { 2, 1, 3, 0, 1 };

        Scanner input = new Scanner(System.in);
        System.out.println("\n\nWelcome in Snehil's BAR");                          // WELCOME MESSAGE
        System.out.print("\nEnter to continue ");                                   // ENTER TO CONTINUE 
        String in = input.nextLine();
        while (true) {                                                                // LOOP FOR AGAIN AND AGAIN SHOPPING 
            System.out.println("\n-> What would you like to Drink ??\n");           // DRINK CHOOSE MESSAGE
            for (int itmeNum = 0; itmeNum < itmes.length; itmeNum++) {                // PRINT ALL ITMES USING FOR LOOP
                System.out.println(itmeNum + ") " + itmes[itmeNum]);
            }
            System.out.print("\n->> Enter Itme index(example: 0) : ");               // ASKING TO USER FOR 
            int drinkChoice = input.nextInt();                                         // USER INPUT FOR DRINK CHOOSE

            switch (drinkChoice) {                                                     // Drink CHOOSE USING SWITCH CASE 
                case 0:
                    if (stock[drinkChoice] > 0) {                                           // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]);   // DRINK CHOOSE MESSAGE 
                        menu();
                        int userinput = input.nextInt();                               
                        if (userinput == 1) {
                            System.out.println("\n-> How much quantity would you like ?");
                            System.out.println("--> Here are options :\n");
                            for (int qu = 0; qu < quantity.length; qu++)
                                System.out.println(qu + ") " + quantity[qu] + " : " + water[qu] + " Rs");
                            System.out.print("\n->> Enter Itme index(example: 0) : ");
                            int quantityChoice = input.nextInt();

                            if (quantityChoice == 0) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "   // DRINK CHOOSE MESSAGE 
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "   // DRINK CHOOSE MESSAGE 
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 2) { 
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "   // DRINK CHOOSE MESSAGE 
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "   // DRINK CHOOSE MESSAGE 
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else {
                                invalidinput();                 // INVALID INPUT MESSAGE
                            }
                        } else if (userinput == 0) {
                            System.exit(0);
                        } else {
                            invalidinput();                     // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock();                           // OUT OF STOCK MESSAGE
                    }

                    break;

                case 1:
                    if (stock[drinkChoice] > 0) {                                                                // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]);                        // DRINK CHOOSE MESSAGE 
                        menu();
                        int userinput1 = input.nextInt();
                        if (userinput1 == 1) {
                            System.out.println("\n-> How much quantity would you like ?");
                            System.out.println("--> Here are options :\n");
                            for (int qu = 0; qu < quantity.length; qu++)
                                System.out.println(qu + ") " + quantity[qu] + " : " + vodka[qu] + " Rs");
                            System.out.print("\n->> Enter Itme index(example: 0) : ");
                            int quantityChoice = input.nextInt();

                            if (quantityChoice == 0) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "     // DRINK CHOOSE MESSAGE 
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 1) {  
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "      // DRINK CHOOSE MESSAGE 
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "       // DRINK CHOOSE MESSAGE 
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "       // DRINK CHOOSE MESSAGE 
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else {
                                invalidinput();         // INVALID INPUT MESSAGE
                            }
                        } else if (userinput1 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput();             // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock();                   // OUT OF STOCK MESSAGE
                    }
                    break;

                case 2:
                    if (stock[drinkChoice] > 0) {                                                                    // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]);                            // DRINK CHOOSE MESSAGE 
                        menu();
                        int userinput2 = input.nextInt();
                        if (userinput2 == 1) {
                            System.out.println("\n-> How much quantity would you like ?");
                            System.out.println("--> Here are options :\n");
                            for (int qu = 0; qu < quantity.length; qu++)
                                System.out.println(qu + ") " + quantity[qu] + " : " + corona_extra[qu] + " Rs");     // DRINK CHOOSE MESSAGE 
                            System.out.print("\n->> Enter Itme index(example: 0) : ");
                            int quantityChoice = input.nextInt();

                            if (quantityChoice == 0) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "       // DRINK CHOOSE MESSAGE 
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "       // DRINK CHOOSE MESSAGE 
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "       // DRINK CHOOSE MESSAGE 
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "       // DRINK CHOOSE MESSAGE 
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else {
                                invalidinput();              // INVALID INPUT MESSAGE
                            }
                        } else if (userinput2 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput();                 // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock();                   // OUT OF STOCK MESSAGE
                    }
                    break;

                case 3:
                    if (stock[drinkChoice] > 0) {                                                                    // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]);                            // DRINK CHOOSE MESSAGE 
                        menu();
                        int userinput3 = input.nextInt();
                        if (userinput3 == 1) {
                            System.out.println("\n-> How much quantity would you like ?");
                            System.out.println("--> Here are options :\n");
                            for (int qu = 0; qu < quantity.length; qu++)
                                System.out.println(qu + ") " + quantity[qu] + " : " + mango_juice[qu] + " Rs");
                            System.out.print("\n->> Enter Itme index(example: 0) : ");
                            int quantityChoice = input.nextInt();

                            if (quantityChoice == 0) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "        // DRINK CHOOSE MESSAGE 
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "         // DRINK CHOOSE MESSAGE 
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "          // DRINK CHOOSE MESSAGE 
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "           // DRINK CHOOSE MESSAGE 
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else {
                                invalidinput();           // INVALID INPUT MESSAGE
                            }
                        } else if (userinput3 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput();              // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock();                    // OUT OF STOCK MESSAGE
                    }
                    break;

                case 4:
                    if (stock[drinkChoice] > 0) {                                                                        // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]);                                // DRINK CHOOSE MESSAGE 
                        menu();
                        int userinput4 = input.nextInt();
                        if (userinput4 == 1) {
                            System.out.println("\n-> How much quantity would you like ?");
                            System.out.println("--> Here are options :\n");
                            for (int qu = 0; qu < quantity.length; qu++)
                                System.out.println(qu + ") " + quantity[qu] + " : " + coco_cola[qu] + " Rs");
                            System.out.print("\n->> Enter Itme index(example: 0) : ");
                            int quantityChoice = input.nextInt();

                            if (quantityChoice == 0) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "           // DRINK CHOOSE MESSAGE 
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "            // DRINK CHOOSE MESSAGE 
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "            // DRINK CHOOSE MESSAGE 
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else if (quantityChoice == 3) {       
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "             // DRINK CHOOSE MESSAGE 
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                stock[drinkChoice] = stock[drinkChoice] - 1;
                                payment();
                            } else {
                                invalidinput();                  // INVALID INPUT MESSAGE
                            }
                        } else if (userinput4 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput();                     // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock();                           // OUT OF STOCK MESSAGE
                    }
                    break;

                default:
                    invalidinput();                         // INVALID INPUT MESSAGE
                    break;
            }
        }
    }
}