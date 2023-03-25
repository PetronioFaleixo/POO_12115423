package br.newtonpaiva;

import java.util.List;
import java.util.LinkedList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private List<Conta> contas = new LinkedList<>();


    public abstract void validarDocumento();

    public Pessoa(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
