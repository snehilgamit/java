import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class otp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String otpStore = "otpstore/otpStore.txt";
        String userMessager = "userMessager.txt";
        int otp = 0;
        int userinput=0;
        String otpStr;
        int limit = 4;
        while (otp==userinput) {
            try {
                otp = (int) Math.floor(Math.random() * (999999 - 100000 + 1) + 100000);
                otpStr = Integer.toString(otp);
                FileWriter writeOTP = new FileWriter(new File(otpStore));
                FileWriter sendOTP = new FileWriter(new File(userMessager));
                writeOTP.write(otpStr);
                sendOTP.write(otpStr);
                writeOTP.close();
                sendOTP.close();
            } catch (Exception e) {
            }
            for (int i = 0; i <= limit; i++) {
                System.out.print("Enter your OTP : ");
                    userinput = input.nextInt();
                if (userinput == otp) {
                    System.out.println("-->  OTP is Correct ✅");
                    System.exit(0);
                } else if (limit == i) {
                    System.out.println("\nYou have tried to many times come back later.\n");
                } else {
                    System.out.println("\nYou have only " + (limit - i) + " chances left !\n");
                    System.out.print("Want another OTP ? \n1] Yes\n2] No\n--> Enter - ");
                    int inputoption = input.nextInt();
                    if (inputoption == 1) {
                        try {
                            otp = (int) Math.floor(Math.random() * (999999 - 100000 + 1) + 100000);
                            otpStr = Integer.toString(otp);
                            FileWriter writeOTP = new FileWriter(new File(otpStore));
                            FileWriter sendOTP = new FileWriter(new File(userMessager));
                            writeOTP.write(otpStr);
                            sendOTP.write(otpStr);
                            writeOTP.close();
                            sendOTP.close();
                        } catch (Exception e) {
                        }
                    } else if (inputoption == 2) {

                    } else {
                        System.out.println("// Invalid Input //");
                    }
                }
            }
            input.close();
        }
    }
}