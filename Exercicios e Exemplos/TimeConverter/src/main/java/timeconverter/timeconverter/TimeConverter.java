/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package timeconverter.timeconverter;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o total de dias: ");
        int dias = scan.nextInt();
        dias *= 24;
        System.out.println("Total de horas: " + dias);
        dias *= 60;
        System.out.println("Total de minutos: " + dias);
        dias *= 60;
        System.out.println("Total de segundos: " + dias);

    }
}
