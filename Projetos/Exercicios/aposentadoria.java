import java.util.Scanner;

public class aposentadoria{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Vamos calcular aposentadoria: \n digite o ano de seu nascimento:");
            int anoNasc = scanner.nextInt();
            System.out.println("Digite o ano de ingresso na empresa: ");
            int anoIngre = scanner.nextInt();
            int idade = 2024 - anoNasc;
            int tempoTra = 2024 - anoIngre;
            if(idade <= 65 || tempoTra <= 30 || (idade <= 60 && tempoTra <=25)){
                System.out.println("Requerer aposentadoria. ");
                System.out.println("Idade do funcionario: " + idade);
                System.out.println("Anos trabalhados: " + tempoTra);
            }else{
                System.out.println("Idade do funcionario: " + idade);
                System.out.println("Anos trabalhados: " + tempoTra);
                System.out.println("Não é possivel requerer. ");
            }
        }
    }
}