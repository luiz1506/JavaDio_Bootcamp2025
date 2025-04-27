package com.example.demo.projetos.experimentos;
import java.util.Scanner;



public class retangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Por favor digite o valor da base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Por favor, digite o valor do lado do retângulo: ");
        double lado = scanner.nextDouble();

        double area = base * lado;

        System.out.println("O valor da área do retângulo é: " + area + ".");

        scanner.close();
        

    }
        
        

    
    
}
