import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);

        System.out.println("Array orginal: " + Arrays.toString(numbers));
        System.out.println("Array ordenado em ordem crescente: " + Arrays.toString(descendingOrder));
        System.out.println("Array ordenado em ordem decrescente: " + Arrays.toString(ascendingOrder));
    }


    public static void swap(int[] numbers, int i, int j) {
        int aux = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = aux;
    }


    private static int[] sortAscendingOrder(int[] numbers) {
        int [] ascendingOrder = numbers.clone();

        for (int i = 0; i < ascendingOrder.length; i++) {
            for (int j = 0; j < ascendingOrder.length - 1 - i; j++) {
                if (ascendingOrder[j] > ascendingOrder[j + 1]) {
                    swap(ascendingOrder, j, j+1);
                }
            }
        }
        return ascendingOrder;
    }

    private static int[] sortDescendingOrder(int[] numbers) {
        int [] ascendingOrder = numbers.clone();

        for (int i = 0; i < ascendingOrder.length; i++) {
            for (int j = 0; j < ascendingOrder.length - 1 - i; j++) {
                if (ascendingOrder[j] < ascendingOrder[j + 1]) {
                    swap(ascendingOrder, j, j+1);
                }
            }
        }
        return ascendingOrder;
    }
}
