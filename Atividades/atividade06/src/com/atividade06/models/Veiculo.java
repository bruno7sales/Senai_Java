package com.atividade06.models;

abstract public class Veiculo {
    // Atributos comuns a todos os veículos
    private String marca;
    private String modelo;
    private int ano;
    private String tipo; // Carro, Moto, Caminhão, Ônibus
    private String placa;
    // Construtor
    public Veiculo(String marca, String modelo, int ano, String placa2) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
