package com.encapsulamentos.models;

public class PessoaJuridica extends Pessoa {
    // Atributos
    private String nomeFantasia;
    private String cnpj;

    // Construtor
    public PessoaJuridica(String email, String telefone, String nomeFantasia, String cnpj) {
        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    // Getters e Setters
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
