package Projetos.Dio.BootCamp2023.DesafiosDeCodigo;
import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) {

        try (// Entrada de dados
        Scanner scanner = new Scanner(System.in)) {
            int saldoTotal = scanner.nextInt();
            int valorSaque = scanner.nextInt();
   
            if(saldoTotal > valorSaque){
                int saldo = saldoTotal - valorSaque;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            }else{
                System.out.println("Saldo insuficiente. Saque nao realizado!");
            }
        }
        
        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
      }
}
