package Projetos.Dio.BootCamp2023.DesafiosDeCodigo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial * Math.pow((1 + (taxaJuros / 100)), periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();

    }

}
