import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import org.json.JSONObject;

public class s9 {
    public static void main(String[] args) {
        String api_url = "http://worldtimeapi.org/api/timezone/Asia/Kolkata";
        try {
            URL url = new URI(api_url).toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while((line =reader.readLine())!=null){
                response.append(line);
            }
            reader.close();
            connection.disconnect();

            String responseStr = response.toString();
            JSONObject json = new JSONObject(responseStr);
            
            String abbreviation = json.getString("abbreviation");
            String datetime = json.getString("datetime");
            int day_of_week = json.getInt("day_of_week");
            String utc_datetime = json.getString("utc_datetime");
            int day_of_year = json.getInt("datetime");
            String timezone = json.getString("timezone");

            System.out.println("\n-> Abbreviation : "+abbreviation);
            System.out.println("\n-> Date time : "+datetime);
            System.out.println("\n-> UTC Date time : "+utc_datetime);
            System.out.println("\n-> Day of Week : "+day_of_week);
            System.out.println("\n-> Day of Year : "+day_of_year);
            System.out.println("\n-> Time zone : "+timezone);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
