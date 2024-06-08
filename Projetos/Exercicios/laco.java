import java.util.Scanner;

public class laco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escreva valor 1: ");
            int va1 = scanner.nextInt();
            int va2 = 0;
            while (va2 == 0) {
                System.out.println("Escreva valor 2: ");
                 va2 = scanner.nextInt();
            }
            System.out.println("Resultado é: " + va1 * va2 + "!");
        }
    }
}
