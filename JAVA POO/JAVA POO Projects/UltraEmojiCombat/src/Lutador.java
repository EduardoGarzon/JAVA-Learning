public class Lutador {
    // atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Metodos Publicos
    public void apresentar() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("APRESENTANDO O LUTADOR " + this.getNome());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " de idade" + " e " + this.getAltura() + " de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Vitorias " + this.getVitorias());
        System.out.println("Derrotas " + this.getDerrotas());
        System.out.println("Empates " + this.getEmpates());
        System.out.println("--------------------------------------------------------------");
    }

    public void status() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("STATUS ATUAL");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Lutador " + this.getNome() + " é categoria " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("---------------------------------------------------------------");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // metodos especiais
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() // metodo interno por isso private
    {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

}
