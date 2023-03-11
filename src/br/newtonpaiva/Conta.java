package br.newtonpaiva;

import java.util.Objects;

public class Conta {
    private Integer numero;
    protected Double saldo;

    public Conta(){
        this(null,null);
    }
    public Conta(Integer numero){
        this(numero, 0.0);
        this.numero = numero;
        this.saldo = 0.0;
    }
    public  Conta(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public Double sacar(Double valor){
     return null;
    }
    public Double depositar(Double valor){
        if(valor == null || valor <= 0)
        throw new IllegalArgumentException("Valor menor ou igual a zero");
        saldo += valor;
        return saldo;
    }

    public void transferir(Conta destino, Double valor) {
        if(this.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        if (this.equals(destino)) {
            throw new IllegalArgumentException("Mesmo destino");
        }
        this.sacar(valor);
        destino.depositar(valor);
    }
    public Integer getNumero(){
        return  numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
        if(numero == null || numero < 0)
            throw new IllegalArgumentException(("eu desisto de java, e muito chato"));

    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }
    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
