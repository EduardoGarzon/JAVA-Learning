import java.util.Scanner;

public class MeseDiasArray {
    public static void main(String[] args) throws Exception {
        String mes[] = { "zero", "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
        int dias[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o numero do mes: ");
            int res = scan.nextInt();
            System.out.println("O mes " + mes[res] + " tem " + dias[res] + " dias.");
        }
    }
}
