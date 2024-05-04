package Projetos.Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorDaLista {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Adicionar: Sim ou não?");
            String adicionar = scanner.nextLine();
            while (adicionar != "não") {
                    System.out.println("Qual número será Adicionado?");
                    int numero = scanner.nextInt();
                    numbers.add(numero);
                    System.out.println(numbers);
                    //carece de corrigir o cod.
                    //necessãrio printar toda a lista
            }
        }
    }
}
