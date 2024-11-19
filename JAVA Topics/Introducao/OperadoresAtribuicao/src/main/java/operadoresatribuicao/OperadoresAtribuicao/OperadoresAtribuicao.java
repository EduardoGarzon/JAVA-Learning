/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package operadoresatribuicao.OperadoresAtribuicao;

/**
 *
 * @author HP
 */
public class OperadoresAtribuicao {

    public static void main(String[] args) {
        // Operadores de Atribuicao
        int num1 = 3;
        int valor = 5;
        valor += 2;
        System.out.println("valor += 2: " + valor);
        valor -= num1;
        System.out.println("valor -= num1: " + valor);
        valor *= 4;
        System.out.println("valor *= 4: " + valor);
        valor /= 2;
        System.out.println("valor /= 2: " + valor);
        valor %= num1;
        System.out.println("valor %= num1: " + valor);
    }
}
