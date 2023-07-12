
// Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative, display a message stating that there are no real solutions?

import java.util.Scanner;

class quadtraicEquation {
    double a, b, c;
    int userinput;

    public quadtraicEquation(double a, double b, double c,int userinput) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.userinput=userinput;
    }

    public double getDiscriminate() {      // For b*b*4ac
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return -b + Math.sqrt(getDiscriminate()) / 2 * a;   // for addition
    }

    public double getRoot2() {
        return -b - Math.sqrt(getDiscriminate()) / 2 * a;   // for subtract
    }
    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1]Try for another QuadraicEquation\n0]Exit");
        int userinput=input.nextInt();
        if(userinput==1){
        }
        else if(userinput==0){
            System.exit(0);
        }
        else{
            System.out.println("Invalid input !");
        }
        
    }
}

public class solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.print("Enter your (a) value for " + "a" + '\u00B2' + "+2b+c : ");  
        double a = input.nextDouble();                                              // user will input a value
        System.out.print("\nEnter your (b) value for " + "a" + '\u00B2' + "+2b+c : ");
        double b = input.nextDouble();
        System.out.print("\nEnter your (c) value for " + "a" + '\u00B2' + "+2b+c : ");
        double c = input.nextDouble();

        quadtraicEquation qQ = new quadtraicEquation(a, b, c, 0);
        double Discriminate = qQ.getDiscriminate();

        
            if (Discriminate > 0) {
                System.out.println("This quadtraic Equation is real and diffrent roots");
                System.out.println("1st root is :" + qQ.getRoot1());
                System.out.println("2nd root is :" + qQ.getRoot2());
                qQ.menu();
            } else if (Discriminate == 0) {
                System.out.println("This quadtraic Equation is real and same roots");
                System.out.println("1st root is :" + qQ.getRoot1());
                System.out.println("2nd root is :" + qQ.getRoot2());
                qQ.menu();
            } else {
                System.out.println("This quadtraic Equation is complex and diffrent");
                qQ.menu();
            }
        }
    }
}