package com.example.demo.projetos.experimentos;
import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int ano = 2025;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = ano - anoNascimento;

        System.out.println("Sua idade é: " + idade);


    scanner.close();
    }

    
}
