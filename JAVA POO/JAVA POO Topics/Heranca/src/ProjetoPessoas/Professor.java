package ProjetoPessoas;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;

    // Metodos
    public void aumentaSalario() {
        System.out.println("Salario aumentado!");
    }

    // Metodos Especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
