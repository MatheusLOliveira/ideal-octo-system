public class Ex0407 {
    public static void main(String[] args) {
        int[][] entradas = {
                {2, 2, 5},
                {3, 3, 5},
                {2, 2, 2},
                {2, 5, 2},
                {2, 4, 3},
                {150, 120, 220},
                {122, 252, 130},
                {152, 200, 351},
                {1232, 2200, 120},
                {1, 2, 1},
                {2, 1, 2}
        };

        String[] saidas = {
                "LadosInvalidosException",
                "true",
                "true",
                "LadosInvalidosException",
                "true",
                "true",
                "LadosInvalidosException",
                "true",
                "LadosInvalidosException",
                "LadosInvalidosException",
                "true"
        };

        for (int i = 0; i < entradas.length; i++) {
            String resultado = "true";

            try {
                eUmTriangulo(entradas[i]);
            } catch (LadosInvalidosException e) {
                resultado = "LadosInvalidosException";
            }
            String esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static void eUmTriangulo(int[] input) throws LadosInvalidosException {
        boolean condition1 = (input[1] + input[2]) > input[0];
        boolean condition2 = (input[0] + input[2]) > input[1];
        boolean condition3 = (input[0] + input[1]) > input[2];

        if (!(condition1 && condition2 && condition3)) {
            throw new LadosInvalidosException("LadosInvalidosException");
        }
    }
}