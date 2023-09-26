package class_04.exercise02;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", 2500.0),
                new Produto("Camisa", 50.0),
                new Produto("Smartphone", 1200.0),
                new Produto("Tênis", 150.0)
        );

        Produto produtoMaisCaro = produtos.stream()
                .max(Comparator.comparingDouble(Produto::getPrice))
                .orElse(null);

        System.out.println(produtoMaisCaro);
    }

}
