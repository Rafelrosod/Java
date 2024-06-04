

import java.util.Scanner;

public class variados {
    public static void main(String[] args) {
    }
    
    public static String retornaNome(){
        String nome = "Seja Bem Vindo";
        return nome;
        
    }
    public static void retornaNomeMaria(){
        String nome = "Maria";
        System.out.println("O nome é: " + nome);
    }
    public static void retornaCalculos(){
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
    public static void retornaBagunca(){
        int a = 5;
        int b = 9;
        int c = b;
        b = a;
        a = c;
        System.out.println("a= "+ a + ",b= " + b );
    }
    public static void retornaDescricaoPessoa(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe seu Nome: ");
            String nome = scanner.next();
            System.out.println("Informe seu Sobrenome: ");
            String sobrenome = scanner.next();
            System.out.println("Informe sua Idade: ");
            int idade = scanner.nextInt();
            System.out.println(nome + " " + sobrenome + " tem " + idade + " anos.");
        }
    }
    public static void retornaNumero(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe um número: ");
            int numero = scanner.nextInt();
            System.out.println(numero - 1);
            System.out.println(numero + 25);
        }
    }
    public static void retornaZeroDivisao(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe um número: ");
            int valor = scanner.nextInt();
            int resultado = valor % 2;
            if (resultado == 0) {
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
        }
    }
    public static void retornaPositivoOuNegativo(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe um número: ");
            int valor = scanner.nextInt();
            if(valor > 0){
                System.out.println("Positivo");
            }else{
                System.out.println("Negativo");
            }
        }
    }
    public static void retornaAreaRetangulo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o Lado 1: ");
            int valor1 = scanner.nextInt();
            System.out.println("Informe o Lado 2: ");
            int valor2 = scanner.nextInt();
            int lado = valor1 * valor2;
            System.out.println("A área do retângulo é: " + lado);
        }
    }
    public static void retornaAprovadoReprocado() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe a primeira nota: ");
            int nota1 = scanner.nextInt();
            System.out.println("Informe a primeira nota2: ");
            int nota2 = scanner.nextInt();
            System.out.println("Informe a primeira nota3: ");
            int nota3 = scanner.nextInt();
            double media  = (nota1 + nota2 + nota3) / 3;
            if(media >= 7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }  
        }
    }
    public static void retornaSomaOuMultiplica() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if(num1 == num2){
                System.out.println(num1 + num2);
            }else{
                System.out.println(num1 * num2);
            }
        }
    }
    public static void retornaMaiorMenor() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe três números: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Informe números Diferentes. ");
            }else if(num1 < num2 && num1 < num3){
                System.out.println("Número "+ num1 + " é o menor");
            }else if(num2 < num1 && num2 < num3){
                System.out.println("Número "+ num2 + " é o menor");
            }else{
                System.out.println("Número "+ num3 + " é o menor");
            }
        }
    }
    public static void retornaListaMaiorMenor() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe três números: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Informe números Diferentes. ");
            }else if(num1 < num2 && num1 < num3){
                if (num2 < num3) {
                    System.out.println(num1 + "," + num2 + "," + num3);
                }else{
                    System.out.println(num1 + "," + num3 + "," + num2);
                }
            }else if(num2 < num1 && num2 < num3){
                if(num1 < num3){
                    System.out.println(num2 + "," + num1 + "," + num3);
                }else{
                    System.out.println(num2 + "," + num3 + "," + num1);
                }
            }else{
               if(num1 < num2){
                System.out.println(num3 + "," + num1 + "," + num2);
               }else{
                System.out.println(num3 + "," + num2 + "," + num1 );
               }
            }
        }
    }
}
// Scanner scanner = new Scanner(System.in);
// System.out.println();