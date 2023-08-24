import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] primes = { 2, 3, 5, 7, 11 };
        int[] notprime = { 1, 4, 6, 8, 9, 10 };

        Scanner scan = new Scanner(System.in);
        System.out.print("0 [Primes] or 1 [Not Primes]: ");
        int option = scan.nextInt();

        if (option == 0) {
            for (int p : primes) {
                System.out.println(p);
            }
        } else if (option == 1) {
            for (int np : notprime) {
                System.out.println(np);
            }
        }

    }
}
