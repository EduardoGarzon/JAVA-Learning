import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Informe um valor inteiro positivo: ");
            int valor = scan.nextInt();

            double result = 0;

            result = valor % 2;
            System.out.println("Resto da Divisao por 2: " + result);
            result = Math.pow(valor, 3);
            System.out.println("Elevado ao Cubo: " + result);
            result = Math.sqrt(valor);
            System.out.format("Raiz Quadrada: %.4f\n", result);
            result = Math.cbrt(valor);
            System.out.format("Raiz Cubica: %.4f\n", result);
            result = Math.abs(valor);
            System.out.println("Valor Absoluto: " + result);
        }
    }

}
