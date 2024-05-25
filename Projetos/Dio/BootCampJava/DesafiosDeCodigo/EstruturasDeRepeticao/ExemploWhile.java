package EstruturasDeRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada  = 50;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorAleatorio();
        }
        System.out.println("Mesada " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces ");
    }
    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1,9);
    }
    
}