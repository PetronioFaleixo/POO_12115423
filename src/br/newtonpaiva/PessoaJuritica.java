package br.newtonpaiva;

public class PessoaJuritica extends Pessoa{
    public String cpf;

    public String getCnpj()
    {
        return cpf;
    }

    public void SetCnpj(String cnpj)
    {
        this.cpf = cnpj;
    }
}



