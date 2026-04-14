package br.com.fiapride.model;

public class FacaEsportiva extends Faca {

    private boolean temSerra;

    public FacaEsportiva(int nivelInicialAfiacao, boolean possuiPonta, Bainha bainha, boolean temSerra) {
        super(nivelInicialAfiacao, possuiPonta, bainha);
        this.temSerra = temSerra;
    }

    public boolean isTemSerra() {
        return temSerra;
    }

    public void setTemSerra(boolean temSerra) {
        this.temSerra = temSerra;
    }
}