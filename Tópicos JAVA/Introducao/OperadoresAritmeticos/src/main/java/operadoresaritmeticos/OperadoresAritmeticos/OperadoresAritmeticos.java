/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package operadoresaritmeticos.OperadoresAritmeticos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        int num2 = scan.nextInt();

        // Operadores Aritmeticos
        float div = num1 / num2;
        System.out.println("Divisao: " + div);
        int res = num1 % num2;
        System.out.println("Resto da Divisao: " + res);
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
        int sub = num1 - num2;
        System.out.println("Subtracao: " + sub);
        int mult = num1 * num2;
        System.out.println("Multiplicacao: " + mult);
    }
}
