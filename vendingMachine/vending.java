
// @snehilgamit 
// This code only for learning purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)

import java.io.BufferedReader;
// import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
// import java.io.PrintWriter;
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

    public static void main(String[] args) throws FileNotFoundException {
        // FILES LOCATION
        String waterstocks = ("waterstocks.txt");
        String vodkastocks = ("vodkastocks.txt");
        String coronaextrastocks = ("coronaextrastock.txt");
        String mangojuicestocks = ("mangojuicestock.txt");
        String cococolastocks = ("cococolastock.txt");

        int waterstock = 0;
        int waterstockint = 0;
        int vodkastock = 0;
        int vodkastockint = 0;
        int coronaextrastock = 0;
        int coronaextratockint = 0;
        int mangojuicestock = 0;
        int mangojuicestockint = 0;
        int cococolastock = 0;
        int cococolastockint = 0;

        // ITMES DETAILS
        String[] itmes = { "Water", "Vodka", "Corona extra", "Mango juice", "Coco cola" };
        String[] quantity = { "0.5L", "1L", "2L", "5L" };
        int[] water = { 50, 100, 200, 500 };
        int[] vodka = { 500, 1000, 2000, 5000 };
        int[] corona_extra = { 300, 600, 1200, 2500 };
        int[] mango_juice = { 100, 200, 400, 1000 };
        int[] coco_cola = { 40, 80, 150, 300 };

        try {
            BufferedReader waterread = new BufferedReader(new FileReader(waterstocks));
            String waterstockstr = waterread.readLine();
            waterstockint = Integer.parseInt(waterstockstr);
            waterstock = waterstock + waterstockint;
            waterread.close();


            BufferedReader vodkaread = new BufferedReader(new FileReader(vodkastocks));
            String vodkastockstr = vodkaread.readLine();
            vodkastockint = Integer.parseInt(vodkastockstr);
            vodkastock = vodkastock + vodkastockint;
            vodkaread.close();


            BufferedReader coronaextraread = new BufferedReader(new FileReader(coronaextrastocks));
            String coronaextrastr = coronaextraread.readLine();
            coronaextratockint = Integer.parseInt(coronaextrastr);
            coronaextrastock = coronaextrastock + coronaextratockint;
            coronaextraread.close();


            BufferedReader mangojuiceread = new BufferedReader(new FileReader(mangojuicestocks));
            String mangojuicestockstr = mangojuiceread.readLine();
            mangojuicestockint = Integer.parseInt(mangojuicestockstr);
            mangojuicestock = mangojuicestock + mangojuicestockint;
            mangojuiceread.close();


            BufferedReader cococolaread = new BufferedReader(new FileReader(cococolastocks));
            String cococolastockstr = cococolaread.readLine();
            cococolastockint = Integer.parseInt(cococolastockstr);
            cococolastock = cococolastock + cococolastockint;
            cococolaread.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\n\nWelcome in Snehil's BAR"); // WELCOME MESSAGE
        System.out.print("\nEnter to continue "); // ENTER TO CONTINUE
        String in = input.nextLine();
        while (true) { // LOOP FOR AGAIN AND AGAIN SHOPPING
            System.out.println("\n-> What would you like to Drink ??\n"); // DRINK CHOOSE MESSAGE
            for (int itmeNum = 0; itmeNum < itmes.length; itmeNum++) { // PRINT ALL ITMES USING FOR LOOP
                System.out.println(itmeNum + ") " + itmes[itmeNum]);
            }
            System.out.print("\n->> Enter Itme index(example: 0) : "); // ASKING TO USER FOR
            int drinkChoice = input.nextInt(); // USER INPUT FOR DRINK CHOOSE

            switch (drinkChoice) { // DRINK CHOOSE USING SWITCH CASE
                case 0:
                    if (waterstock > 0) { // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]); // DRINK CHOOSE MESSAGE
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
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");

                                waterstock = waterstock - 1;
                                try {
                                    FileWriter write = new FileWriter(waterstocks);
                                    write.write(Integer.toString(waterstock));
                                    write.close();
                                } catch (Exception e) {
                                }

                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");
                                waterstock = waterstock - 1;
                                try {
                                    FileWriter write = new FileWriter(waterstocks);
                                    write.write(Integer.toString(waterstock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");
                                waterstock = waterstock - 1;
                                try {
                                    FileWriter write = new FileWriter(waterstocks);
                                    write.write(Integer.toString(waterstock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + water[quantityChoice] + " Rs");
                                System.out.println("Insert " + water[quantityChoice] + " Rs");
                                waterstock = waterstock - 1;
                                try {
                                    FileWriter write = new FileWriter(waterstocks);
                                    write.write(Integer.toString(waterstock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else {
                                invalidinput(); // INVALID INPUT MESSAGE
                            }
                        } else if (userinput == 0) {
                            System.exit(0);
                        } else {
                            invalidinput(); // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock(); // OUT OF STOCK MESSAGE
                    }

                    break;

                case 1:
                    if (vodkastock > 0) { // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]); // DRINK CHOOSE MESSAGE
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
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                vodkastock = vodkastock - 1;
                                try {
                                    FileWriter write = new FileWriter(vodkastocks);
                                    write.write(Integer.toString(vodkastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                vodkastock = vodkastock - 1;
                                try {
                                    FileWriter write = new FileWriter(vodkastocks);
                                    write.write(Integer.toString(vodkastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                vodkastock = vodkastock - 1;
                                try {
                                    FileWriter write = new FileWriter(vodkastocks);
                                    write.write(Integer.toString(vodkastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + vodka[quantityChoice] + " Rs");
                                System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                                vodkastock = vodkastock - 1;
                                try {
                                    FileWriter write = new FileWriter(vodkastocks);
                                    write.write(Integer.toString(vodkastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else {
                                invalidinput(); // INVALID INPUT MESSAGE
                            }
                        } else if (userinput1 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput(); // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock(); // OUT OF STOCK MESSAGE
                    }
                    break;

                case 2:
                    if (coronaextrastock > 0) { // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]); // DRINK CHOOSE MESSAGE
                        menu();
                        int userinput2 = input.nextInt();
                        if (userinput2 == 1) {
                            System.out.println("\n-> How much quantity would you like ?");
                            System.out.println("--> Here are options :\n");
                            for (int qu = 0; qu < quantity.length; qu++)
                                System.out.println(qu + ") " + quantity[qu] + " : " + corona_extra[qu] + " Rs"); // DRINK
                                                                                                                 // CHOOSE
                                                                                                                 // MESSAGE
                            System.out.print("\n->> Enter Itme index(example: 0) : ");
                            int quantityChoice = input.nextInt();

                            if (quantityChoice == 0) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                coronaextrastock = coronaextrastock - 1;
                                try {
                                    FileWriter write = new FileWriter(coronaextrastocks);
                                    write.write(Integer.toString(coronaextrastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                coronaextrastock = coronaextrastock - 1;
                                try {
                                    FileWriter write = new FileWriter(coronaextrastocks);
                                    write.write(Integer.toString(coronaextrastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                coronaextrastock = coronaextrastock - 1;
                                try {
                                    FileWriter write = new FileWriter(coronaextrastocks);
                                    write.write(Integer.toString(coronaextrastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + corona_extra[quantityChoice] + " Rs");
                                System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                                coronaextrastock = coronaextrastock - 1;
                                try {
                                    FileWriter write = new FileWriter(coronaextrastocks);
                                    write.write(Integer.toString(coronaextrastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else {
                                invalidinput(); // INVALID INPUT MESSAGE
                            }
                        } else if (userinput2 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput(); // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock(); // OUT OF STOCK MESSAGE
                    }
                    break;

                case 3:
                    if (mangojuicestock > 0) { // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]); // DRINK CHOOSE MESSAGE
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
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                mangojuicestock = mangojuicestock - 1;
                                try {
                                    FileWriter write = new FileWriter(mangojuicestocks);
                                    write.write(Integer.toString(mangojuicestock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                mangojuicestock = mangojuicestock - 1;
                                try {
                                    FileWriter write = new FileWriter(mangojuicestocks);
                                    write.write(Integer.toString(mangojuicestock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                mangojuicestock = mangojuicestock - 1;
                                try {
                                    FileWriter write = new FileWriter(mangojuicestocks);
                                    write.write(Integer.toString(mangojuicestock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + mango_juice[quantityChoice] + " Rs");
                                System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                                mangojuicestock = mangojuicestock - 1;
                                try {
                                    FileWriter write = new FileWriter(mangojuicestocks);
                                    write.write(Integer.toString(mangojuicestock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else {
                                invalidinput(); // INVALID INPUT MESSAGE
                            }
                        } else if (userinput3 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput(); // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock(); // OUT OF STOCK MESSAGE
                    }
                    break;

                case 4:
                    if (cococolastock > 0) { // STOCK CHECK FROM STOCK[]
                        System.out.println("-> You have choose : " + itmes[drinkChoice]); // DRINK CHOOSE MESSAGE
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
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                cococolastock = cococolastock - 1;
                                try {
                                    FileWriter write = new FileWriter(cococolastocks);
                                    write.write(Integer.toString(cococolastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 1) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                cococolastock = cococolastock - 1;
                                try {
                                    FileWriter write = new FileWriter(cococolastocks);
                                    write.write(Integer.toString(cococolastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 2) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                cococolastock = cococolastock - 1;
                                try {
                                    FileWriter write = new FileWriter(cococolastocks);
                                    write.write(Integer.toString(cococolastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else if (quantityChoice == 3) {
                                System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> " // DRINK
                                                                                                               // CHOOSE
                                                                                                               // MESSAGE
                                        + coco_cola[quantityChoice] + " Rs");
                                System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                                cococolastock = cococolastock - 1;
                                try {
                                    FileWriter write = new FileWriter(cococolastocks);
                                    write.write(Integer.toString(cococolastock));
                                    write.close();
                                } catch (Exception e) {
                                }
                                payment();
                            } else {
                                invalidinput(); // INVALID INPUT MESSAGE
                            }
                        } else if (userinput4 == 0) {
                            System.exit(0);
                        } else {
                            invalidinput(); // INVALID INPUT MESSAGE
                        }
                    } else {
                        outofstock(); // OUT OF STOCK MESSAGE
                    }
                    break;

                default:
                    invalidinput(); // INVALID INPUT MESSAGE
                    break;

            }
        }
    }
}
