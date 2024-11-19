import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = scan.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = scan.nextInt();

        double delta = Math.pow(a, 2) - 4 * a * c;
        System.out.println("Valor do Delta: " + delta);
        if (delta < 0) {
            System.out.println("Nao existem Raizes Reais para o Delta.");
        } else {
            System.out.println("Existem Raizes Reais.");
        }

    }
}
