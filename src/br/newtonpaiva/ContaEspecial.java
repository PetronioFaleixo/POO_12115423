package br.newtonpaiva;

public class ContaEspecial extends Conta {
    private  Double limite ;
    public Double getLimite(){
        return  limite;
    }
    public Double Sacar(Double valor){
        if(saldo + limite < valor)
            throw new IllegalStateException("Limite não disponivel");
        saldo -= valor;
        return  saldo;
    }


}
