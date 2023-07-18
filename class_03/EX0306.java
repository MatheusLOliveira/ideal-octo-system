package class03;

public class EX0306 {

    public static double triangleArea(double a, double b, double c) {
        if (validateTriangle(a, b, c)) {
            double p = (a+b+c)/2;

            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        return 0.0;
    }

    public static boolean validateTriangle(double a, double b, double c) {
        boolean condition1 = a > Math.abs(b - c) && a < (b + c);
        boolean condition2 = b > Math.abs(a - c) && b < (a + c);
        boolean condition3 = c > Math.abs(a - b) && c < (a + b);
        return condition1 && condition2 && condition3;
    }

    public static void main(String[] args) {

        double a = 9;
        double b = 7;
        double c = 14;

        System.out.printf("A área do triângulo de lados %.2f, %.2f e %.2f é de %.2f u.m", a, b, c, triangleArea(a, b, c));
    }

}
