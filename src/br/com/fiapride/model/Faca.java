package br.com.fiapride.model;

public class Faca {

    // 🔐 Atributos privados (Proteção do Estado)
    private int afiacao0a10;
    private boolean temPonta;

    // Construtor
    public Faca(int nivelInicialAfiacao, boolean possuiPonta) {

        if (nivelInicialAfiacao < 0 || nivelInicialAfiacao > 10) {
            System.out.println("Afiação inválida. Definindo como 0.");
            this.afiacao0a10 = 0;
        } else {
            this.afiacao0a10 = nivelInicialAfiacao;
        }

        this.temPonta = possuiPonta;
    }

    // 🔥 Método 1 - Afiar
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

    // 🔥 Método 2 - Quebrar ponta
    public void quebrarPonta() {

        if (!this.temPonta) {
            System.out.println("Erro: A faca já está sem ponta.");
            return;
        }

        this.temPonta = false;
        System.out.println("A ponta da faca foi quebrada.");
    }

    // 🔍 Método auxiliar para exibir estado
    public void exibirEstado() {
        System.out.println("Afiação: " + this.afiacao0a10 + " | Tem ponta? " + this.temPonta);
    }
}