package com.example.demo.Iphone;

public class Main {

    public static void main(String[] args) {

        Celular meuCelular = new Celular();

        //reprodutor musical
        
        meuCelular.selecionarMusica("Cities in Dust - Siouxie Sioux and the Banshees");
        meuCelular.tocar();
        meuCelular.pausar();

        //Aparelho Telefonico

        meuCelular.ligar("+55 00 90000-0000");
        meuCelular.atender();
        meuCelular.iniciarCorreioVoz();

        //Navegador de Internet

        meuCelular.exibirPagina(" https://www.google.com/");
        meuCelular.adicionarNovaAba();
        meuCelular.atualizarPagina();

        
    }
    
}
