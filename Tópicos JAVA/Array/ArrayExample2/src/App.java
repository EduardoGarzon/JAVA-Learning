public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String[] name = { "Luiz Eduardo" };
        System.out.format("Nome: %s\n", name);
        System.out.println("Tamanho: " + name.length);

        int[] arr = { 1, 2, 3, 4, 5 };
        int soma = 0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        System.out.println("Soma do elementos do array: " + soma);
    }
}
