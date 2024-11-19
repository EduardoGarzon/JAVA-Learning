package ProjetoPessoas;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Luiz");
        p2.setNome("Eduarda");
        p3.setNome("Fernanda");
        p4.setNome("Carlos");

        p1.setIdade(21);
        p2.setIdade(21);
        p3.setIdade(30);
        p4.setIdade(50);

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("M");

        p2.cancelarMatricula();
        p3.aumentaSalario();
        p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}