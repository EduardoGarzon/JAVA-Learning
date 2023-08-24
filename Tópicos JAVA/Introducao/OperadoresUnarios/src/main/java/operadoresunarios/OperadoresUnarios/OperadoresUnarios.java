/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresunarios.OperadoresUnarios;

/**
 *
 * @author HP
 */
public class OperadoresUnarios {

    public static void main(String[] args) {
        // Operadores Unarios
        int num1 = 5;
        int valor = num1++; // utiliza e depois modifica
        System.out.println("Valor com num1 pos incremento: " + valor);
        System.out.println("num1 pos incremento: " + num1);

        valor = ++num1; // modifica e depois utiliza
        System.out.println("Valor com num1 pre incremento: " + valor);
        System.out.println("num1 pre incremento: " + num1);
    }
}
