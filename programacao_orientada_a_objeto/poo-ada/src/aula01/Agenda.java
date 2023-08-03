package aula01;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = new ArrayList<>(contatos);
    }

    public void adicionar(Contato contato) {
        this.contatos.add(contato);
    }

    public void deletar(Contato contato) {
        contatos.remove(contato);
    }

    public Contato buscarPorNome(String nome) {
        for (Contato contatoBuscado : contatos) {
            if (contatoBuscado.getNome().equals(nome)) {
                return contatoBuscado;
            }
        }
        return null;
    }

    public void imprimirAgenda() {
        for (Contato conts : contatos) {
            System.out.println("Contato: " + conts.getNome());
        }
        System.out.println();
    }
}
