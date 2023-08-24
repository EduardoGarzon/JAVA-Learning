package Encapsulamento;

public class App {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.abrirMenu();

        System.out.println("\n-----------------\n");

        c.maisVolume();
        c.pause();
        c.abrirMenu();

        System.out.println("\n-----------------\n");

        c.play();
        c.ligarMudo();
        c.desligar();
        c.abrirMenu();

        System.out.println("\n-----------------\n");

        c.ligar();
        c.ligarMudo();
        c.desligarMudo();
        c.menosVolume();
        c.abrirMenu();
        c.fecharMenu();

    }
}
