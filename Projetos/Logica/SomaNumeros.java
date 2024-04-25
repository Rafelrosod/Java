package Projetos.Logica;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        System.out.println("\n Vamos Somar. \n Digite um numero:");
        try (Scanner scanner = new Scanner(System.in)) {
            int valor1 = scanner.nextInt();
            System.out.println("Digite o segundo numero:");
            try (Scanner scanner1 = new Scanner(System.in)) {
                int valor2 = scanner1.nextInt();
                System.out.println(valor1 + valor2);
            }
        }
    }
}
