package PolimorfismoAnimal;

public class Main {
    public static void main(String[] args) {
        Cachorro ch = new Cachorro();

        ch.emitirSom();
        System.out.println();
        ch.reagir("Hello");
        ch.reagir("Hora do Banho");
        System.out.println();
        ch.reagir(11, 45);
        ch.reagir(21, 0);
        ch.reagir(14, 45);
        System.out.println();
        ch.reagir(true);
        ch.reagir(false);
        System.out.println();
        ch.reagir(2, 12.5f);
        ch.reagir(17, 4.5f);

    }
}