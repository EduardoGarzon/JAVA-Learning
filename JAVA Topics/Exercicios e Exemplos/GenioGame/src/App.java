import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int resposta = 0;
        int teste = 0;
        while (teste == 0) {
            double aleatorio = Math.random();
            double aleatorio2 = (int) (0 + aleatorio * (5 - 0));
            System.out.println("Adivinhe o numero de 0 ate 5: ");
            resposta = scan.nextInt();
            teste = (resposta == aleatorio2) ? 1 : 0;
            if (teste == 1) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Errou, Pensei : " + aleatorio2);
            }
        }
    }
}
 