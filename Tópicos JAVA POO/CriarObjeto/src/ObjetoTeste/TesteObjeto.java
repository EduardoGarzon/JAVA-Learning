package ObjetoTeste;

public class TesteObjeto {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic";
        c1.carga = 2;

        c1.destampar();
        c1.status();
        c1.rabiscar();

        System.out.println("\n--------------------------------------\n");

        Caneta c2 = new Caneta();
        c2.cor = "preto";
        c2.ponta = 0.8f;
        c2.modelo = "Faber Casttle";
        c2.carga = 5;

        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
