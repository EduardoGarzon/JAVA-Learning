public class Pessoa {
    private String Nome;
    private int Idade;
    private String Sexo;

    public Pessoa(String n, int i, String s) {
        this.Nome = n;
        this.Idade = i;
        this.Sexo = s;
    }

    // metodos simples
    public void fazerAniversario() {
        this.Idade++;
    }

    // metodos especiais
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String n) {
        this.Nome = n;
    }

    public int getIdade() {
        return this.Idade;
    }

    public void setIdade(int i) {
        this.Idade = i;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String s) {
        this.Sexo = s;
    }

}
