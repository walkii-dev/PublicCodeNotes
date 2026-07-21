package curso4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ImplementandoVeiculo {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Veiculo veiculo = new Veiculo("Fiat","Uno",1997);
        String json = gson.toJson(veiculo);
        System.out.println(json);
    }
}
