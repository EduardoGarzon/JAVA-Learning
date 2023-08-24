import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas: ");
        int quantidade = scan.nextInt();
        double media = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.format("Informe a nota [%d]: ", i);
            double nota = scan.nextDouble();
            media += nota;
        }
        media = (media / quantidade);
        if (media >= 7.0) {
            System.out.println("Aluno Aprovado! Media : " + media);
        } else if (media >= 4.0 && media <= 6.9) {
            System.out.println("Aluno em Exame! Media: " + media);
        } else {
            System.out.println("Aluno Reprovado! Media: " + media);
        }
    }
}
