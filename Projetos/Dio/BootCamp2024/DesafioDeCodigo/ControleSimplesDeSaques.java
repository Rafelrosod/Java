package Projetos.Dio.BootCamp2024.DesafioDeCodigo;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double limiteDiario = scanner.nextDouble();
            for(int i = 0; i < limiteDiario; i ++){
                double valorSaque = scanner.nextDouble();
                if(valorSaque == 0){
                    System.out.println("Transacoes encerradas.");
                    return;
                }else if(valorSaque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }else{
                    limiteDiario -= valorSaque;
                    System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                }
            }
        } 
        
    }
}
