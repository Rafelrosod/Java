package Projetos.Logica;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Olá, vamos calcular a tabuada? \n qual número será tabulado?");
        try (Scanner numero = new Scanner(System.in)) {
            int tabulado = numero.nextInt();
            for(int i = 1; i <= 10; i++ ){
                int resultado = tabulado * i;
              System.out.println(tabulado + " x " + i + " = " + resultado);
            }
        }
    }
}
