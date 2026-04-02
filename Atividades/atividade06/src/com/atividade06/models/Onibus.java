package com.atividade06.models;

public class Onibus extends Veiculo {
    private int capacidadePassageiros;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros) {
        super(marca, modelo, ano, null);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
