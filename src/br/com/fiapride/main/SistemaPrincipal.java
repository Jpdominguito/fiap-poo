package br.com.fiapride.main;

import br.com.fiapride.model.Faca;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Faca faca1 = new Faca(8, true);
        Faca faca2 = new Faca(3, false);

        System.out.println("--- Estado Inicial ---");
        faca1.exibirEstado();
        faca2.exibirEstado();

        System.out.println("\n--- Testando valores válidos ---");
        faca1.afiar(2); // deve ir para 10 (obs demorou uns 20 minutos mas por ALGUM CACETE nao pode maisuculo)
        faca1.quebrarPonta();

        System.out.println("\n--- Testando valores inválidos ---");
        faca2.afiar(-3); // inválido
        faca2.quebrarPonta(); // já está sem ponta (TESTE)

        System.out.println("\n--- Estado Final ---");
        faca1.exibirEstado();
        faca2.exibirEstado();
    }
}