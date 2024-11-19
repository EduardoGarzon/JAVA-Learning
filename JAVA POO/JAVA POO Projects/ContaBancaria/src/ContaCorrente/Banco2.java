package ContaCorrente;

import java.util.Scanner;

public class Banco2 {
    private Conta conta; // Dependência da classe Banco

    // Injeção de dependência via construtor
    public Banco2(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        Scanner scan = new Scanner(System.in);
        conta.constructor();

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
                    conta.setdonoConta(scan.nextLine());
                    System.out.print("Tipo da conta: cc - corrente ou cp - poupanca: ");
                    conta.abrirConta(scan.nextLine());
                    System.out.print("Informe o numero da conta: ");
                    conta.setNumConta(scan.nextInt());
                    clearBuffer(scan);
                    option = 0;
                }
                case 2 -> {
                    conta.fecharConta();
                    System.out.printf("Status da conta " + conta.getstatus() + "\n");
                    System.out.printf("Saldo em conta: " + conta.getsaldo() + "\n");
                    option = 0;
                }
                case 3 -> {
                    System.out.printf("Dono da conta: " + conta.getdonoConta() + "\n");
                    System.out.printf("Status da conta " + conta.getstatus() + "\n");
                    System.out.printf("Numero da conta: " + conta.getNumConta() + "\n");
                    System.out.printf("Tipo da conta: " + conta.getTipo() + "\n");
                    System.out.printf("Saldo em conta: " + conta.getsaldo() + "\n");
                    System.out.printf("Mensalidade: " + conta.getmensalidade() + "\n");
                    option = 0;
                }
                case 4 -> {
                    System.out.printf("Saldo em conta: " + conta.getsaldo() + "\n");
                    System.out.print("Valor para sacar: ");
                    conta.sacar(scan.nextDouble());
                    System.out.printf("Saldo em conta: " + conta.getsaldo() + "\n");
                    clearBuffer(scan);
                    option = 0;
                }
                case 5 -> {
                    System.out.printf("Saldo em conta: " + conta.getsaldo() + "\n");
                    System.out.print("Valor do deposito: ");
                    conta.depositar(scan.nextDouble());
                    System.out.printf("Saldo em conta: " + conta.getsaldo() + "\n");
                    clearBuffer(scan);
                    option = 0;
                }
                case 6 -> {
                    conta.pagarMensal();
                    System.out.printf("Mensalidade: " + conta.getmensalidade() + "\n");
                    System.out.printf("Saldo em conta anterior: " + conta.getsaldo() + "\n");
                    System.out.printf("Novo saldo em conta: " + conta.getsaldo() + "\n");
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

    public static void main(String[] args) {
        Conta c = new Conta();
        Banco2 banco = new Banco2(c); // Injeção de dependência da classe Conta
        banco.executar();
    }
}
