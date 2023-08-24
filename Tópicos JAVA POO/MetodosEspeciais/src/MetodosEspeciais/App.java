package MetodosEspeciais;
public class App {
    public static void main(String[] args) {
        Caneta canetaA = new Caneta("BIC", 0.5f, "Preta");
        Caneta canetaB = new Caneta("NONE", 0.00f, "Azul");

        canetaA.status();

        System.out.println("\n----------------------------------\n");

        canetaB.status();
        canetaB.setModelo("Faber Casttle");
        canetaB.setPonta(0.5f);

        System.out.println("\n----------------------------------\n");

        System.out.println("Modelo da caneta: " + canetaB.getModelo());
        System.out.println("Ponta da caneta: " + canetaB.getPonta());
        
    }
}
