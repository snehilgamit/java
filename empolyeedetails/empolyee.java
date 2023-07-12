
// Write a java program to display user details using Scanner class ;

package empolyeedetails;

import java.util.Scanner;

class data{
    String name,gender,address,phoneNumber,emailAddress;
    int age,pincode; 

    public data(String name, String gender, int age,String phoneNumber,String emailAddress,String address,int pincode){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
        this.address=address;
        this.pincode=pincode;
    }
    public void details(){
        System.out.println("\nYour details is printed, please check below:");
        System.out.println("Name : "+name);                             //display user Name
        System.out.println("Gender : "+gender);                         //display user Gender
        System.out.println("Age : "+age);                               //display user Age
        System.out.println("Phonenumber : "+phoneNumber);               //display user phoneNumber
        System.out.println("Email-address : "+emailAddress);            //display user emailAddress
        System.out.println("Address : "+address);                       //display user Address
        System.out.println("Pincode :\n"+pincode);                       //display user pincode
    }
}
public class empolyee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your details below :\n"); 
        System.out.print("Enter your name :");
        String name = input.nextLine();                         
        System.out.print("Enter your gender:");
        String gender = input.nextLine();
        System.out.print("Enter your age :");
        int age = input.nextInt();
        System.out.print("Enter your Phone number :");
        input.nextLine();
        String phoneNumber = input.nextLine();
        System.out.print("Enter your Email address :");
        String emailAddress = input.nextLine();
        System.out.print("Enter your address :");
        String address = input.nextLine();
        System.out.print("Enter your pincode :");
        int pincode = input.nextInt();

        data data = new data(name, gender, age, phoneNumber, emailAddress, address, pincode);
        data.details();
    }
}
