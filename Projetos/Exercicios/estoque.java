import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual a quantidade atual do estoque? ");
            int qtdAtual = scanner.nextInt();
            System.out.println("Qual a quantidade Max?");
            int qtdMax = scanner.nextInt();
            System.out.println("Qual a quantidade Min?");
            int qtdMin = scanner.nextInt();
            double qtdMedia = ((qtdMax + qtdMin) / 2);
            if(qtdAtual >= qtdMedia){
                System.out.println("Não efetuar compra!!!");
            }else{
                System.out.println("Efetuar compra!!!");
            }
        }
    }
}
