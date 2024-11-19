/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package calcularidade.CalcularIdade;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CalcularIdade {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o ano de nascimento");
            int nasc = scan.nextInt();
            System.out.println("Informe o ano atual: ");
            int ano = scan.nextInt();
            final int idade = ano - nasc;
            System.out.println("Sua idade atual: " + idade);
        }
    }
}
