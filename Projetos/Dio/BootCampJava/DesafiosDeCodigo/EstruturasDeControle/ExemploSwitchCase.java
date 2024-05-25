package EstruturasDeControle;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        String camisa = "M";
        switch (camisa) {
            case "P":
                System.out.println("Pequena");
                break;
            case "M":
                System.out.println("Media");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                break;
        }
        
    }
}