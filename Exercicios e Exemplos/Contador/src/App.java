import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Infomre o inicio: ");
        int inicio = scan.nextInt();
        System.out.println("Informe o fim: ");
        int fim = scan.nextInt();
        System.out.println("Informe o passo: ");
        int passo = scan.nextInt();
        for (int i = inicio; i <= fim; i += passo) {
            System.out.println("Contagem: " + i);
        }
    }
}
