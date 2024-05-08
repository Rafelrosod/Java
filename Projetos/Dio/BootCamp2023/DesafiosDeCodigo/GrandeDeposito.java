package Projetos.Dio.BootCamp2023.DesafiosDeCodigo;

import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do depósito:");
            double valor = scanner.nextDouble();

            if (valor > 0) {
                
                System.out.println("Depósito realizado com sucesso!\nSaldo atual: R$ " + valor);
            } else if (valor < 0) {
                System.out.println("Valor inválido! Digite um valor maior que zero.");
            } else if(valor == 0) {
                System.out.println("Encerrando o programa...");
            }
        }
    }
}
