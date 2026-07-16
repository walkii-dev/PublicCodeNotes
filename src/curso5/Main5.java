package curso5;

public class Main5 {
    public static void main(String[] args) {
        double preco = 150.00;
        String categoria;

        if (preco >= 50){
            categoria = "Econômico";
        } else if (preco > 50.01 && preco <= 200) {
            categoria = "Intermediário";
        } else if (preco > 200) {
            categoria = "Premium";
            
        }
    }
}
