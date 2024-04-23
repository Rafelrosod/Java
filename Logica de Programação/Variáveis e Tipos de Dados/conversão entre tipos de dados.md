# Conversão entre tipos de Dados.

**Conversão implícita(Widening Conversion):** 

Isso ocorre quando você está atribuindo um valor de um tipo de dado menor para um tipo de dado maior. Java faz isso automaticamente sem qualquer intervenção do programador. 

Por exemplo:
~~~ Java
int x = 5;
double y = x; 
~~~

**Conversão explícita (casting):** 

Isso ocorre quando você deseja converter um tipo de dado em outro tipo de dado compatível, mas de um tamanho maior ou menor, e precisa especificar a conversão explicitamente. 

Por exemplo:
~~~ Java
double x = 5.5;
int y = (int) x;
~~~

**Métodos de Conversão de Classes Wrapper:**

As classes wrapper em Java (por exemplo, Integer, Double, Float, etc.) fornecem métodos para converter entre tipos de dados primitivos e objetos. 

Por exemplo:
~~~ Java
String numberStr = "123";
int number = Integer.parseInt(numberStr);
~~~

**Métodos valueOf() e toString():**

Muitas classes fornecem métodos valueOf() e toString() para converter entre tipos de dados e strings. 

Por exemplo:
~~~ Java
int num = 123;
String numStr = String.valueOf(num);
~~~

**Conversão de Arrays:**

Você pode converter arrays entre tipos de dados usando iteração manual ou métodos de biblioteca, como Arrays.copyOf(). 

Por exemplo:
~~~ Java
int[] intArray = {1, 2, 3, 4, 5};
double[] doubleArray = new double[intArray.length];
for (int i = 0; i < intArray.length; i++) {
    doubleArray[i] = intArray[i];
}
~~~


