package EstruturasDeRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String evangelhos [] = {"Matheus","Marcos","Lucas","João",};
        /** 
        for(int x = 0; x < evangelhos.length; x++){
          System.out.println("O evangelho " + x + " é " + evangelhos[x]);
        }
        **/
        for(String evangelho : evangelhos){
            System.out.println("O nome do evangelho é: " + evangelho);
        }
    }
}