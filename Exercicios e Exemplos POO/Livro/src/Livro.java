public class Livro implements Publicacao {
    private String Titulo;
    private String Autor;
    private int TotalPag;
    private int PagAtual;
    private boolean Aberto;
    private Pessoa Leitor;

    public Livro(String t, String a, int totpag, Pessoa l) {
        this.Titulo = t;
        this.Autor = a;
        this.TotalPag = totpag;
        this.PagAtual = 0;
        this.Aberto = false;
        this.Leitor = l;
    }

    public void descricao() {
        System.out.println("---------------------------------------");
        System.out.println("LIVRO: " + getTitulo());
        System.out.println("TOTAL DE PAGINAS: " + getTotalPag());
        System.out.println("PAGINA ATUAL: " + getPagAtual());
        System.out.println("ABERTO?: " + getAberto());
        System.out.println("LEITOR: " + getLeitor());
        System.out.println("---------------------------------------\n");
    }

    private String getTitulo() {
        return this.Titulo;
    }

    private void setTitulo(String t) {
        this.Titulo = t;
    }

    private String getAutor() {
        return this.Autor;
    }

    private void setAutor(String a) {
        this.Autor = a;
    }

    private int getTotalPag() {
        return this.TotalPag;
    }

    private void setTotalPag(int tot) {
        this.TotalPag = tot;
    }

    private int getPagAtual() {
        return this.PagAtual;
    }

    private void setPagAtual(int at) {
        this.PagAtual = at;
    }

    private boolean getAberto() {
        return this.Aberto;
    }

    private void setAberto(boolean ab) {
        this.Aberto = ab;
    }

    private String getLeitor() {
        return this.Leitor.getNome();
    }

    private void setLeitor(Pessoa l) {
        this.Leitor = l;
    }

    @Override
    public void abrir() {
        this.Aberto = true;
    }

    @Override
    public void fechar() {
        this.Aberto = false;
    }

    @Override
    public void folhear(int f) {
        if (f > getTotalPag()) {
            this.PagAtual = 0;
        } else {
            this.PagAtual = f;
        }
    }

    @Override
    public void avancarPag() {

        this.PagAtual++;
    }

    @Override
    public void voltarPag() {
        this.PagAtual--;
    }
}
