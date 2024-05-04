package Projetos.Logica;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Vamos calcular a media! \nDigite o primeiro valor: ");
            String valor = scanner.nextLine();
            System.out.println("Digite o segundo valor: ");
            String valor2 = scanner.nextLine();
            System.out.println("Digite o terceiro valor: ");
            String valor3 = scanner.nextLine();
            int nota1 = Integer.parseInt(valor);
            int nota2 = Integer.parseInt(valor2);
            int nota3 = Integer.parseInt(valor3);
            int media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A media é: " + media);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
