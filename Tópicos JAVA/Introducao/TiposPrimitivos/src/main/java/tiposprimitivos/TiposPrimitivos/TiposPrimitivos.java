/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tiposprimitivos.TiposPrimitivos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 10;
        String str = Integer.toString(numero);
        System.out.println("Teste: Int para String: " + str);
        numero = Integer.parseInt(str);
        System.out.println("Teste: String para Int: " + numero);
        
        System.out.println("Informe o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.println("Informe a nota do aluno: ");
        float nota = scan.nextFloat();
        System.out.printf("A nota de %s é: %.2f", nome, nota);
        //System.out.format("A nota de %s é: %.2f", nome, nota);
        //System.out.print("A nota de é: " + nota);
        //System.out.println("A nota de é: " + nota);
    }
}
