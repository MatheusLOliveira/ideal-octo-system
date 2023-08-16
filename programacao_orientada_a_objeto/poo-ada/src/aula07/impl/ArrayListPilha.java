package aula07.impl;

import aula07.contrato.Pilha;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListPilha  extends Pilha {

    private ArrayList<Object> pilha;

    public ArrayListPilha() {
        this.pilha = new ArrayList<>();
    }

    @Override
    public void push(Object object) {
        this.pilha.add(object);
    }

    @Override
    public Object pop() {
        if (this.pilha.isEmpty()) {
            throw new EmptyStackException();
        }
        Object deleted = this.pilha.get(0);
        this.pilha.remove(0);

        return deleted;
    }

    @Override
    public Object peek() {
        if (this.pilha.isEmpty()) {
            throw new EmptyStackException();
        }

        return this.pilha.get(0);
    }
}
