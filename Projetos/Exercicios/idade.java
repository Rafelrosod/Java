import java.util.Scanner;

public class idade {
    int ano,meses,dias,totalDias;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite sua idade em anos: ");
            int anos = scanner.nextInt();
            System.out.println("Digite sua idade em meses: ");
            int meses = scanner.nextInt();
            System.out.println("Digite sua idade em dias: ");
            int dias = scanner.nextInt();
            int totalDias = (365 * anos) + (30 * meses) + dias;
            System.err.println("Sua idade total em dias tem " + totalDias + " dias.");
        }
    }
}
