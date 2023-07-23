import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String userName;
        System.out.print("\n$ Annie : ");
        String enteryourUsername = "Apna username daliye.";
        String[] enteryourUsernameArr = enteryourUsername.split("");


        for(int i = 0;i<enteryourUsernameArr.length;i++){
        System.out.print(enteryourUsernameArr[i]);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }}

        System.out.print("\n$ User : ");
        userName = input.nextLine();
        String enterWelcome = "Aapka swagat hain ";
        String[] enterWelcomeArr = enterWelcome.split("");

        String enterHavenice = ", Aapka din khusal mangal rahe ! Main aapki kese sahayta kar sakati hu?\n";
        String[] enterHaveniceArr = enterHavenice.split("");

        System.out.print("$ Annie : ");
        for(int i = 0;i<enterWelcomeArr.length;i++){
        System.out.print(enterWelcomeArr[i]);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }}
        System.out.print(userName);
        for(int i = 0;i<enterHaveniceArr.length;i++){
        System.out.print(enterHaveniceArr[i]);
        try {
            Thread.sleep(50);
        } catch (Exception e) {
        }}
        while(true){
        System.out.print("$ User : ");
        String userInput = input.nextLine().trim().toLowerCase();
        
            switch(userInput){
                case "hi":
                case "hii":
                case "hiii":
                case "hello":
                case "hey":
                    System.out.println("$ Annie : Hello "+userName+" babu, kese ho :)");
                    break;
                case "kesi ho":
                case "kesi ho?":
                case "kesa chal raha he":
                case "kesa chal raha he?":
                case "kesa he aap":
                case "kesa he aap?":
                System.out.println("$ Annie : Me thik hu babu app kese ho :)");
                break;

                default:
                System.out.print("$ Annie : ");
            }
        }
    }
}
