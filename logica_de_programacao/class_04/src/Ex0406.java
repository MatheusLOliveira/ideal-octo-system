public class Ex0406 {
    public static void main(String[] args) {
        double[][] entradas = {
                {2.5, 3.2, 4.5, 5, 6},
                {2.5, 2.5, 4.5, 6, 6},
                {1, 2, 4, 5, 6, 7, 7, 8, 8, 2, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 13, 14, 15},
                {1, 2, 3, 4, 9, 10, 11, 21, 20, 1, 31},
                {1},
                {1.55, 1.56, 1.57, 1.58, 1.59, 1.58},
                {1.55, 1.56, 1.57, 1.58, 1.59, 1.589},
                {1.5555, 1.565, 1.57, 1.58, 1.59, 1.5895},
        };

        boolean[] saidas = {
                false,
                true,
                true,
                false,
                true,
                false,
                true,
                false,
                false,
        };

        for (int i = 0; i < entradas.length; i++) {
            boolean resultado = elementosRepetidos(entradas[i]);
            boolean esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static boolean elementosRepetidos(double[] input) {
        // Faça utilizando while
        boolean isEquals = false;
        int num = 0;

        while (num < input.length && !isEquals) {
            int nextNum = num + 1;

            while (nextNum < input.length && !isEquals) {
                if (input[num] == input[nextNum]) {
                    isEquals = true;
                }
                nextNum++;
            }
            num++;
        }
        return isEquals;
    }

}