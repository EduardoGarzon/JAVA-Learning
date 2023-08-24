import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrdenado {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int[] numeros = new int[5];
            int cont = 0;
            while (cont < 5) {
                System.out.println("Informe um numero: ");
                numeros[cont] = scan.nextInt();
                cont++;
            }
            Arrays.sort(numeros);
            for (int i : numeros) {
                System.out.printf("[%d] ", i);
            }
        }
    }
}
