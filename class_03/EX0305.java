package class03;

public class EX0305 {
    public static boolean elementosRepetidos(double[] input) {

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {
                if (input[j] == input[i] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}