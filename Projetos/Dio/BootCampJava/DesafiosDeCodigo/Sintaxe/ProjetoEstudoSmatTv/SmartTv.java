package Sintaxe.ProjetoEstudoSmatTv;

public class SmartTv {
    boolean ligada = false;
       int volume = 25;
       int canal = 5;

       public void ligar(){
        ligada = true;
       }

       public void desligar(){
        ligada = false;
       }

       public void aumentarVolume(){
        volume++; 
       }
       public void diminuirVolume(){
        volume--;
       }
       public void mudarCanal(){

       }

       public void aumentarCanal(){
        canal++; 
       }

       public void diminuirCanal(){
        canal--;
       }

       public void novoCanal(int novoCanal){
        canal = novoCanal;
       }
}
