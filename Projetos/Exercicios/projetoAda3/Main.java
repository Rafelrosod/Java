package projetoAda3;

public class Main {
    public static void main(String[] args) {
        Pao pao = new Pao("Arabe", 20.00, 15, "23/05/2023", "Integral", 0.3, "Arabe");
        pao.imprimirDados();
        double valorFinalPao = pao.calcularPrecoFinal(0.5);
        System.out.println("Valor final do pao: " + valorFinalPao);

        System.out.println("==================");

        Bolo bolo = new Bolo("Bolo de cenoura",50.0, 10,"20/05/2023", "Cenoura", "Médio", "Chocolate");
        bolo.imprimirDados();
        double valorFinalBolo = bolo.calcularPercentual(0.1);
        System.out.println("Valor final Bolo: " + valorFinalBolo);
    }
}
