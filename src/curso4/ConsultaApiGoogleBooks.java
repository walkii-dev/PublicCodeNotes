package curso4;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ConsultaApiGoogleBooks {
    public static void main(String[] args) {

        System.out.println(getApiResponse("Bleach"));

    }



    public static String getApiResponse(String search) {
        Properties properties = new Properties();

        try(FileInputStream file = new FileInputStream("config.properties")){
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Arquivo não encontrado.",e);
        }
        final String API_ADDRESS = "https://www.googleapis.com/books/v1/volumes?q=";

        String apiKey = properties.getProperty("google.books.api.key");

        String encodedSearch = URLEncoder.encode(search, StandardCharsets.UTF_8);
        encodedSearch = API_ADDRESS + encodedSearch;
        String myApiKey = "&key=" + apiKey;

        encodedSearch = encodedSearch + myApiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(encodedSearch))
                .build();

        HttpResponse<String> response;

        try{
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return response.body();
    }
}
