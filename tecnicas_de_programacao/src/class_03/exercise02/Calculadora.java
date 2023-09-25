package class_03.exercise02;

import java.util.function.BiFunction;

public class Calculadora {

    public static Integer executar(Integer n1, Integer n2, BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(n1, n2);
    }

}
