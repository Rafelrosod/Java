package projetoAda2;

import java.util.ArrayList;

public class Livraria {
    private String nome;
    private String endereco;
    private ArrayList<Livro> catalogo;

    public void imprimirCatalogo(){
        System.out.println(" --- Catalogo de Livros ---");
        for(Livro livro : this.catalogo){
            System.out.println(livro.getTitulo());
        }
    }

    public void adicionarLivro(Livro livro){
        this.catalogo.add(livro);
        System.out.println("Livro adicionado ao catalogo! ");
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    };
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Livraria(){

    }

    public Livraria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.catalogo = new ArrayList<>();
    }
    
}
