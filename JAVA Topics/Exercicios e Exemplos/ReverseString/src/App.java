
// Exemplo de String Reverse
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o nome: ");
            String text = scan.nextLine();
            char[] reverse = text.toCharArray(); // converte para um array de chars

            for (int i = reverse.length - 1; i >= 0; i--) {
                System.out.print(reverse[i]);
            }
        }
    }
}
