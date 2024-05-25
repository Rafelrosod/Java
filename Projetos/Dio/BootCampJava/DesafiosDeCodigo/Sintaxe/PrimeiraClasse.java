package Sintaxe;

public class PrimeiraClasse {
    public static void main(String[] args) throws Exception {

        String nome = "Rafael";
        String sobrenome = "Souza";
        
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto(String nome, String sobrenome){
       return nome.concat(" ").concat( sobrenome);
    }
   
}

