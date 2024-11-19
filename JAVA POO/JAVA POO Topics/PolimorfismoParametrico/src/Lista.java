import java.util.Arrays;

// TIPOS GENERICOS
public class Lista<T> {
    // Atributos
    private T[] elementos;

    // Constructor
    public Lista(T[] elementos) {
        this.elementos = elementos;
    }

    // Metodos Especiais
    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }

    public T getElemento(int indice) {
        return this.elementos[indice];
    }

    public void setElemento(int indice, T elemento) {
        this.elementos[indice] = elemento;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "elementos=" + Arrays.toString(elementos) +
                '}';
    }
}
