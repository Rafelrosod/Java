package projetoAda3;

public class Bolo extends Produto {
    private String sabor;
    private String tamanho;
    private String tipoCobertura;

    public double calcularPercentual(double percentual){
        double valorComDesconto = super.calcularDesconto(percentual);
        return valorComDesconto + 120.0;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cobertura: " + this.tipoCobertura);
    }

    public Bolo(){}
    
    public Bolo(String nome, double preco, int quantidadeEstoque, String dataValidacao, String sabor, String tamanho,
            String tipoCobertura) {
        super(nome, preco, quantidadeEstoque, dataValidacao);
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.tipoCobertura = tipoCobertura;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    
}
