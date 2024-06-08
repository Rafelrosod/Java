import java.util.Scanner;

public class ladoQuadrados {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o tamanho do quadrado de 1 há 20 ");
            int lado = scanner.nextInt();
            for(int i = 0; i < lado; i++){
                for(int j = 0; j < lado; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
