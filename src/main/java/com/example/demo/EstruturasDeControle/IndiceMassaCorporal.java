package com.example.demo.EstruturasDeControle;
import java.util.Scanner;

public class IndiceMassaCorporal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso em kilogramas: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String imcFormatado = String.format("%.2f", imc);

        System.out.println("Seu IMC é: " + imcFormatado);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9){
            System.out.println("Peso normal");
        }
        else if (imc >= 25 && imc < 29.9){
            System.out.println("Levemente acima do peso.");
        }
        else if (imc >= 30 && imc < 34.9 ){
            System.out.println("Obesidade Grau I");
        }
        else if (imc >= 35 && imc < 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        }
        else{
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        scanner.close();
    }
}
