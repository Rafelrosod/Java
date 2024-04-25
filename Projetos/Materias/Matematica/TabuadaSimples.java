package Projetos.Materias.Matematica;

import java.util.Scanner;

public class TabuadaSimples {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, vamos Calcular: \n Digite o primeiro numero: ");
        try (Scanner scanner = new Scanner(System.in)) {
            double valor1 = scanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            try (Scanner scanner2 = new Scanner(System.in)) {
                double valor2 = scanner2.nextInt();
                System.out.println("Digite o sinal da operação: ( + , - , * , /) ");
                try (Scanner scannerSinal = new Scanner(System.in)) {
                    String sinal = scannerSinal.nextLine();
                    switch(sinal){
                        case "+":
                         double resultado = valor1 + valor2;
                         System.out.println(resultado);
                        break;
                        case "-":
                         double resultado2 = valor1 - valor2;
                         System.out.println(resultado2);
                        break;
                        case "*":
                         double resultado3 = valor1 * valor2;
                         System.out.println(resultado3);
                        break;
                        case "/":
                         double resultado4 = valor1 / valor2;
                         System.out.println(resultado4);
                        break;
                        default:
                        System.out.println("Sinal errado");
                    }
                }
            }
        }
    }
}
