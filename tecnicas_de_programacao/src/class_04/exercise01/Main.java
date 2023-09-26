package class_04.exercise01;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos"),
                new Produto("Camisa", "Vestuário"),
                new Produto("Smartphone", "Eletrônicos"),
                new Produto("Tênis", "Calçados") );

        System.out.println("Choose an category option: ");
        String choice = scanner.nextLine();

        produtos.stream()
                .filter(produto -> produto.getCategoria().equalsIgnoreCase(choice))
                .forEach(produto -> System.out.println(produto));
    }

}
