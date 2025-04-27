package com.example.demo.projetos.petShop;

import java.util.Scanner;

public class Menu {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("\n=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet.");
            System.out.println("2 - Abastecer a máquina com água.");
            System.out.println("3 - Abastecer a máquina com shampoo.");
            System.out.println("4 - Verificar a água da máquina.");
            System.out.println("5 - Verificar o shampoo da máquina.");
            System.out.println("6 - Verificar se há pet na máquina.");
            System.out.println("7 - Colocar o pet na máquina.");
            System.out.println("8 - Retirar o pet da máquina.");
            System.out.println("9 - Limpar a máquina.");
            System.out.println("0 - Sair.");
            System.out.print("Opção: ");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeShowerInPet();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> {
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida!");
            }

        } while (true);
    }

    private static void setWater() {
        petMachine.addWater();
        System.out.println("Tentando abastecer a máquina com água.");
    }

    private static void setShampoo() {
        petMachine.addShampoo();
        System.out.println("Tentando abastecer a máquina com shampoo.");
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina possui " + amount + " de água.");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina possui " + amount + " de shampoo.");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "O pet está na máquina!" : "O pet não está na máquina.");
    }

    private static void setPetInMachine() {
        String name = "";

        while (name == null || name.isEmpty()) {
            System.out.print("Informe o nome do pet: ");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }
}


