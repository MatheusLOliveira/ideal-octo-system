package class_05.exercise01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 2500.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Teclado", 100.0, 15)
        );

        // Funcionalidade 1
        System.out.println("Produtos com preço acima de R$500,00");
        produtos.stream()
                .filter(produto -> produto.getPreco() > 500)
                .map(Produto::getNome)
                .forEach(System.out::println);
        System.out.println();

        // Funcionalidade 2
        System.out.println("Apenas preços dos produtos");
        produtos.stream()
                .map(Produto::getPreco)
                .forEach(System.out::println);
        System.out.println();

        // Funcionalidade 3
        produtos.stream()
                .min(Comparator.comparing(Produto::getPreco))
                .ifPresent(minProduto -> System.out.println("Produto com o menor preço:\n" + minProduto));
        System.out.println();

        // Funcionalidade 4
        System.out.println("Produtos com quantidade em estoque menor que 10");
        produtos.stream()
                .filter(produto -> produto.getQuantidade() < 10)
                .map(Produto::getNome)
                .forEach(System.out::println);
    }
}
