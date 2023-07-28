import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\u001B[31mLTC balance checker !\u001B[0m");
        Scanner input = new Scanner(System.in);
        try {
            String apiUrl="https://litescribe.io/api/address/balance?address=";
            String address = input.nextLine();
            String GETurl = apiUrl+address;
            URL url = new URI(GETurl).toURL();
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response= new StringBuilder();
            String line;
            while((line=reader.readLine())!=null){
                response.append(line);
            }
            String responseStr = response.toString();
            JSONObject JSONObject = new JSONObject(responseStr);
            int amount = JSONObject.getJSONObject("result").getInt("amount");
            System.out.println("balance :"+amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
