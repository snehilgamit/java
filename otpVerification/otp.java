import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class otp {
    public static String getEncryptedValue(String otpStr, int key) {
        String otpEncy = "";
        for (int i = 0; i < otpStr.length(); i++) {
            char ch = otpStr.charAt(i);
            ch += key;
            otpEncy = otpEncy + ch;
        }
        return otpEncy;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String otpStore = "otpstore/otpStore.txt";
        String userMessager = "userMessager.txt";
        int otp =0;
        int userinput = 0;
        String otpStr;
        String otpEncy;
        int limit = 4;
        int key = 10;
        Timer timer =new Timer();
        TimerTask task = new TimerTask() {
            public void run(){
                System.out.println("\n$ Time out, re-run the code");
                System.exit(0);
            }
        };
        while (otp == userinput) {
            
            try {
                otp = (int) Math.floor(Math.random() * (999999 - 100000 + 1) + 100000);
                otpStr = Integer.toString(otp);
                FileWriter writeOTP = new FileWriter(new File(otpStore));
                FileWriter sendOTP = new FileWriter(new File(userMessager));
                otpEncy = getEncryptedValue(otpStr, key);
                writeOTP.write(otpEncy);
                sendOTP.write(otpStr);
                writeOTP.close();
                sendOTP.close();
            } catch (Exception e) {
            }
            for (int i = 0; i <= limit; i++) {
                timer.schedule(task, 15000);
                System.out.print("Enter your OTP : ");
                userinput = input.nextInt();
                task.cancel();

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
                            otpEncy = getEncryptedValue(otpStr, key);
                            writeOTP.write(otpEncy);
                            sendOTP.write(otpStr);
                            writeOTP.close();
                            sendOTP.close();
                        } catch (Exception e) {
                        }
                    } else if (inputoption == 2) {
                        task = new TimerTask() {
                         public void run(){
                System.out.println("\n$ Time out, re-run the code");
                System.exit(0);
                         }       
                        };
                    } else {
                        System.out.println("// Invalid Input //");
                    }
                } 
            }
            task = new TimerTask() {
                public void run() {
                    System.out.println("\n$ Time out, re-run the code");
                    input.close();
                    System.exit(0);
                }
            };
            input.close();
        }
    }
}