package ConjuntoPessoas;

public class Bolsista extends Aluno {
    /*
    * Heranca para Diferenca
    * Bolsista é especializacao de Aluno
    * Aluno é generalizacao de Bolsista
    * */

    // Atributos
    private float bolsa;

    // Metodos
    public void renovarBolsa() {
        System.out.println("Bolsa do aluno " + this.nome + " renovada!");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno bolsista " + this.nome + " pagou a mensalidade.");
    }

    // Metodos Especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
