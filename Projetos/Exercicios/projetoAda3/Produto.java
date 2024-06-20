package projetoAda3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String dataValidacao;

    public double calcularDesconto(double percentual){
        double desconto = this.preco * percentual;
        return this.preco - desconto;
    }

    public boolean verificaEstoque(int quantidade){
        if (this.quantidadeEstoque >=  quantidade) {
            return true;
        }else{
            return false;
        }
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Estoque: " + this.quantidadeEstoque);
        System.out.println("Data de validade: " + this.dataValidacao);
    }

    public Produto(){}

    public Produto(String nome, double preco, int quantidadeEstoque, String dataValidacao) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.dataValidacao = dataValidacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getDataValidacao() {
        return dataValidacao;
    }
    public void setDataValidacao(String dataValidacao) {
        this.dataValidacao = dataValidacao;
    }
}
