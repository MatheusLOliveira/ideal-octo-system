import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
    }

    private static int[] sortDescendingOrder(int[] numbers) {
        int [] ascendingOrder = new int[numbers.length];
        int lowestNumber = 0;

        for (int number : numbers) {
            int count = 0;
            for (int i : numbers) {
                lowestNumber = number;
                if (lowestNumber < i) {
                    count++;
                }
            }
            ascendingOrder[count] = lowestNumber;
        }
        return ascendingOrder;
    }

    private static int[] sortAscendingOrder(int[] numbers) {
        int [] ascendingOrder = new int[numbers.length];
        int higherNumber = 0;

        for (int number : numbers) {
            int count = 0;
            for (int i : numbers) {
                higherNumber = number;
                if (higherNumber > i) {
                    count++;
                }
            }
            ascendingOrder[count] = higherNumber;
        }
        return ascendingOrder;
    }
}
