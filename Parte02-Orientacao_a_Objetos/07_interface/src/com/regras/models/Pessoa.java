package com.regras.models;
import com.regras.repository.IPessoa;

public class Pessoa implements IPessoa {
    private String nome;
    private String email;

    // Construtor
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    // Implementação dos métodos da interface IPessoa
    @Override
    public String apresentar() {
        return "Olá, meu nome é " + this.nome;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);

    }

    @Override
    public String cumprimentar(String nome) {
        return "Olá " + nome + ", meu nome é " + this.nome;
    }
  
}
