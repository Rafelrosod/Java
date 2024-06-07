import java.util.Scanner;

public class mediaFinal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Digite as 3 notas: ");
            int nota1 = scanner.nextInt();
            int nota2 =scanner.nextInt();
            int nota3 =scanner.nextInt();
            double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
            System.out.println(" Sua Media Final é: " + mediaFinal);
        }
    }
}
