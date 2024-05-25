package EstruturasDeRepeticao;

public class ExemploBreakContinue {
     public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
          if(i == 5){
            continue;
          }else if(i == 7){
            continue;
          }else if (i == 8){
            continue;
          }
          System.out.println(i);
        }
     }
}