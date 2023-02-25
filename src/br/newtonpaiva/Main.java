package br.newtonpaiva;
import br.newtonpaiva.Conta;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar(50.0);

        System.out.println(c.getSaldo());
    }
}
