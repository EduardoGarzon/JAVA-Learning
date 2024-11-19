import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int[] arr = new int[5];
            int i = 0;
            while (i <= 4) {
                System.out.format("Informe um valor para a posicao [%d]: ", i);
                arr[i] = scan.nextInt();
                i++;
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.format("Valor [%d]: [%d] \n", j, arr[j]);
            }


        }
    }
}
