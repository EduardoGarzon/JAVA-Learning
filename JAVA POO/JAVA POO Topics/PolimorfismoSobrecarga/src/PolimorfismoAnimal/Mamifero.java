package PolimorfismoAnimal;

public class Mamifero extends Animal {
    // Atributos
    protected String corPelo;

    // Metodos abstratos
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero.");
    }

    // Metodos Especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
