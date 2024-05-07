package Projetos.Dio.BootCamp2023.DesafiosDeCodigo;

import java.util.Scanner;

public class EquilibrandoSaldos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldoAtual = scanner.nextDouble();
            double valorDeposito = scanner.nextDouble();
            double valorRetirada = scanner.nextDouble();

            double saldoAtualizado = (saldoAtual + valorDeposito) - valorRetirada;
      
            System.out.println("Saldo atualizado na conta: " + saldoAtualizado);
        }
    }
}