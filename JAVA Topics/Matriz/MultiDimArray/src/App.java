import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int[][] sample = { { 1, 2, 3 }, { 4, 5, 6 } }; [i] linha [j] coluna
        // System.out.println(sample[1][0]); imprime valor 4

        // Exemplo de Array 3x3
        int[][] sample = new int[3][3];
        try (Scanner scan = new Scanner(System.in)) {
        }
        for (int i = 0; i < sample.length; i++) {
            for (int j = 0; j < sample.length; j++) {
                sample[i][j] = j;
            }
        }
        for (int i = 0; i < sample.length; i++) {
            for (int j = 0; j < sample.length; j++) {
                System.out.print(sample[i][j] + " ");
            }
            System.out.println();
        }
    }
}
