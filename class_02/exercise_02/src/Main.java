import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] promotionalFruits = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        int[] quantityFruits = new int[promotionalFruits.length];

        System.out.println("Digite a quantidade desejada de cada fruta:");
        for (int i = 0; i < promotionalFruits.length; i++) {
            System.out.printf("Quantidade de %s: ", promotionalFruits[i]);
            quantityFruits[i] = sc.nextInt();
        }

        System.out.printf("O valor total da compra é de R$ %.2f", shooping(promotionalFruits, quantityFruits));
    }


    public static double shooping(String[] fruits ,int[] quantityFruits) {
        int promotionalQuantity = 11;
        double promotionalPrice = 1.25;
        double regularPrice = 1.45;

        double shopping = 0;

        for (int quantityFruit : quantityFruits) {
            if (quantityFruit < 0) {
                System.out.println("Valor deve ser positivo");
            } else if (quantityFruit < promotionalQuantity) {
                shopping += regularPrice * quantityFruit;
            } else {
                shopping += promotionalPrice * quantityFruit;
            }
        }
        return shopping;
    }
}