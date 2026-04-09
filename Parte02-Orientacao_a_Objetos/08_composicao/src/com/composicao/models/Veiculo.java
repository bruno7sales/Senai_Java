package com.composicao.models;

public class Veiculo {
    // Atributos do veículo
    private String fabricante;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    private String Renavam;
    private Pessoa motorista;

    // Construtor para inicializar os atributos do veículo
    public Veiculo(String fabricante, String modelo, String placa, String ano, String cor, String Renavam, Pessoa motorista) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.Renavam = Renavam;
        this.motorista = motorista;
    }
    // Getters e Setters para acessar e modificar os atributos do veículo
    public String getFabricante() {
        return fabricante;
    }
    public String getModelo() {
        return modelo;
    }   
    public String getAno() {
        return ano;
    }   
    public String getCor() {
        return cor;
    }   
    public String getPlaca() {
        return placa;
    }
    public String getRenavam() {
        return Renavam;
    }
    public Pessoa getMotorista() {
        return motorista;
    }
    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setRenavam(String Renavam) {
        this.Renavam = Renavam;
    }
    // Método para exibir as informações do veículo
    public void exibirInformacoes() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Renavam: " + Renavam);
        if (motorista != null) {
            System.out.println("Motorista: " + motorista.getNome());
        } else {
            System.out.println("Motorista: Não atribuído");
        }
    }

    
}
