package DiagramaDeClasses.AparelhoTelefonico;

public class sansumg implements aparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Ligando Sansumg");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Sansumg");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz do Sansumg");
    }
    
}