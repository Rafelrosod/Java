package Projetos.Dio.BootCamp2024.DesafioDeCodigo;

import java.util.Scanner; 

public class VerificarNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido."); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 
        }
         finally {
            scanner.close();
        }
    }
    private static void verificarNumeroConta(String numeroConta) { 
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
        return ;
    }
}
