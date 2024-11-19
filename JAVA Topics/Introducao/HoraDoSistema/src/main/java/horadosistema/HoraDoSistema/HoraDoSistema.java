package horadosistema.HoraDoSistema;

import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sitema é");
        System.out.println(relogio.toString());
        /**
         * Date é uma classe
         * new para criar um novo objeto
         * relogio é um objeto pois a palavra new o procede
         * .toString() é um metodo que converte objeto Date para string
         */
    }
}
