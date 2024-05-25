package DiagramaDeClasses;

public class emuladorCelular {
    public static void main(String[] args) {
        interfaceCelular ic = new interfaceCelular();
        interfaceCelular aparelhoTelefonico = ic;
        interfaceCelular navegadorNaInternet = ic;
        interfaceCelular reprodutorMusical = ic;

        ic.pausar();

        navegadorNaInternet.adicionarNovaAba();
        aparelhoTelefonico.atender();
        reprodutorMusical.selecionarMusica();
    }
}