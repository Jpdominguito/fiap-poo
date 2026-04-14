package br.com.fiapride.main;

import br.com.fiapride.model.Bainha;
import br.com.fiapride.model.FacaCozinha;
import br.com.fiapride.model.FacaEsportiva;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("--- Teste de Herança com Facas ---");

        Bainha bainhaCouro = new Bainha("Couro");
        Bainha bainhaPlastico = new Bainha("Plástico");

        FacaCozinha facaChef = new FacaCozinha(8, true, bainhaCouro, "Aço Inox");
        FacaEsportiva facaCamping = new FacaEsportiva(6, true, bainhaPlastico, true);

        facaChef.exibirEstado();
        facaCamping.exibirEstado();

        System.out.println("\nAtributos exclusivos:");

        System.out.println("Faca de Cozinha - Tipo de lâmina: " + facaChef.getTipoLamina());
        System.out.println("Faca Esportiva - Tem serra? " + facaCamping.isTemSerra());

        System.out.println("\nTestando métodos herdados:");

        facaChef.afiar(2);
        facaCamping.quebrarPonta();

        facaChef.exibirEstado();
        facaCamping.exibirEstado();

        System.out.println("\n--- Testando proteção do setter ---");

        facaChef.setAfiacao0a10(50);

        facaChef.exibirEstado();
    }
}