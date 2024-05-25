package EstruturasExcepicionais.ExcecoesCustomizadas;

public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("89928542");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep invalido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
