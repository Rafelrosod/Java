package Sintaxe;

import java.util.Locale;
import java.util.Scanner;

public class dialogo {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu Nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua Altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite sua Formação: ");
            String formacao = scanner.next();

            System.out.println("Me chamo "+ nome + " " + sobrenome + ",tenho " + idade + " anos e " 
            + altura + " de altura, estou cursando "+ formacao + ". " );
        }

        
    }
}