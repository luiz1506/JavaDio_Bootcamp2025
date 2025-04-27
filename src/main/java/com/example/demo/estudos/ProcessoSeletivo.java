package com.example.demo.estudos;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        analisarCandidatos();
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (!continuarTentando) {
                System.out.println("Tentativa realizada com sucesso!");
            } else {
                tentativasRealizadas++;
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas.");
        }
    }

    static void imprimirSelecionados(String[] selecionados, int totalSelecionados) {
        System.out.println("\nImprimindo a lista dos candidatos selecionados:");

        for (int i = 0; i < totalSelecionados; i++) {
            System.out.println("O candidato " + selecionados[i] + " está na posição " + (i + 1));
        }

        System.out.println("\nUsando for-each para listar os candidatos selecionados:");
        for (int i = 0; i < totalSelecionados; i++) {
            System.out.println("O candidato selecionado foi " + selecionados[i]);
        }
    }

    static void analisarCandidatos() {
        String[] candidatos = {
            "Camila", "Lucas", "Bruna", "Pietro", "Leonardo",
            "Tâmara", "Joana", "Leanda", "Matheus", "Tôny"
        };

        String[] selecionados = new String[5];
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou o salário de R$ %.2f%n", candidato, salarioPretendido);

            if (salarioPretendido <= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
                entrandoEmContato(candidato);
            }

            candidatoAtual++;
        }

        imprimirSelecionados(selecionados, candidatosSelecionados);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar com contra-proposta!");
        } else {
            System.out.println("AGUARDANDO RESULTADOS!");
        }
    }
}
