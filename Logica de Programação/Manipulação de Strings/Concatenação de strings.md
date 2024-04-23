# Strings.

A manipulação de strings é uma tarefa comum e há muitas funções e métodos disponíveis para ajudar a trabalhar com strings. Aqui estão algumas das operações de manipulação de strings mais comuns em Java:

##### Criar Strings:
* Você pode criar strings de várias maneiras, incluindo literais de string, usando o construtor da classe String, ou convertendo outros tipos de dados em strings.
~~~ Java
String str1 = "Hello"; // Literal de string
String str2 = new String("World"); // Usando o construtor da classe String
String str3 = String.valueOf(123); // Convertendo um número inteiro em uma string
~~~
##### Concatenar Strings:
* Você pode concatenar strings usando o operador **+** ou o método **concat()**.
~~~ Java
String str = "Hello" + " " + "World"; // Usando o operador +
String strConcat = str1.concat(str2); // Usando o método concat()
~~~
##### Tamanho da String:
* Você pode obter o tamanho de uma string usando o método **length()**.
~~~ Java
int length = str.length();
~~~
##### Acessar Caracteres:
* Você pode acessar caracteres individuais em uma string usando o método **charAt()**.
~~~ Java
char firstChar = str.charAt(0); // Obtém o primeiro caractere da string
~~~
##### Substrings:
* Você pode obter substrings de uma string usando o método **substring()**.
~~~ Java
public static void main(String[] args){
        String str = "Hello, world!";
        String substring = str.substring(6); // Obtém a substring a partir do índice 6 até o final da string
        System.out.println(substring);
    }  
~~~

##### Busca e Substituição:
* Você pode buscar substrings em uma string usando o método **indexOf()** ou **contains()**, e substituir substrings usando o método **replace()**.
~~~ Java
String str = "Hello, world";
int index = str.indexOf("World"); // Obtém o índice da primeira ocorrência de "World"
boolean contains = str.contains("Hello"); // Verifica se a string contém "Hello"
String replaced = str.replace("world", "Java"); // Substitui todas as ocorrências de "World" por "Java"
~~~

##### Conversão de Maiúsculas/Minúsculas:
* Você pode converter uma string para maiúsculas ou minúsculas usando os métodos toUpperCase() e toLowerCase(), respectivamente.
~~~ Java
String uppercase = str.toUpperCase(); // Converte a string para maiúsculas
String lowercase = str.toLowerCase(); // Converte a string para minúsculas
~~~

_Estas são apenas algumas das operações de manipulação de strings disponíveis em Java. Existem muitos outros métodos na classe String que podem ser úteis para diferentes cenários de programação._