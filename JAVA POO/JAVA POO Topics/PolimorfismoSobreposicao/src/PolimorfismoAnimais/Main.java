package PolimorfismoAnimais;

public class Main {
    public static void main(String[] args) {
        Ave a = new Ave();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Mamifero m = new Mamifero();

        Canguru c = new Canguru();
        Cachorro ch = new Cachorro();
        Cobra cb = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();

        a.setPeso(10.5f);
        a.setIdade(20);
        a.setMembros(10);
        a.setCorPena("Branco");

        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        System.out.println();

        p.setPeso(5.5f);
        p.setIdade(2);
        p.setMembros(5);
        p.setCorEscama("Dourado");

        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        System.out.println();

        r.setPeso(80.5f);
        r.setIdade(23);
        r.setMembros(100);
        r.setCorEscama("Verde");

        r.locomover();
        r.alimentar();
        r.emitirSom();

        System.out.println();

        m.setPeso(7f);
        m.setIdade(13);
        m.setMembros(12);
        m.setCorPelo("Cinza");

        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println();

        c.locomover();
        c.emitirSom();

        System.out.println();

        ch.locomover();
        ch.emitirSom();
    }
}