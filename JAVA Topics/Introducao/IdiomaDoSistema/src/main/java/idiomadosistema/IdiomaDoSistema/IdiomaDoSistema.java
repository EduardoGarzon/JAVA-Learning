package idiomadosistema.IdiomaDoSistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage()); // imprime idioma
        System.out.println(loc.getLanguage()); // imprime sigla
    }
}
    