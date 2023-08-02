public class EX0301 {
    public static double custoCompra(double input) {

        if (input < 0) {
            return 0.0;
        } else if (input > 10) {
            return input * 1.25;
        } else {
            return input * 1.45;
        }

    }
}