package PolimorfismoAnimais;

public class Ave extends Animal {
    // Atributos
    private String corPena;

    // Metodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave.");
    }

    // Metodos Genericos
    public void fazerNinho() {
        System.out.println("Fez um ninho.");
    }

    // Metodos Especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
