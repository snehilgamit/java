import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.time.LocalTime;
import java.util.Scanner;
import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWELCOME IN WEATHER CHECKER\n");
        System.out.print("Enter your city name: ");
        String location = input.nextLine();
        input.close();

        try {
            String url = "https://api.tomorrow.io/v4/weather/realtime?location=";
            String api_key = "XpHhMrN4mFCUym35PtLQgKjyICC97dUq";
            String api_url = url + location + "&apikey=" + api_key;
            URL geturl = new URI(api_url).toURL();
            HttpsURLConnection connection = (HttpsURLConnection) geturl.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();

            // Process the JSON response and extract the weather data
            String jsonResponse = response.toString();
            FileWriter write = new FileWriter(new File("src/jsonResponse.json"));
            write.write(jsonResponse);
            System.out.println("Location: " + location);

            JSONObject json = new JSONObject(jsonResponse);
            JSONObject weatherData = json.getJSONObject("data").getJSONObject("values");
            JSONObject locationName = json.getJSONObject("location");

            double temp = weatherData.getDouble("temperature");
            double humidity = weatherData.getDouble("humidity");
            double windSpeed = weatherData.getDouble("windSpeed");
            double windDirection = weatherData.getDouble("windDirection");

            System.out.println("Weather Information for " + locationName.getString("name") + " at " + LocalTime.now().getHour());
            System.out.println("Temperature: " + temp + "°C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Wind Speed: " + windSpeed + " m/s");
            System.out.println("Wind Direction: " + windDirection + "°");

            write.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
