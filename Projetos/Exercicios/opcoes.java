import java.util.Scanner;

public class opcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0;
        
        while (true) {
            System.out.println(
                    "\n  -----Menu de Opções:----- \n\n 1.Novo salário \n 2.Férias \n 3.Décimo terceiro \n 4.Sair \n\n  Digite a opção desejada:");
            int opcao = scanner.nextInt();
            if (opcao == 4) {
                break;
            }
            
            System.out.println("Digite o salario: ");
            salario = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    salario = novoSalario(salario);
                    System.out.println("Novo salario é: R$: " + salario);
                    break;
                case 2:
                    double ferias = ferias(salario);
                    System.out.println("\n Valor das férias é: R$: " + ferias);
                    break;
                case 3:
                    System.out.println("Digite a quantidade de meses do ano: ");
                    int meses = scanner.nextInt();
                    double decimoTerceiro = decimoTerceiro(salario, meses);
                    System.out.println("\n Valor do decimo terceiro é: R$: " + decimoTerceiro);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        
        scanner.close();
    }

    public static double novoSalario(double salario) {
        System.out.println("\n -----Calcular novo salario----- \n");
        if (salario <= 350.00) {
            salario += (salario * 15) / 100;
        } else if (salario > 350.00 && salario <= 600.00) {
            salario += (salario * 10) / 100;
        } else {
            salario += (salario * 5) / 100;
        }
        return salario;
    }

    public static double ferias(double salario) {
        System.out.println("\n -----Calcular as ferias----- \n");
        return salario + (salario / 3);
    }

    public static double decimoTerceiro(double salario, int meses) {
        System.out.println("\n -----Calcular o decimo terceiro----- \n");
        return (salario / 12) * meses;
    }
}
