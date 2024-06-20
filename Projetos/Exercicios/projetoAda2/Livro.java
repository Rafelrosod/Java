package projetoAda2;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private int numeroPaginas;
    private int estoque;

    public void adicionarEstoque(int quantidade){
        this.estoque += estoque + quantidade;
    }

    public void realizarVenda(){
        if (this.verificarEstoque() == true) {
            this.estoque --;
            System.out.println("Venda realizada com sucesso ");
        }else{
            System.out.println("Estoque indisponivel para realizar venda....");
        }
    };

    public boolean verificarEstoque(){
        if(estoque > 0){
            return true;
        }else{
            return false;
        }
    }

    public void imprimirDados(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de publicação: " + this.anoDePublicacao);
        System.out.println("Número de paginas: " + this.numeroPaginas);
        System.out.println("Estoque: " + this.estoque);
    }

    public Livro(){
    }
    public Livro(String titulo, String autor, int anoDePublicacao, int numeroPaginas, int estoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.numeroPaginas = numeroPaginas;
        this.estoque = estoque;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
