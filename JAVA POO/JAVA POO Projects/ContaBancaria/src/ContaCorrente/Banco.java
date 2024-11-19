package ContaCorrente;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner scan = new Scanner(System.in);
        c.constructor();

        int option = 0;
        while (option == 0) {
            System.out.println("-------------------------------");
            System.out.println("[1] - Abrir Conta");
            System.out.println("[2] - Fechar Conta");
            System.out.println("[3] - Exibir Conta");
            System.out.println("[4] - Sacar");
            System.out.println("[5] - Depositar");
            System.out.println("[6] - Pagar Mensalidade");
            System.out.println("[7] - Sair");
            System.out.println("INFORME A OPCAO DESEJADA: ");
            option = scan.nextInt();
            clearBuffer(scan);
            System.out.println("-------------------------------");

            switch (option) {
                case 1 -> {
                    System.out.print("Informe o nome: ");
                    c.setdonoConta(scan.nextLine());
                    System.out.print("Tipo da conta: cc - corrente ou cp - poupanca: ");
                    c.abrirConta(scan.nextLine());
                    System.out.print("Informe o numero da conta: ");
                    c.setNumConta(scan.nextInt());
                    clearBuffer(scan);
                    option = 0;
                }
                case 2 -> {
                    c.fecharConta();
                    System.out.printf("Status da conta " + c.getstatus() + "\n");
                    System.out.printf("Saldo em conta: " + c.getsaldo() + "\n");
                    option = 0;
                }
                case 3 -> {
                    System.out.printf("Dono da conta: " + c.getdonoConta() + "\n");
                    System.out.printf("Status da conta " + c.getstatus() + "\n");
                    System.out.printf("Numero da conta: " + c.getNumConta() + "\n");
                    System.out.printf("Tipo da conta: " + c.getTipo() + "\n");
                    System.out.printf("Saldo em conta: " + c.getsaldo() + "\n");
                    System.out.printf("Mensalidade: " + c.getmensalidade() + "\n");
                    option = 0;
                }
                case 4 -> {
                    System.out.printf("Saldo em conta: " + c.getsaldo() + "\n");
                    System.out.print("Valor para sacar: ");
                    c.sacar(scan.nextDouble());
                    System.out.printf("Saldo em conta: " + c.getsaldo() + "\n");
                    clearBuffer(scan);
                    option = 0;
                }
                case 5 -> {
                    System.out.printf("Saldo em conta: " + c.getsaldo() + "\n");
                    System.out.print("Valor do deposito: ");
                    c.depositar(scan.nextDouble());
                    System.out.printf("Saldo em conta: " + c.getsaldo() + "\n");
                    clearBuffer(scan);
                    option = 0;
                }
                case 6 -> {
                    c.pagarMensal();
                    System.out.printf("Mensalidade: " + c.getmensalidade() + "\n");
                    System.out.printf("Saldo em conta anterior: " + c.getsaldo() + "\n");
                    System.out.printf("Novo saldo em conta: " + c.getsaldo() + "\n");
                    option = 0;
                }
                case 7 -> System.out.println("PROGRAMA ENCERRADO!");
                default -> {
                    System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE!");
                    option = 0;
                }
            }

        }

    }

    private static void clearBuffer(Scanner Scanner) {
        if (Scanner.hasNextLine()) {
            Scanner.nextLine();
        }
    }
}
