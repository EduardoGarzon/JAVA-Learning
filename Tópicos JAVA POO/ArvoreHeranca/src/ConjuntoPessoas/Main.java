package ConjuntoPessoas;

public class Main {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); ERRO, nao se pode instanciar uma classe abstrata
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        v1.setNome("Carlos");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        System.out.println();

        a1.setNome("Luiz");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.setCurso("Ciencia da Computacao");
        a1.setMatricula(141516);
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        System.out.println();

        b1.setNome("Pedro");
        b1.setIdade(22);
        b1.setSexo("M");
        b1.setCurso("Engenharia");
        b1.setMatricula(171819);
        b1.setBolsa(120.00f);
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        System.out.println("Mensalidade: " + b1.getBolsa());

    }
}