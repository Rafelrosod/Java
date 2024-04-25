package Projetos.Logica;

import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        System.out.println("\n Digite um Numero: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
