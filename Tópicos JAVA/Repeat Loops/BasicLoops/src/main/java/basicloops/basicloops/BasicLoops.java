/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package basicloops.basicloops;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class BasicLoops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro de inicio: ");
        int inicio = scan.nextInt();
        System.out.println("Informe o passo inteiro de contagem: ");
        int passo = scan.nextInt();
        System.out.println("Informe a quantidade de repeticoes: ");
        int cont = scan.nextInt();

        System.out.println("----- Contagem ++ -----");
        int x = 0;
        for (x = 0; x <= cont; x++) {
            System.out.println("Contagem ++: " + inicio);
            inicio += passo;
        }
        System.out.println("----- Contagem -- -----");
        while (x != 0) {
            inicio -= passo;
            System.out.println("Contagem--: " + inicio);
            x--;
        }
    }
}
