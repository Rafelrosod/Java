import java.util.Scanner;

public class macaCompra {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Quantas maçãs serão compradas? ");
            int qtd = scanner.nextInt();
            double maca;
            if (qtd < 12) {
                maca = 1.50;
                System.out.println("Total da compra é: " + maca * qtd);
            }else{
                maca = 1.00;
                System.out.println("Total da compra é: " + maca * qtd);
            }
        }
    }
}
