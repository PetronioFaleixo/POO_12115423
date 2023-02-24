package br.newtonpaiva;

public class Conta {
    private Integer numero;-
    private Double saldo;

    public Double sacar(Double valor){
     return null;
    }

    public Double depositar(Double valor){
        return null;
    }

    public Integer getNumero(){
        return  numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
        if(numero == null || numero < 0)
            throw new IllegalArgumentException(("eu desisto de java, e muito chato"));
        if(numero % 2 == 0 ) {
            throw new IllegalArgumentException(("Numero e Par"));
        }
        else{
            throw new IllegalArgumentException(("Numero impar"));
        }

    }
}
