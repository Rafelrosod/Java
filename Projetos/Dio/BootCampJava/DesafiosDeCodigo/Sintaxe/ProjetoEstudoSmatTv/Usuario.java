package Sintaxe.ProjetoEstudoSmatTv;

public class Usuario {
    public static void main(String[] args)throws Exception {
        SmartTv smartTv = new SmartTv(); 
        
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.novoCanal(12);
        smartTv.aumentarCanal();

        System.out.println("Ligada: " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("Canal: " + smartTv.canal);

    }
}