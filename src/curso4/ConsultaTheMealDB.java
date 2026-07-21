package curso4;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsultaTheMealDB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome da receita: ");
        String receita = input.nextLine();
        input.close();

        buscarReceita(receita);
    }

    public static void buscarReceita(String receita){
        String API_ADDRESS = "https://www.themealdb.com/api/json/v1/1/search.php?s="
                +URLEncoder.encode(receita,StandardCharsets.UTF_8);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(API_ADDRESS))
                .build();

        HttpResponse<String> response;

        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(response.body());

    }
}
