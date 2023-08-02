package Ex0703;

enum State {
    MG(1.0, 0.07),
    SP(2., 0.12),
    RJ(3.0, 0.15);

    final double code;
    final double tax;

    State(double code, double tax) {
        this.code = code;
        this.tax = tax;
    }

    public double getCode() {
        return code;
    }

    public double getTax() {
        return tax;
    }

    public static double getByCode(double code) {
        for (State state : State.values()) {
            if (state.getCode() == code) {
                return state.getTax();
            }
        }
        return -1;
    }
}

public class Ex0703 {

    public static double valorProdutoFinal(double[] input) {
        double produtoTaxado = input[0] * (1 + State.getByCode(input[1]));
        String produtoTaxadoFormatado = String.format("%.4f", produtoTaxado).replace(',','.');

        return Double.parseDouble(produtoTaxadoFormatado);
    }



    public static void main(String[] args) {
        double[] teste =
                {250.10, 1.0};

        System.out.println();
    }
}
