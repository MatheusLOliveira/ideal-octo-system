package aula07.impl;

import aula07.contrato.Pilha;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedListPilha extends Pilha {

    private LinkedList<Object> pilha;

    public LinkedListPilha() {
        this.pilha = new LinkedList<>();
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

        Object object = this.pilha.get(0);
        this.pilha.remove(0);
        return object;
    }

    @Override
    public Object peek() {
        if (this.pilha.isEmpty()) {
            throw new EmptyStackException();
        }

        return this.pilha.get(0);
    }
}
