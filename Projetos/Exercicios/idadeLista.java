import java.util.Scanner;

public class idadeLista {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] pessoas = new int[10];
            System.out.println("Digite a idades de 10 pessoas;");
            for (int i = 0; i < pessoas.length; i++) {
                pessoas[i] = scanner.nextInt();
            }
            faixaEtaria(pessoas);
        }
    }

    public static void faixaEtaria(int pessoas[]) {
        int ate15 = 0;
        int ate16_30 = 0;
        int ate31_45 = 0;
        int ate46_60 = 0;
        int mais60 = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] <= 15) {
                ate15 += 1;
            } else if (pessoas[i] > 16 && pessoas[i] <= 30) {
                ate16_30 += 1;
            } else if (pessoas[i] > 31 && pessoas[i] <= 45) {
                ate31_45 += 1;
            } else if (pessoas[i] > 46 && pessoas[i] <= 60) {
                ate46_60 += 1;
            }else{
                mais60 += 1;
            }
        }
        System.out.println("Tem " + ate15 + " pessoas de até 15 anos. ");
        System.out.println("Tem " + ate16_30 + " pessoas que tem 16 há 30 anos. ");
        System.out.println("Tem " + ate31_45 + " pessoas que tem 31 há 45 anos. ");
        System.out.println("Tem " + ate46_60 + " pessoas que tem 46 há 60 anos. ");
        System.out.println("Tem " + mais60 + " pessoas que tem mais de 60 anos. ");
        percentagem(pessoas,ate15,mais60);
    }
    public static void percentagem(int pessoas[], int ate15, int mais60){
        int percent15 = (ate15 * 100) / pessoas.length;
        int pecent60 = (mais60 * 100) / pessoas.length;
        System.out.println("A porcentagem de pessoas de até 15 anos é: " + percent15 + "%");
        System.out.println("A porcentagem de pessoas de mais de 60 anos é: " + pecent60 + "%");
    }
}