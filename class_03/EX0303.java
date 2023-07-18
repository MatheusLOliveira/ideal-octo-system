package class03;

public class EX0303 {
    public static double calculoSalario( double[] input) {
        double tempoServico = input[0];
        double inflacao = input[1];
        double salario = input[2];
        double reajuste = 0;

        if (1 <= tempoServico && tempoServico < 5) {
            reajuste = 1;
        } else if (5 <= tempoServico && tempoServico < 10) {
            reajuste = 1.5;
        } else if (tempoServico >= 10) {
            reajuste = 2;
        } else {
            reajuste = 0; // Necessita de tratamento
        }

        double novoSalario = salario + (salario * ((reajuste + inflacao) / 100));
        return Math.round(novoSalario * 100.0) / 100.0;
    }
}