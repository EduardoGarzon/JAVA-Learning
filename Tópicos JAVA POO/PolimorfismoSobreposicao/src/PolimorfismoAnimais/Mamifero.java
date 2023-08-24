package PolimorfismoAnimais;

public class Mamifero extends Animal{
    // Atributos
    private String corPelo;

    // Metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Correndo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero.");
    }

    // Metodos Especiais

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
