package projetoAda3;

public class Pao extends Produto{
    private String tipoFarinha;
    private double peso;
    private String tipoPao;

    public double calcularPrecoFinal(double percentual){
        double valorComDesconto = super.calcularDesconto(percentual);
        return valorComDesconto + 10.00;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Farinha: " + this.tipoFarinha);
        System.out.println("Peso: " + this.peso);
        System.out.println("Tipo do pao: " + this.tipoPao);
    }

    public Pao(){}

    public Pao(String nome, double preco, int quantidadeEstoque, String dataValidacao, String tipoFarinha, double peso,
            String tipoPao) {
        super(nome, preco, quantidadeEstoque, dataValidacao);
        this.tipoFarinha = tipoFarinha;
        this.peso = peso;
        this.tipoPao = tipoPao;
    }

    public String getTipoFarinha() {
        return tipoFarinha;
    }
    public void setTipoFarinha(String tipoFarinha) {
        this.tipoFarinha = tipoFarinha;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getTipoPao() {
        return tipoPao;
    }
    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }
}
