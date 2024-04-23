# Loops

**While:**
Executa um bloco de código repetidamente enquanto uma condição especificada for verdadeira.
~~~ Java
int i = 0;
while (i < 5) {
    System.out.println("Número: " + i);
    i++;
}

~~~

**Do-While:**
Similar ao while loop, mas garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja inicialmente falsa.
~~~ Java
int i = 0;
do {
    System.out.println("Número: " + i);
    i++;
} while (i < 5);
~~~

**For Loop**
Executa um bloco de código um número específico de vezes.
~~~ Java
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
~~~

**Enhanced For Loop (Foreach Loop):**
Usado para percorrer elementos em uma coleção (por exemplo, arrays, listas).
~~~ Java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println("Número: " + number);
}
~~~
Aqui, type é o tipo de elemento na coleção, variable é a variável que representa cada elemento, e collection é a coleção pela qual você está iterando.
