import contador.contador;

public class App {
    static void soma(int a, int b) { // funcao sem retorno, void, static pois funcioma apenas na classe
        int somatorio = a + b;
        System.out.println("Valor da Soma: " + somatorio);
    }

    static int multi(int a, int b) { // funcao com retorno, tipo int identificado
        int mt = a * b;
        return mt;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Comecou o programa.");
        soma(10, 10);
        int mt = multi(2, 10);
        System.out.println("Valor da Multiplicacao: " + mt);

        System.out.println("Contador: ");
        System.out.println(contador.cont(1, 5));
    }
}   
