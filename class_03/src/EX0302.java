public class EX0302 {
    public static double[] custosCarro(double[] input) {

        double percDist = input[1] * 100 / input[0];
        double percImp = input[2] * 100 / input[0];

        return new double[]{Math.round(percDist * 100.00) / 100.00,
                Math.round(percImp * 100.0) / 100.0};
    }
}