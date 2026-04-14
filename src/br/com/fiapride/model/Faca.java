package br.com.fiapride.model;

public class Faca {

    // Atributos (Proteção do Estado)
    private int afiacao0a10;
    private boolean temPonta;
    private Bainha bainha;

    // Construtor
    public Faca(int nivelInicialAfiacao, boolean possuiPonta, Bainha bainha) {

        if (nivelInicialAfiacao < 0 || nivelInicialAfiacao > 10) {
            System.out.println("Afiação inválida. Definindo como 0.");
            this.afiacao0a10 = 0;
        } else {
            this.afiacao0a10 = nivelInicialAfiacao;
        }

        this.temPonta = possuiPonta;
        this.bainha = bainha;
    }

    // Método para afiar
    public void afiar(int nivelAdicionado) {

        if (nivelAdicionado <= 0) {
            System.out.println("Erro: O nível de afiação deve ser positivo.");
            return;
        }

        this.afiacao0a10 += nivelAdicionado;

        if (this.afiacao0a10 > 10) {
            this.afiacao0a10 = 10;
        }

        System.out.println("Faca afiada. Nível atual: " + this.afiacao0a10);
    }

    // Método para quebrar ponta
    public void quebrarPonta() {

        if (!this.temPonta) {
            System.out.println("Erro: A faca já está sem ponta.");
            return;
        }

        this.temPonta = false;
        System.out.println("A ponta da faca foi quebrada.");
    }

    // Método para exibir estado
    public void exibirEstado() {
        System.out.println(
            "Afiação: " + this.afiacao0a10 +
            " | Tem ponta? " + this.temPonta +
            " | Material da bainha: " + this.bainha.getMaterial()
        );
    }

    // Getter e Setter da afiação
    public int getAfiacao0a10() {
        return afiacao0a10;
    }

    public void setAfiacao0a10(int afiacao0a10) {

        if (afiacao0a10 < 0 || afiacao0a10 > 10) {
            System.out.println("Valor inválido para afiação.");
            return;
        }

        this.afiacao0a10 = afiacao0a10;
    }

    // Getter e Setter da ponta
    public boolean isTemPonta() {
        return temPonta;
    }

    public void setTemPonta(boolean temPonta) {
        this.temPonta = temPonta;
    }

    // Getter e Setter da bainha
    public Bainha getBainha() {
        return bainha;
    }

    public void setBainha(Bainha bainha) {
        this.bainha = bainha;
    }
}