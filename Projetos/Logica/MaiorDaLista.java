package Projetos.Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorDaLista {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite os números da lista! Caso deseje retornar, escreva (sair)");
            System.out.println("Qual número deseja adicionar?");
            String adicionar = scanner.nextLine();
            while (!adicionar.equals("sair")) {
                int numero = Integer.parseInt(adicionar);
                numbers.add(numero);
                System.out.println("Qual número deseja adicionar? (Digite 'sair' para finalizar)");
                adicionar = scanner.nextLine();
            }
            int maior = numbers.get(0);
            for (int i = 0; i < numbers.size(); i ++) {
                int atual = numbers.get(i);
                if(atual > maior){
                    maior = atual;
                    System.out.println("Este é o maior número: " + maior);
                }
            }
        }

    }

}
