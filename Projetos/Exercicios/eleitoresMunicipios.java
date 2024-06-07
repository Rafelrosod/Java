import java.util.Scanner;

public class eleitoresMunicipios {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o total de eleitores por municípios: ");
            int eleitores = scanner.nextInt();
            System.out.println("Digite a quantidade de votos em branco: ");
            int brancos = scanner.nextInt();
            System.out.println("Digite a quantidade de votos nulos: ");
            int nulos = scanner.nextInt();
            int validos = eleitores - (brancos + nulos) ;
            System.out.println(validos);
            double percenteBr = (brancos * 100) / eleitores;
            double percenteNL = (nulos * 100) / eleitores;
            double percenteVL = (validos * 100) / eleitores;
            System.out.println(" Total de eleitores: " + eleitores);
            System.out.println(" Percentual de votos Nulos: " + percenteNL + "%");
            System.out.println(" Percentual de votos Brancos: " + percenteBr + "%");
            System.out.println(" Percentual de votos válidos: " + percenteVL + "%");
        }
       
    }
}
