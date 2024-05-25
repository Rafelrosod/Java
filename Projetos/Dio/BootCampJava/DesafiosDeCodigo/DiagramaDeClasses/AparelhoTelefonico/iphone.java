package DiagramaDeClasses.AparelhoTelefonico;

public class iphone implements aparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Inciando Correio de Voz no iphone");
    }
     
}