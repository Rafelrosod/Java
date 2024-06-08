import java.util.Scanner;

public class doador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual seu tipo sanguinio(A, B, AB , O): ?");
            String tipoSangue = scanner.nextLine();
            System.out.println("Positivo [1] ou negativo [2]? ");
            var fator = scanner.nextInt();
            if (fator == 1) {
                var sangue = tipoSangue + "+";
                System.out.println("tipo sanguinio: " + sangue);
                validarSangue(sangue);
            } else if (fator == 2) {
                var sangue = tipoSangue + "-";
                System.out.println("tipo sanguinio: " + sangue);
                validarSangue(sangue);
            } else {
                System.out.println("escolha invalida!!!");
            }
        }
    }

    public static void validarSangue(String sangue) {
        switch (sangue) {
            case "A+":
                System.out.println("Doa para: A+ AB+");
                System.out.println("Recebe de : A+ A- O+ O-");
                break;
            case "A-":
                System.out.println("Doa para: A+ A- AB+ AB-");
                System.out.println("Recebe de : A- O-");
                break;
            case "B+":
                System.out.println("Doa para: B+ AB+");
                System.out.println("Recebe de : B+ B- O+ O-");
                break;
            case "B-":
                System.out.println("Doa para: B+ B- AB+ AB-");
                System.out.println("Recebe de : B- O-");
                break;
            case "AB+":
                System.out.println("Doa para: A+ AB+");
                System.out.println("Recebe de : A+ A-");
                break;
            case "AB-":
                System.out.println("Doa para: AB+");
                System.out.println("Recebe de : Recebe de todos os tipos ");
                break;
            case "O+":
                System.out.println("Doa para: A+ B+ AB+ O+");
                System.out.println("Recebe de : O+ O-");
                break;
            case "O-":
                System.out.println("Doa para: Doa para todos os tipos");
                System.out.println("Recebe de : O-");
                break;
            default:
                break;
        }
    }
}
