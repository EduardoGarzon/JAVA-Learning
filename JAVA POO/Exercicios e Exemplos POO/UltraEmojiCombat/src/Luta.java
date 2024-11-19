import java.util.Random;

public class Luta {
    // atributos
    private Lutador desafiante; // instancias de outra classe, tipo abstrado
    private Lutador desafiado; // relacionamento do tipo tem 1 (agregacao), a classe B tem um atributo da
                               // classe A
    private int rounds;
    private boolean aprovada;

    // metodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            setAprovado(true);
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            setAprovado(false);
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void Lutar() {
        if (getAprovado()) {
            System.out.println("##### DESAFIANTE #####");
            this.desafiante.apresentar();
            System.out.println("##### DESAFIADO #####");
            this.desafiado.apresentar();
            Random aleatorio = new Random(); // random para vencedor
            int winner = aleatorio.nextInt(3); // 0 1 2
            switch (winner) {
                case 0: // empate
                    System.out.println("A luta empatou!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // desafiante ganhou
                    System.out.println("-------------------------------------------------------");
                    System.out.println("O desafiante " + this.desafiante.getNome() + " ganhou!");
                    System.out.println("-------------------------------------------------------");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2: // desafiado ganhou
                    System.out.println("-----------------------------------------------------");
                    System.out.println("O desafiado " + this.desafiado.getNome() + " ganhou!");
                    System.out.println("-----------------------------------------------------");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("A luta nao foi aprovada");
        }
    }

    // metodos especiais
    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador df) {
        this.desafiante = df;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rd) {
        this.rounds = rd;
    }

    public boolean getAprovado() {
        return this.aprovada;
    }

    public void setAprovado(boolean ap) {
        this.aprovada = ap;
    }
}
