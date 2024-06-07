import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Já possui cadastro? \n digite 1 para sim, ou 2 para não: ");
            int valor = scanner.nextInt();
            switch (valor) {
                case 1:
                    login();
                    break;
                case 2 :
                    registrarCadastro();
                    login();
                    break;
                default:
                    System.out.println("Opção invalida!!! ");
                    break;
            }
        }
    }
    public static void login(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Fazer login: digite e-mail e senha: ");
            String email = scanner.next();
            int senha = scanner.nextInt();
            String emailVal = "rafael";
            int senhaVal = 7665;
            if(emailVal.equals(email) && senhaVal == senha){
                System.out.println("Login Realizado com Suscesso. ");
            }else{
                System.out.println("Usuario ou sennha incorretos. ");
            }
        }
    }
    public static void registrarCadastro(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Registrar Cadastro \n digite seu e-mail e senha: ");
                String email = scanner.nextLine();
                int senha = scanner.nextInt();
                System.out.println("Usuário cadastrado com Sucesso! ");
        }
    }
}
