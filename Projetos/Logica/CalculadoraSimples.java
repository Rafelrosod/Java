package Projetos.Logica;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Vamos Calcular: ");
            System.out.println("Qual o primeiro número será Calculado?");
            int primeiro = scanner.nextInt();
            System.out.println("Qual o segundo número será Calculado?");
            int segundo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual Operação será executada: + , - ,* , /  ?");
            String sinal = scanner.nextLine();
            switch (sinal) {
                case "+":
                    int soma = primeiro + segundo;
                    System.out.println(soma);
                    break;
                case "-":
                    int subtracao = primeiro - segundo;
                    System.out.println(subtracao);
                    break;

                case "*":
                    int multiplicacao = primeiro * segundo;
                    System.out.println(multiplicacao);
                    break;
                case "/":
                    int divisao = primeiro / segundo;
                    System.out.println(divisao);
                    break;

                default:
                    break;
            }
        }
    }
}
