package contador;

public class contador {
    public static String cont(int inicio, int fim) {
        String contagem = "";
        for (int i = inicio; i <= fim; i++) {
            contagem += i + " ";
        }
        return contagem;
    }
}
