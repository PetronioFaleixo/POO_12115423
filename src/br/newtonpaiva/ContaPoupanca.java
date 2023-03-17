package br.newtonpaiva;
//herdar de outra classe extends
public class ContaPoupanca extends Conta {
    public void aplicarRendimentos(double percentual)
    {
        Double saldo = getSaldo();
        //o percentual seria não como o poupança seria fixo aqui ele e dinamico.
        setSaldo(((saldo + saldo) * percentual) /100 );

    }
}
