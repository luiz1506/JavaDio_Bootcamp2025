package com.example.demo.projetos.experimentos.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 670.00;

        System.out.println("Digite aqui o número da sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número de sua conta: ");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco ! :)" );
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        System.out.println("Digite aqui o valor que deseja sacar: ");
        double valor = scanner.nextDouble();

        if (valor > saldo){
            System.out.println(" SALDO INSUFICIENTE!! ");

        }
        else{
            double novoSaldo = saldo - valor;
            System.out.println("Saldo de R$ " + valor + " retirado com sucesso! ");
            System.out.println("O valor atual em sua conta agora é: " + novoSaldo + " !");
            System.out.println("Obrigado por utilizar de nossos serviços! :)");
        }

        scanner.close();
        


    }
}
