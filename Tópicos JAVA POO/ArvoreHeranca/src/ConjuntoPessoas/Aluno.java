package ConjuntoPessoas;

public class Aluno extends Pessoa{
    /*
    * Heranca para Diferenca
    * Aluno possui sua especializacao
    * Aluno é especializacao de Pessoa
    * Pessoa é genezalizacao de Aluno
    * */

    //Atributos
    private int matricula;
    private String curso;

    // Metodos
    public void pagarMensalidade(){
        System.out.println("O aluno " + this.nome + " pagou a mensalidade!");
    }

    // Metodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
