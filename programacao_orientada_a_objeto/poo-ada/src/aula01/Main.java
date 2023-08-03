package aula01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato contato1 = new Contato();
        contato1.setNome("joao");
        contato1.setNumero("123");
        contato1.setDescricao("amigo");

        Contato contato2 = new Contato();
        contato2.setNome("maria");
        contato2.setNumero("456");
        contato2.setDescricao("tia");

        Contato contato3 = new Contato();
        contato3.setNome("ronaldo");
        contato3.setNumero("789");
        contato3.setDescricao("pai");

        Contato contato4 = new Contato();
        contato4.setNome("ugo");
        contato4.setNumero("321");
        contato4.setDescricao("irmao");

        agenda.adicionar(contato1);
        agenda.adicionar(contato2);
        agenda.adicionar(contato3);
        agenda.adicionar(contato4);

        System.out.println("--------------------------------------------");
        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();
        System.out.println("--------------------------------------------");

        System.out.println("--------------------------------------------");
        System.out.println("Buscando ugo");
        Contato ugo = agenda.buscarPorNome("ugo");
        System.out.println("--------------------------------------------");

        System.out.println("--------------------------------------------");
        System.out.println("Detalhar");
        ugo.detalhar();
        System.out.println("--------------------------------------------");

        System.out.println("--------------------------------------------");
        System.out.println("ligar");
        ugo.ligar();
        System.out.println("--------------------------------------------");

        System.out.println("--------------------------------------------");
        System.out.println("Apagando contato (maria)");
        agenda.deletar(contato2);
        System.out.println("--------------------------------------------");

        System.out.println("--------------------------------------------");
        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();
        System.out.println("--------------------------------------------");

    }
}