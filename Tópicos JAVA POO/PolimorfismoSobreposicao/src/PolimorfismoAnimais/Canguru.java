package PolimorfismoAnimais;

public class Canguru extends Mamifero{
    // Metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Saltando.");
    }

    // Metodos Genericos
    public void usarBolsa() {
        System.out.println("Usando bolsa.");
    }
}
