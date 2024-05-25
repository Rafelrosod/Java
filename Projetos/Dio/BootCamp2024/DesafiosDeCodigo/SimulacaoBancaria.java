package Projetos.Dio.BootCamp2024.DesafiosDeCodigo;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            int opcao;
            do {
                opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        double valorDeposito = Double.parseDouble(scanner.nextLine());
                        saldo += valorDeposito;
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 2:
                        double valorSaque = Double.parseDouble(scanner.nextLine());
                        if (valorSaque <= saldo) {
                            saldo -= valorSaque;
                            System.out.println("Saldo atual: " + saldo);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    case 3:
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        break;
                }
            } while (opcao != 0);
        }
    }
}
