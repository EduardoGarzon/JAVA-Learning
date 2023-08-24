package PolimorfismoAnimais;

public class Peixe extends Animal{
    // Atributos
    private String corEscama;

    // Metodos abstratos

    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som.");
    }

    // Metodos Genericos

    public void soltarBolha() {
        System.out.println("Soltou uma bolha.");
    }

    // Metodos Especiais

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
