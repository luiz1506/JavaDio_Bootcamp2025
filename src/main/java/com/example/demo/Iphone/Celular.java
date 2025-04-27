package com.example.demo.Iphone;


public class Celular implements InnerAparelhoTelefonico, InnerNavegadorInternet, InnerReprodutorMusical {

    public void tocar(){
        System.out.println("Tocando música...");
    }

    public void pausar(){
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecionando a música: " + musica);

    }

    public void ligar(String numero){
        System.out.println("Ligando..." + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(){

        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }
    
}
