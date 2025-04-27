package com.example.demo.projetos.bankAccount;

import java.util.Locale;
import java.util.Scanner;

public class contaBanco{
    public static void main(String[]args){
        //to-do: conhecer e importar a classe Scanner
        //exibir as mensagens para o usuário
        //obter pela classe Scanner os valores digitado no terminal
        //exibir a mensagem final 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero =scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();

        System.out.println( "Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ 0.00 já está disponível para saque." );
        scanner.close();



    }
}
