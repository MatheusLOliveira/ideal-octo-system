package class_03.exercise02;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = (n1, n2) -> n1+n2;
        BiFunction<Integer, Integer, Integer> subtraction = (n1, n2) -> n1-n2;
        BiFunction<Integer, Integer, Integer> multiplication = (n1, n2) -> n1*n2;
        BiFunction<Integer, Integer, Integer> division = (n1, n2) -> n1/n2;

        Integer n1 = 8;
        Integer n2 = 2;

        System.out.println("Sum: " + Calculator.executar(n1, n2, sum));
        System.out.println("Subtraction: " + Calculator.executar(n1, n2, subtraction));
        System.out.println("Multiplication: " + Calculator.executar(n1, n2, multiplication));
        System.out.println("Division: " + Calculator.executar(n1, n2, division));
    }

}
