import java.util.Arrays;
import java.util.Scanner;

public class ArrayEditavel {
    public static void main(String[] args) throws Exception {
        int numero[] = new int[5];
        Arrays.fill(numero, 0);

        int option = 0;
        int position = 0;
        int valor = 0;
        try (Scanner scan = new Scanner(System.in)) {
            do {
                System.out.println("[1]  - Adicionar Valor");
                System.out.println("[2]  - Remover Valor");
                System.out.println("[3]  - Exibir Vetor");
                System.out.println("[0]  - Sair");
                option = scan.nextInt();
                System.out.println("\n");
                switch (option) {
                    case 1:
                        System.out.println("Informe a posicao: ");
                        position = scan.nextInt();
                        System.out.println("Informe o novo valor: ");
                        valor = scan.nextInt();
                        numero[position] = valor;
                        System.out.println("Valor Adicionado.");
                        break;
                    case 2:
                        System.out.println("Informe a posicao: ");
                        position = scan.nextInt();
                        numero[position] = 0;
                        System.out.println("Valor Removido.");
                        break;
                    case 3:
                        System.out.println("Valores do Vetor: ");
                        for (int i : numero) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 0:
                        System.out.println("Programa Encerrado.");
                        break;
                    default:
                        break;
                }
                System.out.println("\n");
            } while (option != 0);
        }
    }
}
