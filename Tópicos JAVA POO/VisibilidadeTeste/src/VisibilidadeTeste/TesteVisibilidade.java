package VisibilidadeTeste;

public class TesteVisibilidade {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; nao funciona
        c1.carga = 80;  
        c1.tampada = true;

        c1.status();
        c1.rabiscar();

        c1.tampar();
        c1.status();
        c1.destampar();
    }
}
