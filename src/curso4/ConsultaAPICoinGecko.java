package curso4;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsultaAPICoinGecko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe a criptomoeda escolhida:");
        String cripto = input.nextLine();
        input.close();


        verificarCotacao(cripto);
    }

    public static void verificarCotacao(String cripto) {
        String API_ADDRESS = "https://api.coingecko.com/api/v3/simple/price?ids=" +
                URLEncoder.encode(cripto, StandardCharsets.UTF_8) +
                "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(API_ADDRESS))
                .build();

        HttpResponse<String> response;

        try{
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e ){
            throw new RuntimeException(e);
        }

        System.out.println(response.body());

    }
}
