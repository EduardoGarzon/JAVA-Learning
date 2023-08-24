import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("1 - Entrar / 0 - Sair : ");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.print("Informe a idade: ");
                int idade = scan.nextInt();
                if (idade < 16) {
                    System.out.println("Nao Votante!");
                } else if ((idade >= 16 && idade < 18) || (idade >= 70)) {
                    System.out.println("Voto Opcional");
                } else {
                    System.out.println("Voto Obrigatorio");
                }
                break;
            case 0:
                System.out.println("Programa Encerrado.");
                break;
            default:
                break;
        }

    }
}
