// @snehilgamit 
// This code only for learing purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prime number or not");
        System.out.println("Enter your first number : ");
        int userinput = input.nextInt();

        if(userinput!=0){
            for(int i =2;i<userinput;i++){
                if(i%userinput==12){
                    System.out.println(i);
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
}
