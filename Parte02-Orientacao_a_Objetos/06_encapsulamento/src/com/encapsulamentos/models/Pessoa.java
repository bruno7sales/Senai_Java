package com.encapsulamentos.models;

abstract public class Pessoa {
    // Atributos
    private String email;
    private String telefone;

    //Construtor
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
