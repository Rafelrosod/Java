# Métodos.

* Métodos em Java são blocos de código associados a uma classe específica.
* Eles podem ter acesso a variáveis de instância (membros não estáticos) e métodos de uma classe.
* Os métodos em Java podem ser definidos com vários modificadores de acesso, como **public**, **private**, **protected**, etc., que controlam sua visibilidade e acessibilidade.
* Eles são usados para representar o comportamento e as operações que os objetos da classe podem realizar.

Exemplo de método em Java:
~~~ Java
public class Pessoa {
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}
~~~

##### Parâmetros de Métodos:

* Os parâmetros de método são variáveis ​​declaradas na assinatura do método que recebem valores quando o método é chamado.
* Eles permitem que os métodos aceitem entradas externas para processamento.
* Os parâmetros são especificados entre parênteses após o nome do método na declaração do método.

Exemplo de método com parâmetros em Java:
~~~ Java
public class Calculadora {
    public static int soma(int a, int b) {
        return a + b;
    }
}
~~~

##### Retorno de Métodos:

* O retorno de método é o valor que o método envia de volta ao local onde foi chamado.
* O tipo de retorno do método é especificado na declaração do método, após os parâmetros.
* O valor de retorno é especificado usando a palavra-chave **return** seguida do valor a ser retornado.

Quando você chama um método que retorna um valor, você pode usar esse valor em uma expressão, atribuí-lo a uma variável ou fazer qualquer outra operação desejada com ele.

Exemplo de chamada de método com retorno:
~~~ Java
int resultado = Calculadora.soma(5, 3);
System.out.println("A soma é: " + resultado);
~~~