public class Arrays {
    public static void main(String[] args) {
        printaIndiceArray();
        somaValoresArray();
        listaArrays();
        mediaValores();
        multiArray();
    }

public static void printaIndiceArray(){
    String[] pessoas = {"",""};
    pessoas[0] = "pedro";
    System.out.println(pessoas[0]); 
}

public static void somaValoresArray(){
    int[] numeros = {0, 10};
        numeros[0] = 25 + 12;
        System.out.println(numeros[0]);
}

public static void listaArrays() {
        String[] carros = {"Wolksvagem", "Ford", "Fiat"};
        String[] cores = {"Prata", "Azul", "Branco", "Vermelho", "Amarelo"};
        System.out.println("************* Meus Carros ************");
        System.out.println("o carro " + carros[0] + " tem cor " + cores[0]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[1]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[2]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[3]);
        System.out.println("o carro " + carros[0] + " tem cor " + cores[4]);
        for(int i = 0; i < cores.length; i++ ){
            System.out.println("o carro " + carros[1] + " tem cor " + cores[i]);
        }
        for(String cor : cores){
            System.out.println("o carro " + carros[2] + " tem cor " + cor);
        
    }
}

public static void mediaValores() {
        int[] media = {7, 8, 9, 10};
        double resultado = 0;
        for(int i = 0; i < media.length; i ++){
            resultado += media[i];
        }
        System.out.println("** ----- A media é: -----**");
        System.out.println(resultado / 4);
    
}



public static void multiArray() {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][1]);
        //o primeiro array do print seleciona o array da lista de arrays, o segundo array, seleiona o indice do primeiro array selecionado
    
}
}
