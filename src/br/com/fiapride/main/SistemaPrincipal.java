package br.com.fiapride.main;

// Importamos a classe Faca
import br.com.fiapride.model.Faca;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // INSTANCIAÇÃO
        Faca faca1 = new Faca();
        faca1.afiacao0a10 = 8;
        faca1.temPonta = true;

        Faca faca2 = new Faca();
        faca2.afiacao0a10 = 3;
        faca2.temPonta = false;

        // Exibindo os dados
        System.out.println("--- Sistema Facas ---");
        System.out.println("Faca 1 | Afiação: " + faca1.afiacao0a10 + " | Tem ponta? " + faca1.temPonta);
        System.out.println("Faca 2 | Afiação: " + faca2.afiacao0a10 + " | Tem ponta? " + faca2.temPonta);

     
    }
}