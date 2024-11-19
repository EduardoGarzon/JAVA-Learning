/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package testeclassemath.TesteClasseMath;

/**
 *
 * @author HP
 */
public class TesteClasseMath {

    public static void main(String[] args) {
        // Classe Math
        double raiz = Math.sqrt(25);
        System.out.println("Raiz Quadrada de 25: " + raiz);
        double exp = Math.pow(raiz, 2);
        System.out.println("Potencia da raiz com expoente 2: " + exp);
        double pi = Math.PI;
        System.out.println("Numero PI: " + pi);

        int absoluto = Math.abs(-10); // valor absoluto
        System.out.println("Valor absoluto de -10: " + absoluto);
        double num3 = Math.floor(3.9); // arredonda para baixo
        System.out.println("floor de 3.9: " + num3);
        num3 = Math.ceil(3.2); // arredonda para cima
        System.out.println("ceil de 3.2: " + num3);
        
        num3 = Math.round(3.6); // arredonda de forma aritmetica
        System.out.println("round de 3.6 : " + num3);
        double aleatorio = Math.random(); // numero aleatorio entre 0.0 e 1.0
        System.out.println("random: " + aleatorio);
        double ale = (int) (0 + aleatorio * (10 - 0));
        System.out.println("rando 0-10: " + ale);

    }
}
