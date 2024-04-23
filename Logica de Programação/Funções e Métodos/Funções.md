# Funções.

* Em Java, o termo "função" geralmente se refere a um método que não está associado a uma classe específica (método estático).
* Funções em Java são definidas usando o modificador static, o que significa que elas podem ser chamadas sem criar uma instância da classe.
* Funções em Java não têm acesso direto a variáveis de instância (membros não estáticos) de uma classe.
Elas são úteis para agrupar funcionalidades que não dependem do estado de um objeto específico.

Exemplo de função em Java:
~~~ Java
public class Utils {
    public static int soma(int a, int b) {
        return a + b;
    }
}
~~~