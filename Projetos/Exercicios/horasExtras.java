import java.util.Scanner;

public class horasExtras {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        double salarioTotal;
        System.out.println("Qual o número de horas por mês? ");
        double horaMes = scanner.nextDouble();
        System.out.println("Qual o valor por hora do Funcionario? ");
        double horaFun = scanner.nextDouble();
        if (horaMes > 160) {
            double horasExtras = horaMes - 160;
            double totalExtra = horasExtras * (horaFun * 1.5);
            salarioTotal = (horaFun * 160) + totalExtra;
        }else{
            salarioTotal = horaFun * 160;
        }
        
        System.out.println("Salrio total é : " + salarioTotal);
        }
    }
}
