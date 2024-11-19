import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe lado A: ");
        int a = scan.nextInt();
        System.out.print("Informe lado B: ");
        int b = scan.nextInt();
        System.out.print("Informe lado C: ");
        int c = scan.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Os lados formam um Triangulo");
            if (a == b && b == c) {
                System.out.println("Triangulo Equilatero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Triangulo Escaleno");
            } else {
                System.out.println("Triangulo Isosceles");
            }
        } else {
            System.out.println("Os lados nao formam um triangulo");
        }
    }
}
