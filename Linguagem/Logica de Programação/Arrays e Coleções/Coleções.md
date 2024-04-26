# Coleções

As coleções em Java são estruturas de dados dinâmicas que podem armazenar um número variável de elementos de qualquer tipo. As coleções fornecem métodos úteis para adicionar, remover e acessar elementos de forma eficiente.

Algumas das coleções mais comuns em Java são:

##### ArrayList:
Uma implementação de lista baseada em array redimensionável.

~~~ Java
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
// ...
~~~

##### LinkedList:
Uma implementação de lista duplamente encadeada.
~~~ Java
import java.util.LinkedList;

LinkedList<String> names = new LinkedList<>();
names.add("Alice");
names.add("Bob");
// ...
~~~

##### HashSet:
Uma implementação de conjunto que não permite elementos duplicados.
~~~ Java
import java.util.HashSet;

HashSet<String> uniqueNames = new HashSet<>();
uniqueNames.add("Alice");
uniqueNames.add("Bob");
// ...

~~~

##### HashMap:
Uma implementação de mapa que armazena pares chave-valor.
~~~ Java
import java.util.HashMap;

HashMap<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
scores.put("Bob", 85);
// ...

~~~