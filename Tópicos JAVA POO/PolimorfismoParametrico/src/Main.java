import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] elementos = {0, 1, 2, 3, 4};
        Integer[] elementos2 = {5, 6, 7, 8, 9};
        Integer[] elementos3 = new Integer[5];

        Lista<Integer> lista = new Lista<Integer>(elementos);
        System.out.println(lista.toString());

        /*
         *  lista.setElementos(elementos2);
         *  Atribuicao direta, ambos elementos2 e lista apontam
         *  para o mesmo objeto na memoria.
         *  Todas as modificacoes em lista atingem elementos2 tambem.
         * */
        lista.setElementos(Arrays.copyOf(elementos2, elementos2.length));
        System.out.println(lista.toString());

        lista.setElemento(0 , 100);
        lista.setElemento(4, 500);
        System.out.println(lista.toString());

        System.out.println(lista.getElemento(0));

        elementos3 =  lista.getElementos();

        System.out.println("elementos = " + Arrays.toString(elementos));
        System.out.println("elementos2 = " + Arrays.toString(elementos2));
        System.out.println("elementos3 = " + Arrays.toString(elementos3));
    }
}