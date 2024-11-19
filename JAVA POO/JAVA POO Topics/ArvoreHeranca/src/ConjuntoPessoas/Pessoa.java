package ConjuntoPessoas;

public abstract class Pessoa {
    // Classe Abstrata

    // Atributos
    protected String nome; // protected da acesso as subclasses da superclasse
    protected String sexo;
    protected int idade;

    // Metodos
    public final void fazerAniversario(){
        this.idade ++;
    }

    // Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
