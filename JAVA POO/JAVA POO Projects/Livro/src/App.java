public class App {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Maria", 25, "Mulher");
        p[1] = new Pessoa("Joao", 20, "Homem");

        l[0] = new Livro("Livro 1", "joazinho", 100, p[0]);
        l[1] = new Livro("Livro 2", "mariazinha", 200, p[1]);

        p[0].fazerAniversario();
        System.out.println("Nome: " + p[0].getNome());
        System.out.println("Idade: " + p[0].getIdade());
        System.out.println("Sexo: " + p[0].getSexo());

        System.out.println("\n-----------------------------------------\n");

        l[0].abrir();
        l[0].folhear(50);
        l[0].descricao();

        l[0].avancarPag();
        l[0].descricao();

        l[0].voltarPag();
        l[0].fechar();
        l[0].descricao();
    }
}
