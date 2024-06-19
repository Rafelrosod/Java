package projetoAda1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa( "pedro", 36, 1.70, 71.00);
        Pessoa pessoa2 = new Pessoa("Maria", 25, 1.65, 60.00);
        System.out.println("********");
        pessoa1.fazerAniversario();
        System.out.println("********");
        pessoa1.calcularImc();
        System.out.println("********");
        pessoa2.cumprimentar("Marcos");
        System.out.println("********");
        pessoa1.cumprimentar(pessoa2.getNome());
    }
}
