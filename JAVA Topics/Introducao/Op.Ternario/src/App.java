import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Testando Operador Ternario com Numeros:");
        System.out.print("Infome um numero: ");
        int num1 = scan.nextInt();
        System.out.print("Informe outro numero: ");
        int num2 = scan.nextInt();

        int res = (num1 > num2) ? num1 : num2;
        System.out.println("O maior numero é : " + res);

        System.out.println("\n\nTestanto Operador Ternario com String");
        String nome1 = "Luiz";
        String nome2 = "Luiz";
        String nome3 = new String("Luiz");
        String comparar1 = (nome1 == nome2) ? "Iguais" : "Diferentes";
        String comparar2 = (nome1.equals(nome3)) ? "Iguais" : "Diferentes";
        System.out.println(comparar1);
        System.out.println(comparar2);

        System.out.println("\n\nTestando Operador Ternario com Operadores Lógicos");
        num1 = 5;
        num2 = 10;
        res = (num1 < num2 && num2 > 0) ? 1 : 0;
        System.out.println(res);
    }
}
