package curso4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EntidadeParaJson {
    public static void main(String[] args) {
        Gson gsonBonito = new GsonBuilder().setPrettyPrinting().create();
        Titulo titulo = new Titulo("Bleach: The Calamity",2026,140);
        String tituloJson = gsonBonito.toJson(titulo);

        System.out.println(tituloJson);

    }
}
