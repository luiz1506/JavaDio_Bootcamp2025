package com.example.demo.projetos.experimentos;
import java.util.Scanner;

public class quadrado {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner (System.in);

        System.out.println("Por favor, digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();

    }
    
}
