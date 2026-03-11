package br.com.fiapride.main;

import br.com.fiapride.model.Faca;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("--- Teste da Classe Faca ---");

        Faca faca1 = new Faca(8, true);
        Faca faca2 = new Faca(3, false);

        faca1.exibirEstado();
        faca2.exibirEstado();

        System.out.println("\nTestando métodos:");

        faca1.afiar(2);
        faca2.quebrarPonta();

        faca1.exibirEstado();
        faca2.exibirEstado();

        System.out.println("\n--- Testando proteção do setter ---");

        System.out.println("Tentando definir afiação inválida (50)");

        faca1.setAfiacao0a10(50);

        faca1.exibirEstado();
    }
}