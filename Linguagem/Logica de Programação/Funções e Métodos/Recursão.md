# Recursão.

A recursão é um conceito em programação em que uma função ou método chama a si mesmo diretamente ou indiretamente. Em Java, você pode usar recursão para resolver problemas de forma elegante e eficiente, especialmente aqueles que podem ser divididos em subproblemas menores do mesmo tipo.

Aqui está um exemplo simples de função recursiva em Java que calcula o fatorial de um número:
~~~ Java
public class Recursao {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
~~~

Neste exemplo, a função fatorial() é recursiva. Ela calcula o fatorial de um número n chamando a si mesma com um argumento menor (n - 1) até que atinja o caso base (quando n é igual a 0 ou 1). Quando isso acontece, a recursão para e os valores de retorno começam a ser calculados, subindo na pilha de chamadas.

É importante ter um caso base em qualquer função recursiva para evitar que a recursão continue indefinidamente. No exemplo acima, o caso base é quando n é 0 ou 1, momento em que a função retorna 1.