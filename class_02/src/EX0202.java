import java.util.Arrays;

public class EX0202 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);

        System.out.println("Array orginal: " + Arrays.toString(numbers));
        System.out.println("Array ordenado em ordem crescente: " + Arrays.toString(descendingOrder));
        System.out.println("Array ordenado em ordem decrescente: " + Arrays.toString(ascendingOrder));
        System.out.println("Em ordem e apenas pares: " + Arrays.toString(isEven(ascendingOrder)));
        System.out.println("Em ordem e apenas ímpares: " + Arrays.toString(isOdd(ascendingOrder)));
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

    private static int[] isEven(int[] numbers) {
        return sortNumbers(numbers, true);
    }

    private static int[] isOdd(int[] numbers) {
        return sortNumbers(numbers, false);
    }

    private static int[] sortNumbers(int[] numbers, boolean isEven) {
        int idxEven = 0;
        int idxOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                idxEven++;
            } else {
                idxOdd++;
            }
        }

        int [] evenOrder = new int[idxEven];
        int [] oddOrder = new int[idxOdd];
        idxEven = 0;
        idxOdd = 0;

        for (int number : numbers)  {
            if (isEven && number % 2 == 0) {
                evenOrder[idxEven] = number;
                idxEven++;
            } else if (!isEven && number % 2 != 0) {
                oddOrder[idxOdd] = number;
                idxOdd++;
            }
        }

        return isEven ? evenOrder : oddOrder;
    }

}
