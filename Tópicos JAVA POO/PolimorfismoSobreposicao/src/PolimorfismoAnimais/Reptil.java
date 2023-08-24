package PolimorfismoAnimais;

public class Reptil extends Animal {
    // Atributos
    private String corEscama;

    // Metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil.");
    }

    // Metodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama (String corEscama) {
        this.corEscama = corEscama;
    }

}
