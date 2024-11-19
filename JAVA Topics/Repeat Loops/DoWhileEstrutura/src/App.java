import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int numero;
        String option;
        do {
            System.out.print("Informe um valor: ");
            numero = scan.nextInt();
            soma += numero;
            System.out.print("Continuar? [S / N]: ");
            option = scan.next();
        } while (option.equals("S"));
        System.out.println("Soma dos valores: " + soma);
    }
}
