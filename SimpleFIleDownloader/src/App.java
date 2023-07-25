import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\n🚀 Simple File Downloader 🚀\n");
        System.out.print("$ Enter Url ~ ");
        String inputurl = input.nextLine();
        if (inputurl.endsWith(".txt")) {
            if (inputurl.startsWith("https://") || inputurl.startsWith("http://") || inputurl.startsWith("Https://")
                    || inputurl.startsWith("Http://")) {
                System.out.println("$ Correct Url");
            } else {
                System.out.println("Incorrect Url");
            }
            try {
                URL url = new URI(inputurl).toURL();
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
                System.out.println(response);
                FileWriter writer = new FileWriter(new File("lib/response.txt"));
                writer.write(response.toString());
                writer.close();
            } catch (Exception e) {

            }
        } else if (inputurl.endsWith(".mp4")) {
            if (inputurl.startsWith("https://") || inputurl.startsWith("http://") || inputurl.startsWith("Https://")
                    || inputurl.startsWith("Http://")) {
                System.out.println("$ Correct Url");
            } else {
                System.out.println("Incorrect Url");
            }
            try {
                URL url = new URI(inputurl).toURL();
                HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                InputStream inputStream = connection.getInputStream();
                    FileOutputStream outputStream = new FileOutputStream("lib/response.mp4"); 
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    
                    inputStream.close();
                    connection.disconnect();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        input.close();
    }
}
