import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        matrizPopular();
    }

    public static void printaIndiceArray() {
        String[] pessoas = { "", "" };
        pessoas[0] = "pedro";
        System.out.println(pessoas[0]);
    }

    public static void somaValoresArray() {
        int[] numeros = { 0, 10 };
        numeros[0] = 25 + 12;
        System.out.println(numeros[0]);
    }

    public static void listaArrays() {
        String[] carros = { "Wolksvagem", "Ford", "Fiat" };
        String[] cores = { "Prata", "Azul", "Branco", "Vermelho", "Amarelo" };
        System.out.println("************* Meus Carros ************");
        System.out.println("o carro " + carros[0] + " tem cor " + cores[0]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[1]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[2]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[3]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[4]);
        for (int i = 0; i < cores.length; i++) {
            System.out.println("o carro " + carros[1] + " tem cor " + cores[i]);
        }
        for (String cor : cores) {
            System.out.println("o carro " + carros[2] + " tem cor " + cor);

        }
    }

    public static void mediaValores() {
        int[] media = { 7, 8, 9, 10 };
        double resultado = 0;
        for (int i = 0; i < media.length; i++) {
            resultado += media[i];
        }
        System.out.println("** ----- A media é: -----**");
        System.out.println(resultado / 4);

    }

    public static void multiArray() {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println(myNumbers[1][1]);
        // o primeiro array do print seleciona o array da lista de arrays, o segundo
        // array, seleiona o indice do primeiro array selecionado

    }

    public static void listandoArray() {
        int[] numeros = { 5, 2, 9, 4, 7 };
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            for (int x = i; x < numeros.length; x++) {
                if (numeros[i] > numeros[x]) {
                    aux = numeros[i];
                    numeros[i] = numeros[x];
                    numeros[x] = aux;
                }
            }
        }
        for (int j : numeros) {
            System.out.println(j);
        }
    }
    public static void escolaDeSamba(){
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            int aux;
            System.out.println("Digite as notas das escolas: ");
            for(int i = 0; i < 9; i++){
                System.out.println("Digite a nota: " + i);
                numeros[i] = scanner.nextInt();
            }
            for (int k = 0; k < numeros.length; k++) {
                for(int y = 0; y <numeros.length; y++){
                    if(numeros[k] < numeros[y]){
                        aux = numeros[k];
                        numeros[k] = numeros[y];
                        numeros[y] = aux;
                    }
                }
            }
            System.out.println("___________________Essa são as Notas Impares ______________");
            for(int j : numeros){
                if (j % 2 != 0) {
                    System.out.println(j);
                }
            }
        }
    }
    public static void multiMatriz(){
        int[][] matriz = {{1,0,0},{0,1,0},{0,0,1}};
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
    public static void matrizPopular(){
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] tabela = new int[3][3];
            System.out.println("Preencha a tabela");
            for(int i = 0; i < tabela.length; i++){
                for(int j = 0; j < tabela[i].length; j++){
                    tabela[i][j] = scanner.nextInt();
                }
            }
            for(int i = 0; i < tabela.length; i++){
                for(int j = 0; j < tabela[i].length; j ++){
                    if(tabela[i][j] % 2 != 0){
                        System.out.println(tabela[i][j] + "*");
                    }else{
                        System.out.println(tabela[i][j]);
                    }
                }
            }
        }
    }
}
