import java.util.Scanner;

public class vender {
    public static void payment() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment received ✅");
        System.out.println("\nThank you for shopping 😉!\n");
    }

    public static void invalidinput() {
        System.out.println("\n-!! Invalid Input, Please try again !! !!-\n");
    }

    public static void menu() {
        System.out.print("\n 1) confirm\n 0) exit \n->>Enter : ");
    }

    public static void main(String[] args) {
        String[] itmes = { "Water", "Vodka", "Corona extra", "Mango juice", "Coco cola" };
        String[] quantity = { "0.5L", "1L", "2L", "5L" };
        int[] water = { 50, 100, 200, 500 };
        int[] vodka = { 500, 1000, 2000, 5000 };
        int[] corona_extra = { 300, 600, 1200, 2500 };
        int[] mango_juice = { 100, 200, 400, 1000 };
        int[] coco_cola = { 40, 80, 150, 300 };
        // int[] stock = {10,10,10,10,10};

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nWelcome in Snehil's BAR");
        System.out.print("\nEnter to continue ");
        String in = input.nextLine();

        System.out.println("\n-> What would you like to Drink ??\n");
        for (int itmeNum = 0; itmeNum < itmes.length; itmeNum++) {
            System.out.println(itmeNum + ") " + itmes[itmeNum]);
        }
        System.out.print("\n->> Enter Itme index(example: 0) : ");
        int drinkChoice = input.nextInt();

        switch (drinkChoice) {
            case 0:
                System.out.println("-> You have choose : " + itmes[drinkChoice]);
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
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + water[quantityChoice] + " Rs");
                        System.out.println("Insert " + water[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 1) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + water[quantityChoice] + " Rs");
                        System.out.println("Insert " + water[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 2) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + water[quantityChoice] + " Rs");
                        System.out.println("Insert " + water[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 3) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + water[quantityChoice] + " Rs");
                        System.out.println("Insert " + water[quantityChoice] + " Rs");
                        payment();
                    } else {
                        invalidinput();
                    }
                } else if (userinput == 0) {
                    System.exit(0);
                } else {
                    invalidinput();
                }

                break;

            case 1:
                System.out.println("-> You have choose : " + itmes[drinkChoice]);
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
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + vodka[quantityChoice] + " Rs");
                        System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 1) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + vodka[quantityChoice] + " Rs");
                        System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 2) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + vodka[quantityChoice] + " Rs");
                        System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 3) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + vodka[quantityChoice] + " Rs");
                        System.out.println("Insert " + vodka[quantityChoice] + " Rs");
                        payment();
                    } else {
                        invalidinput();
                    }
                } else if (userinput1 == 0) {
                    System.exit(0);
                } else {
                    invalidinput();
                }
                break;

            case 2:
                System.out.println("-> You have choose : " + itmes[drinkChoice]);
                menu();
                int userinput2 = input.nextInt();
                if (userinput2 == 1) {
                    System.out.println("\n-> How much quantity would you like ?");
                    System.out.println("--> Here are options :\n");
                    for (int qu = 0; qu < quantity.length; qu++)
                        System.out.println(qu + ") " + quantity[qu] + " : " + corona_extra[qu] + " Rs");
                    System.out.print("\n->> Enter Itme index(example: 0) : ");
                    int quantityChoice = input.nextInt();

                    if (quantityChoice == 0) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + corona_extra[quantityChoice] + " Rs");
                        System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 1) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + corona_extra[quantityChoice] + " Rs");
                        System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 2) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + corona_extra[quantityChoice] + " Rs");
                        System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 3) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + corona_extra[quantityChoice] + " Rs");
                        System.out.println("Insert " + corona_extra[quantityChoice] + " Rs");
                        payment();
                    } else {
                        invalidinput();
                    }
                } else if (userinput2 == 0) {
                    System.exit(0);
                } else {
                    invalidinput();
                }
                break;

            case 3:
                System.out.println("-> You have choose : " + itmes[drinkChoice]);
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
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + mango_juice[quantityChoice] + " Rs");
                        System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 1) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + mango_juice[quantityChoice] + " Rs");
                        System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 2) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + mango_juice[quantityChoice] + " Rs");
                        System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 3) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + mango_juice[quantityChoice] + " Rs");
                        System.out.println("Insert " + mango_juice[quantityChoice] + " Rs");
                        payment();
                    } else {
                        invalidinput();
                    }
                } else if (userinput3 == 0) {
                    System.exit(0);
                } else {
                    invalidinput();
                }
                break;

            case 4:
                System.out.println("-> You have choose : " + coco_cola[drinkChoice]);
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
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + coco_cola[quantityChoice] + " Rs");
                        System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 1) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + coco_cola[quantityChoice] + " Rs");
                        System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 2) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + coco_cola[quantityChoice] + " Rs");
                        System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                        payment();
                    } else if (quantityChoice == 3) {
                        System.out.println("-> You have choose : " + quantity[quantityChoice] + " -> "
                                + coco_cola[quantityChoice] + " Rs");
                        System.out.println("Insert " + coco_cola[quantityChoice] + " Rs");
                        payment();
                    } else {
                        invalidinput();
                    }
                } else if (userinput4 == 0) {
                    System.exit(0);
                } else {
                    invalidinput();
                }
                break;

            default:
                invalidinput();
                break;
        }
        input.close();
    }
}