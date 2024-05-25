package DiagramaDeClasses;

import DiagramaDeClasses.AparelhoTelefonico.aparelhoTelefonico;
import DiagramaDeClasses.NavegadorInternet.navegadorNaInternet;
import DiagramaDeClasses.ReprodutorMusical.ReprodutorMusical;

public class interfaceCelular implements aparelhoTelefonico, navegadorNaInternet,ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando Celular");
    }
    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina Web");
    }
    @Override
    public void ligar() {
        System.out.println("Ligando Celular");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo Celular");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Iniciado");
    }
}