package br.com.fiapride.model;

public class FacaCozinha extends Faca {

    private String tipoLamina;

    public FacaCozinha(int nivelInicialAfiacao, boolean possuiPonta, Bainha bainha, String tipoLamina) {
        super(nivelInicialAfiacao, possuiPonta, bainha);
        this.tipoLamina = tipoLamina;
    }

    public String getTipoLamina() {
        return tipoLamina;
    }

    public void setTipoLamina(String tipoLamina) {
        this.tipoLamina = tipoLamina;
    }
}