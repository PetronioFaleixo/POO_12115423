package br.newtonpaiva;

public class Conta {
    private Integer numero;
    private Double saldo;

    public Double sacar(Double valor){
     return null;
    }

    public Double depositar(Double valor){
        if(valor == null || valor <= 0)
        throw new IllegalArgumentException("Valor menor ou igual a zero");
        saldo += valor;
        return saldo;
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
}
