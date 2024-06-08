import java.util.Scanner;

public class pesquisaAundiencia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int canal4 = 0;
            int canal5 = 0;
            int canal7 = 0;
            int canal12 = 0;
            int pessoas = 0;
            while (true) {
                System.out.println("Digite o número do canal (4, 5 ,7 12) ou 0 para sair: ");
                int canal = scanner.nextInt();
                if (canal == 0) {
                    break;
                }
                System.out.println("Qual o número de pessoas que estavam assistindo? ");
                pessoas = scanner.nextInt();
                switch (canal) {
                    case 4:
                        canal4 += pessoas;
                        break;
                    case 5:
                        canal5+= pessoas;
                        break;
                    case 7:
                        canal7 += pessoas;
                        break;
                    case 12:
                        canal12 += pessoas;
                        break;
                    default:
                        System.out.println("Canal inválido. Tente novamente.");
                        break;
                }
            }
            System.out.println("A porcentagem do canal 4* é: " + (canal4 * 100) / pessoas + " % ");
            System.out.println("A porcentagem do canal 5* é: " + (canal5 * 100) / pessoas + " % ");
            System.out.println("A porcentagem do canal 6* é: " + (canal7 * 100) / pessoas + " % ");
            System.out.println("A porcentagem do canal 7* é: " + (canal12 * 100) / pessoas + " % ");
        }

    }
}