package com.example.demo.projetos.experimentos;
import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano = 2080;

        System.out.println("Digite aqui a data de nascimento do primeiro indivíduo: ");
        int dataDeNascimento1 = scanner.nextInt();

        System.out.println("Digite aqui a data de nascimento do segundo indivíduo: ");
        int dataDeNascimento2 = scanner.nextInt();

        int idade1 = ano - dataDeNascimento1;
        int idade2 = ano - dataDeNascimento2;

        System.out.println("A idade do primeiro indivíduo é: " + idade1 + " anos.");
        System.out.println("A idade do segundo indivíduo é: " + idade2 + " anos.");

        int diferenca = Math.abs(idade1 - idade2); // pega a diferença sem precisar de if

        System.out.println("A diferença de idade entre ambos é de: " + diferenca + " anos.");

        scanner.close();
    }
}

