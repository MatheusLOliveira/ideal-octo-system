package aula06;

import aula06.contrato.Lista;
import aula06.impl.ArrayLista;
import aula06.impl.ListaLigada;

public class Main {

    public static void main(String[] args) {
        Lista lista = new ArrayLista();

        lista.add("primeiro elemento");
        lista.add("segundo elemento");
        lista.add(7);
        lista.add(28);
        imprimirLista(lista);
        lista.remove(0);
        System.out.println();
        imprimirLista(lista);

        System.out.println();

        Lista lista2 = new ListaLigada();
        lista2.add("primeiro elemento");
        lista2.add("segundo elemento");
        lista2.add(7);
        lista2.add(28);
        imprimirLista(lista2);
        lista2.remove(3);
        System.out.println();
        imprimirLista(lista2);
        System.out.println();
    }

    public static void imprimirLista(Lista lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
