import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um numero inteiro positivo: ");
        int numero = scan.nextInt();
        int cont = numero;
        int resultado = 1;
        if (numero != 0 && numero > 0) {
            while (cont >= 1) {
                resultado *= cont;
                cont--;
            }
        }
        System.out.format("Valor Fatorial: %d\n", resultado);
    }
}
