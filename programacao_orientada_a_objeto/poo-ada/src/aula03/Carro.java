package aula03;

public class Carro extends Veiculo{

    private int qtdPorts;
    private String tipoCombustivel;


    public Carro(String placa, String cor, String modelo, int ano, int qtdPorts, String tipoCombustivel) {
        super(placa, cor, modelo, ano);
        this.qtdPorts = qtdPorts;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de portas: " + qtdPorts);
        System.out.println("Tipo de combustível: " + tipoCombustivel);
    }
}
