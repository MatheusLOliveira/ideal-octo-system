public class Ex0403 {
    public static void main(String[] args) {
        double[][] entradas = {
                {8.0, 7.0, 8.0, 8.0},
                {5.0, 4.3, 8.0, 7.0},
                {2.0, 5.0, 8.0, 6.0},
                {4.0, 1.0, 9.0, 7.0},
                {2.0, 2.0, 10.0, 1.0},
                {2.9, 2.5, 10.0, 7.1},
                {4.4, 4.1, 8.5, 9.5},
                {5.0, 7.0, 9.0, 8.0},
                {8.0, 7.0, 8.0, 9.0},
                {8.0, 8.0, 10.0, 9.0},
                {2.0, 2.0, 5.0, 1.0}
        };

        String[] saidas = {
                "B",
                "C",
                "C",
                "D",
                "D",
                "C",
                "C",
                "B",
                "B",
                "A",
                "D"
        };

        for (int i = 0; i < entradas.length; i++) {
            String resultado = mediaAproveitamento(entradas[i]);
            String esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado.equals(esperado));
            System.out.println();
        }
    }

    public static String mediaAproveitamento(double[] input) {
        double nota1 = input[0];
        double nota2 = input[1];
        double nota3 = input[2];
        double mediaExercicios = input[3];

        double media_aproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        return conceito(media_aproveitamento);
    }

    public static String conceito(double mediaAproveitamento) {
        if (mediaAproveitamento >= 9.0) {
            return "A";
        } else if (9.0 > mediaAproveitamento && mediaAproveitamento >= 7.5) {
            return "B";
        } else if (7.5 > mediaAproveitamento && mediaAproveitamento >= 6.0) {
            return "C";
        } else if (6.0 > mediaAproveitamento && mediaAproveitamento >= 0) {
            return "D";
        }

        return "Media de Aproveitamento fora do escopo de 0 a 10";
    }
}