package projetoAda1;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
    public void calcularImc(){
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("Imc: " + imc);
    }
    public void  fazerAniversario(){
        this.idade ++;
        System.out.println("Feliz aniversario " + this. nome + " você completou "+ this.idade + " !!!");
    }
    public void cumprimentar(String nomeParaCumprimentar){
        System.out.println("Olá " + nomeParaCumprimentar + "! Meu nome é " + this.nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pessoa(){}
    public Pessoa(String nome, int idade, double altura, double peso)  {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
}
