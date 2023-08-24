import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Infome um numero inteiro: ");
        int num = scan.nextInt();
        int cont = 0;
        while (cont < num) {
            cont++;
            if (cont == 5) {
                System.out.println("Comando ignorado.");
                continue; // continuar o looping ignorando os comando seguintes
            }
            if (cont == 10) {
                System.out.println("Laco interrompoido.");
                break; // interrompe o laco
            }
            System.out.format("Cambalhota [%d]\n", cont);
        }
    }
}
