# Tipos de Dados em Java.

##### Tipos Primitivos:
   * Inteiros: byte, short, int, long
   * Ponto Flutuante: float, double
   * Booleano: boolean (true/false)
   * Caractere: char
##### Tipos de Referência:
   * String: Sequência de caracteres.
   * Array: Coleção de elementos do mesmo tipo.
   * Classes e Objetos: Instâncias de classes definidas pelo usuário.

##### Literais:
Um literal é uma representação fixa de um valor no código-fonte.

Exemplos:
* int idade = 30; (literal inteiro)
* double salario = 2500.50; (literal de ponto 
* flutuante)
* char letra = 'A'; (literal caractere)
* String nome = "Maria"; (literal string)

##### Constantes:
~~~ Java
final double PI = 3,14;
~~~

##### Tipos Genéricos (a partir do Java 5):
* Permitem a criação de classes, interfaces e métodos que operam com tipos específicos, mas sem especificar esses tipos até a criação da instância.

Exemplo:
~~~ Java
ArrayList<String> listaDeStrings = new ArrayList<String>();
~~~

##### Java é uma linguagem fortemente tipada, o que significa que cada variável deve ser declarada com um tipo específico.  