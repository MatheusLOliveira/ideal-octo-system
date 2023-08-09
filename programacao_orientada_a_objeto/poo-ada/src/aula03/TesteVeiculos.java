package aula03;

public class TesteVeiculos {

    public static void main(String[] args) {
        Carro carro1 = new Carro("1234","Vermelho","sedan",2003,4, "Gasolina");
        Moto moto1 = new Moto("1E3D5", "azul", "BMW", 2021, 250);

        System.out.println("------------------------------------");
        carro1.exibirDados();
        System.out.println("------------------------------------");
        moto1.exibirDados();
        System.out.println("------------------------------------");
    }
}
