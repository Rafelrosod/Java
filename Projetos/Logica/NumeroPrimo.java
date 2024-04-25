package Projetos.Logica;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("\n Sera que é primo? \n Digite um numero: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int valor = scanner.nextInt();
            if(primo(valor)){
             System.out.println("O "+ valor + " é Primo. ");
            }else{
                System.out.println("O "+valor+" não é primo");
            }
        }
    }
    public static boolean primo(int valor){
        if(valor <= 1){
            return false;
        }
        if(valor <= 3){
            return true;
        }
        if (valor % 2 == 0 || valor % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= valor; i = i + 6) {
            if (valor % i == 0 || valor % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
