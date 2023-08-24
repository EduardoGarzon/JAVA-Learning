/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionalsandloops;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class ConditionalsandLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 60) {
            System.out.println("Adulto Idoso");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Adulto, Maior de idade");
        } else if (idade >= 13 && idade < 18) {
            System.out.println("Menor de idade, Adolescente");
        } else {
            System.out.println("Menor de idade, Crianca");
        }

        System.out.print("Informe o dia 1 - 7: ");
        int day = scan.nextInt();

        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 ->
                "working day.";
            case 6, 7 ->
                "Weekend.";
            default ->
                "Invalid day";
        };

        switch (day) {
            case 1:
                System.out.println("Monday, " + dayType);
                break;
            case 2:
                System.out.println("Tuesday, " + dayType);
                break;
            case 3:
                System.out.println("Wednesday, " + dayType);
                break;
            case 4:
                System.out.println("Thursday, " + dayType);
                break;
            case 5:
                System.out.println("Friday, " + dayType);
                break;
            case 6:
                System.out.println("Saturday, " + dayType);
                break;
            case 7:
                System.out.println("Sunday, " + dayType);
                break;
            default:
                System.out.println("ERRO INESPERADO. TENTE NOVAMENTE");

        }

        int x = 0;
        while (x != day) {
            x++;
        }
        System.out.println("Dia da Semana: " + x);

        
    }
}
