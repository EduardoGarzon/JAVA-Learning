/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package basic.basicconcepts;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class BasicConcepts {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("INFORME SEU NOME: ");
        String nome = scan.nextLine();

        System.out.print("INFORME SUA IDADE: ");
        int age = scan.nextInt();

        System.out.print("INFORME SUA PONTUACAO: ");
        double score = scan.nextDouble();

        char classe;
        if (score >= 8) {
            classe = 'A';
        } else if (score >= 7 && score < 8) {
            classe = 'B';
        } else {
            classe = 'C';
        }

        System.out.println("NOME: " + nome);
        System.out.println("AGE: " + age);
        System.out.println("SCORE: " + score);
        System.out.println("CLASSE: " + classe);
    }
}
