# Formatação de strings.

você pode formatar strings de várias maneiras para exibir informações de maneira mais legível ou formatada. Existem várias abordagens para formatação de strings em Java, incluindo formatação de strings simples, formatação de strings com padrões específicos e formatação de strings usando a classe String.format(). Vou cobrir cada uma delas:

##### String.format():
* A classe String.format() permite criar uma string formatada usando padrões especificados.
~~~Java
String nome = "Bob";
int idade = 25;
String mensagem = String.format("Bem-vindo, %s! Você tem %d anos.", nome, idade);
~~~
##### StringBuilder:
* O StringBuilder pode ser usado para construir strings de forma eficiente, especialmente quando você precisa concatenar muitas strings.
~~~Java
StringBuilder builder = new StringBuilder();
builder.append("Olá,");
builder.append(" mundo!");
String resultado = builder.toString();
~~~
##### Formatter:
* A classe Formatter permite formatar strings de acordo com regras específicas definidas pelo usuário.
~~~Java
Formatter formatter = new Formatter();
formatter.format("O valor de pi é: %.2f", Math.PI);
String resultado = formatter.toString();
formatter.close();
~~~
##### DecimalFormat:
* A classe DecimalFormat permite formatar números decimais com precisão e controlar a formatação de casas decimais, separadores de milhares, símbolos de moeda, etc.
~~~Java
import java.text.DecimalFormat;

double valor = 12345.6789;
DecimalFormat df = new DecimalFormat("#,##0.00");
String resultado = df.format(valor); // resultado será "12,345.68"
~~~
##### SimpleDateFormat:
* A classe SimpleDateFormat é usada para formatar e analisar datas em diferentes formatos.
~~~Java
import java.text.SimpleDateFormat;
import java.util.Date;

public class  DesafioBootcamp {
    public static void main(String[] args){
        Date data = new Date(30122000);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(data); // dataFormatada será uma string representando a data no formato "dd/MM/yyyy"
        System.out.println(dataFormatada);
    } 
}
~~~
##### MessageFormat:
* A classe MessageFormat permite criar padrões de mensagem com espaços reservados que podem ser preenchidos com valores fornecidos.
~~~Java
String pattern = "O {0} está com {1} anos de idade.";
String mensagem = MessageFormat.format(pattern, "Bob", 25); // mensagem será "O Bob está 25 anos de idade."
~~~
##### StringJoiner:
* A classe StringJoiner facilita a concatenação de strings com um delimitador específico.
~~~Java
StringJoiner sj = new StringJoiner(", ", "[", "]");
sj.add("Maçã");
sj.add("Banana");
sj.add("Laranja");
String resultado = sj.toString(); // resultado será "[Maçã, Banana, Laranja]"
~~~