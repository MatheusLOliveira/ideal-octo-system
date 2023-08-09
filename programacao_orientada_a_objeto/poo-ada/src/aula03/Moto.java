package aula03;

public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String placa, String cor, String modelo, int ano, int cilindrada) {
        super(placa, cor, modelo, ano);
        this.cilindradas = cilindrada;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
