import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--> Auto Refresh Bitcoin price every second <--\n");
        while(true){
        String api="https://api.binance.com/api/v3/ticker/price?symbol=BTCUSDT";
        URL url = new URI(api).toURL();
        try {
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();
            
            String responseStr = response.toString();
            JSONObject JSONObject=new JSONObject(responseStr);
            String price = JSONObject.getString("price");
            System.out.println(price);
            // String[] price = responseStr.split("");
            // for(int i = 29;i<price.length-2;i++){
            //     System.out.print(price[i]);
            // }
            // System.out.println(" $");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
    }
}
