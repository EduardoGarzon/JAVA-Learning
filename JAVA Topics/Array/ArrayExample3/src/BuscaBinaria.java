import java.util.Arrays;

public class BuscaBinaria {
    public static void main(String[] args) throws Exception {
        int numeros[] = {5, 4, 3, 2, 1 , 0};
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        int p = Arrays.binarySearch(numeros, 3);
        System.out.println("Valor encontrado na posicao " +  p);
    }
}
