package curso3.parte3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("A");
        listStrings.add("B");
        listStrings.add("C");
        listStrings.forEach(System.out::println);

        Cachorro doge = new Cachorro();
        Animal animal = (Animal) doge;

        Animal animal2 = new Cachorro();
        Cachorro doge2 = (Cachorro) animal2;

        if (doge instanceof Animal) {
            System.out.println("é animal!");
        }

        List<Produto> productsList = new ArrayList<>();
        productsList.add(new Produto("B",2.0));
        productsList.add(new Produto("D",4.5));
        productsList.add(new Produto("F",6.2));


        double sum = 0;
        for (Produto produto: productsList){
            sum += produto.getPreco();
        }
        sum = sum / productsList.size();

        System.out.println("preço médio dos produtos: "+sum);

        List<Forma> list = new ArrayList<>();
        list.add(new Circulo(2));
        list.add(new Quadrado(4));
        list.add(new Circulo(8));
        list.add(new Quadrado(16));
        list.forEach(forma -> System.out.println("Área : "+forma.calcularArea()));

        List<ContaBancaria> contasList = new ArrayList<>();
        contasList.add(new ContaBancaria(001,100));
        contasList.add(new ContaBancaria(002,200));
        contasList.add(new ContaBancaria(003,150));

        ContaBancaria contaMaiorSaldo = contasList.get(0);
        for (ContaBancaria conta : contasList) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com maior saldo: "+contaMaiorSaldo.toString());






    }
}
