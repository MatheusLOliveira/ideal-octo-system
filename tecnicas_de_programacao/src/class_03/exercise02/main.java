package class_03.exercise02;

import java.util.function.BiFunction;

public class main {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = (n1, n2) -> n1+n2;
        BiFunction<Integer, Integer, Integer> subtraction = (n1, n2) -> n1-n2;
        BiFunction<Integer, Integer, Integer> multiplication = (n1, n2) -> n1*n2;
        BiFunction<Integer, Integer, Integer> division = (n1, n2) -> n1/n2;

        Integer n1 = 8;
        Integer n2 = 2;

        System.out.println("Sum: " + Calculadora.executar(n1, n2, sum));
        System.out.println("Subtraction: " + Calculadora.executar(n1, n2, subtraction));
        System.out.println("Multiplication: " + Calculadora.executar(n1, n2, multiplication));
        System.out.println("Division: " + Calculadora.executar(n1, n2, division));
    }

}
