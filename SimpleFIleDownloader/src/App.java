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
        int txtnumber=0;
        int mp4number=0;
        while(true){
        System.out.println("\n🚀 Simple File Downloader 🚀\n");
        System.out.print("$ Enter Url ~ ");
        String inputurl = input.nextLine();
        if (inputurl.endsWith(".txt")) {
            if (inputurl.startsWith("https://") || inputurl.startsWith("http://") || inputurl.startsWith("Https://")
                    || inputurl.startsWith("Http://")) {
                System.out.println("\\u001B[36m $ Correct Url \\u001B[0m");
            } else {
                System.out.println("Incorrect Url \\u001B[36m");
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
                String  txtpath = "lib/response("+txtnumber+").txt";
                FileWriter writer = new FileWriter(new File(txtpath));
                writer.write(response.toString());
                writer.close();
                txtnumber++;
            } catch (Exception e) {

            }
        } else if (inputurl.endsWith(".mp4")) {
            if (inputurl.startsWith("https://") || inputurl.startsWith("http://") || inputurl.startsWith("Https://")
                    || inputurl.startsWith("Http://")) {
                System.out.println("$r\u001B[36m Correct Url ");
            } else {
                System.out.println("Incorrect Url");
            }
            try {
                URL url = new URI(inputurl).toURL();
                HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                InputStream inputStream = connection.getInputStream();
                String  mp4path = "lib/response("+mp4number+").mp4";
                    FileOutputStream outputStream = new FileOutputStream(mp4path); 
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    
                    inputStream.close();
                    connection.disconnect();
                    mp4number++;
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
    }
}
