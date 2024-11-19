package ContaCorrente;

public class Conta {
    public int NumConta;
    protected String tipo; // cp - poupanca ou cc - corrente
    private String donoConta;
    private double saldo;
    private boolean status; // conta aberta ou fechada
    protected int mensalidade;

    public void constructor() // metodo construtor que atribui ao instanciar uma classe (virar objeto)
    {
        this.saldo = 0.0;
        this.status = false; // conta fechada ao iniciar
    }

    // metodos especiais

    public void setNumConta(int numero) {
        this.NumConta = numero;
    }

    public int getNumConta() {
        return this.NumConta;
    }

    public void setTipo(String tipoConta) {
        this.tipo = tipoConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setdonoConta(String dono) {
        this.donoConta = dono;
    }

    public String getdonoConta() {
        return this.donoConta;
    }

    public void setsaldo(Double valor) {
        this.saldo = valor;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public void setstatus(boolean stts) {
        this.status = stts;
    }

    public boolean getstatus() {
        return this.status;
    }

    public int getmensalidade() {
        return this.mensalidade;
    }

    public void setmensalidade(int mensal) {
        this.mensalidade = mensal;
    }

    // metodos genericos

    public void abrirConta(String tipoConta) {
        setTipo(tipoConta); // o Tipo vai ser configurado para o valor de tipoConta
        setstatus(true);
        if (tipoConta.equals("cc")) {
            this.saldo = 50;
            setmensalidade(12);
        } else if (tipoConta.equals("cp")) {
            this.saldo = 150;
            setmensalidade(20);
        }
    }

    public void fecharConta() {
        if (status) {
            if (saldo > 0) {
                System.out.println("Conta com dinheiro!");
            } else if (saldo < 0) {
                System.out.println("Conta em Débito!");
            } else {
                System.out.println("Conta fechada com sucesso!");
                setstatus(false); // conta fechada
            }
        } else {
            System.out.println("Nao existe uma conta aberta!");
        }
    }

    public void depositar(double valor) {
        if (status) {
            setsaldo(getsaldo() + valor);
        } else {
            System.out.println("Conta fechada! Impossivel Depositar!");
        }
    }

    public void sacar(double valor) {
        if (status) {
            if (saldo >= valor) {
                setsaldo(getsaldo() - valor);
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Conta Fechada!");
        }
    }

    public void pagarMensal() {
        if (getstatus()) {
            if (getTipo().equals("cc")) {
                if (getsaldo() >= getmensalidade()) {
                    setsaldo(getsaldo() - getmensalidade());
                } else {
                    System.out.println("Saldo insuficiente para pagar mensalidade!");
                }
            } else if (getTipo().equals("cp")) {
                if (getsaldo() >= getmensalidade()) {
                    setsaldo(getsaldo() - getmensalidade());
                } else {
                    System.out.println("Saldo insuficiente para pagar mensalidade!");
                }
            }

        } else {
            System.out.println("Conta Fechada!");
        }

    }
}

