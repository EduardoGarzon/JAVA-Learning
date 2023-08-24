import Fatorial.Fatorial;

public class App {
    public static void main(String[] args) throws Exception {
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.println(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
