package aula07;

import aula07.contrato.Pilha;
import aula07.impl.ArrayListPilha;
import aula07.impl.LinkedListPilha;

public class Main {

    public static void main(String[] args) {

        Pilha pilhasArray = new ArrayListPilha();

        pilhasArray.push(32);
        pilhasArray.push(49.2);
        pilhasArray.push("Hello");
        pilhasArray.push("Test");
        pilhasArray.push('c');
        pilhasArray.push(false);
        System.out.println(pilhasArray.pop());
        System.out.println(pilhasArray.peek());
        System.out.println(pilhasArray.pop());
        System.out.println(pilhasArray.peek());
        System.out.println(pilhasArray.pop());
        System.out.println(pilhasArray.pop());
        System.out.println(pilhasArray.peek());
        System.out.println();

        Pilha pilhasLinked = new LinkedListPilha();

        pilhasLinked.push(32);
        pilhasLinked.push(49.2);
        pilhasLinked.push("Hello");
        pilhasLinked.push("Test");
        pilhasLinked.push('c');
        pilhasLinked.push(false);
        System.out.println(pilhasLinked.pop());
        System.out.println(pilhasLinked.peek());
        System.out.println(pilhasLinked.pop());
        System.out.println(pilhasLinked.peek());
        System.out.println(pilhasLinked.pop());
        System.out.println(pilhasLinked.pop());
        System.out.println(pilhasLinked.peek());

    }
}
