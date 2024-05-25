package Projetos.Dio.BootCamp2023.Projetos;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args)  throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
			System.out.println("Digite seu Nome: ");
			String nome = scanner.next();

			System.out.println("Digite seu Numero: ");
			int numero = scanner.nextInt();

			System.out.println("Digite sua Agencia: ");
			String agencia = scanner.next();

			System.out.println("Digite seu Saldo: ");
			double saldo = scanner.nextDouble();
			
			String exibirMensagem = exibirMensagem(nome, numero, agencia,saldo );
			
			System.out.println(exibirMensagem);
		}
    }
    public static String exibirMensagem(String nome, int numero, String agencia, double saldo){
        return " Ola ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(""+numero+"").concat(" e seu saldo ").concat(""+saldo+"").concat(" já está disponível para saque.");
    }

    
    
}