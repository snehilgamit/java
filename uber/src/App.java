import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String userName;
        System.out.println("\u001B[34mWelcome in Ubri .\u001B[0m");
        String[] locations = { "Vadodara", "Pune", "Songadh", "Vyara", "Rajkot" };
        String[] cars = { "Volvo", "BMW", "Range Rover", "Lambo" };
        HashMap<String, String> unpass = new HashMap<String, String>();

        unpass.put("a", "a");
        unpass.put("mayank", "sjfbskj");
        unpass.put("snehil", "sjsdskn");
        unpass.put("samri", "sjsdsakdnkn");

        while (true) {
            System.out.print("Enter your Username :");
            userName = input.nextLine();
            System.out.print("Enter your Password :");
            String passWord = input.nextLine();
            if (passWord.equals(unpass.get(userName))) {
                System.out.println("\u001B[34mWelcome to ubri cabs select your rides \u001B[0m" + userName);
                System.out.println();
                break;
            } else {
                System.out.println("\nIncorrect Password or Username, try again.... !\n");
            }
        }
        for (int i = 0; i < locations.length; i++) {
            System.out.println("-> " + locations[i]);
        }
        System.out.print("\n\u001B[33mEnter your pickup loaction :\u001B[0m");
        String puLocation = input.nextLine().trim().toLowerCase();

        System.out.print("\n\u001B[33mEnter your destination loaction :\u001B[0m");
        String dtLocation = input.nextLine().trim().toLowerCase();

        String path = "lib/" + puLocation + "/" + dtLocation + "/main.txt";
        BufferedReader read = new BufferedReader(new FileReader(new File(path)));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = read.readLine()) != null) {
            response.append(line);
        }
        JSONObject JSONObject = new JSONObject(response.toString());
        String distance = JSONObject.getJSONObject("trip").getString("distance");
        int price1 = JSONObject.getJSONObject("options").getJSONObject("volvo").getInt("price");
        int price2 = JSONObject.getJSONObject("options").getJSONObject("BMW").getInt("price");
        int price3 = JSONObject.getJSONObject("options").getJSONObject("Range Rover").getInt("price");
        int price4 = JSONObject.getJSONObject("options").getJSONObject("Lambo").getInt("price");
        System.out.println("Distance :"+distance);
        System.out.println();
        for(int i = 0;i<cars.length;i++){
            int[] temp = {price1,price2,price3,price4};
            System.out.println(temp[i] +"Rs -> "+cars[i]);
        }

        read.close();
        input.close();
    }

}
