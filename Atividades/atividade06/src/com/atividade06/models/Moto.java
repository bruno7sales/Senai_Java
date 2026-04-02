package com.atividade06.models;

public class Moto extends Veiculo {
    private boolean temSidecar;

    public Moto(String marca, String modelo, int ano, boolean temSidecar) {
        super(marca, modelo, ano, null);
        this.temSidecar = temSidecar;
    }

    public boolean isTemSidecar() {
        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }
    
}
