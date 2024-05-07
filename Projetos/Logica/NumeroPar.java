package Projetos.Logica;
import java.util.Scanner;;

public class NumeroPar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Par ou Impar?");
            System.out.println("Digite o número a ser verificado: ");
            int dividi = 2;
            int valor = scanner.nextInt();
            int resto = valor % dividi;
            if (resto == 0) {
                System.out.println("O número " + valor + " é " + " Par ");
            }else if(resto != 0){
                System.out.println("O número " + valor + " é " + "Impar");
            }
        }

    }
}
