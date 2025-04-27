package com.example.demo.estudos;

import java.util.Scanner;


@SuppressWarnings("unused")

public class debugJava {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] alunos = {"Camila", "Lucas", "Bruna", "Pietro"};

    double media = calculoMediaDaTurma(alunos, scan);
    System.out.printf("Média da turma %.2f", media);


}
public static int calculoMediaDaTurma(String[] alunos, Scanner scan) {

    int soma = 0;
    for(String aluno:alunos){
        System.out.printf("Soma do aluno %s: ", aluno );
        int nota = scan.nextInt();
        soma += nota;


    }
return soma / alunos.length;

}}