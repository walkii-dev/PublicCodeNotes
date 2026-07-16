package curso6;

public class Main2 {
    public static void main(String[] args) {
        double media = 7.9;

        if (media < 5){
            System.out.println("Reprovado!");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("aprovado!");
        }
    }
}
