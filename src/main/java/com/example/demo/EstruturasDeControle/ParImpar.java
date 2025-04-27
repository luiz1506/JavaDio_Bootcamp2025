package com.example.demo.EstruturasDeControle;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor (que seja menor que o segundo): ");
        int numero = scanner.nextInt();

        System.out.println("Entre com um valor (maior que o primeiro): ");
        int numero2 = scanner.nextInt();

        if (numero2 <= numero){
            System.out.println("❌ Erro: o segundo número deve ser maior que o primeiro.");
            scanner.close();
            return;
        }

        System.out.println("Você deseja que seja números pares ou ímpares? (Digite 'par' ou 'impar'): ");
        String escolha = scanner.next().toLowerCase();

        System.out.println("Números " + escolha + " entre " + numero + " e " + numero2 + " (ordem decrescente):");

        for (int i = numero2; i >= numero; i-- ){
            if(escolha.equals("par") && i % 2 == 0){
                System.out.println(i);
            }
            else if (escolha.equals("impar") && i % 2 != 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
