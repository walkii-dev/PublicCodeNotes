package curso4;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsultaApiGitHubCompleta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o usuario que deseja buscar:");
        String usuario = input.nextLine();
        input.close();

        buscaUsuarioGithub(usuario);
    }

    public static void buscaUsuarioGithub(String usuario) {
        String URL = "https://api.github.com/users/";
        URL += URLEncoder.encode(usuario, StandardCharsets.UTF_8);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();

        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(response.body());
            if (response.body().contains("404")) {
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }
        } catch (ErroConsultaGitHubException e) {
            System.out.println("O nome do usuário pesquisado está incorreto.");
        }


    }
}
