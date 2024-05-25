package Sintaxe;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if (mediaFinal < 7) {
            System.out.println("Reprovado");
        }else if (mediaFinal == 7) {
            System.out.println("Recuperação");
        }
        if (mediaFinal > 7) {
            System.out.println("Aprovado");
        }
    }
}