package curso4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoMensagemEmArquivo {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Conteúdo a ser gravado no arquivo.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
