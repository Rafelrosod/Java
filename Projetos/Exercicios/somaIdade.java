import java.util.Scanner;

public class somaIdade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int hVelho, hNovo,mVelha, mNova;
            System.out.println("Escreva as idades(Atençaõ, não podem ser iguais!!!). ");
            System.out.println("Qual a idade do primeiro Homen? ");
            int idadeH1 = scanner.nextInt();
            System.out.println("Qual a idade do segundo Homen? ");
            int idadeH2 = scanner.nextInt();
            System.out.println("Qual a idade da primeira Mulher ");
            int idadeM1 = scanner.nextInt();
            System.out.println("Qual a idade da segunda Mulher ");
            int idadeM2 = scanner.nextInt();
            if (idadeH1 > idadeH2) {
                hVelho = idadeH1;
                hNovo = idadeH2;
            }else{
                hVelho = idadeH2;
                hNovo = idadeH1;
            }
            if(idadeM1 > idadeM2){
                mVelha = idadeM1;
                mNova = idadeM2;
            }else{
                mVelha = idadeM2;
                mNova = idadeM1;
            }
            int somaHVelho = hVelho + mNova;
            int somaHNovo = hNovo + mVelha;
            System.out.println("Idade do Homem mnais velho com a Mulher mais nova é: " + somaHVelho);
            System.out.println("A idade do Homem novo e a Mulher mais velha é: " + somaHNovo);
        }
    }
}
