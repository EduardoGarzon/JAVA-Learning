import java.util.Arrays;

public class AutoFill {
    public static void main(String[] args) throws Exception {
        int num[] = new int[5];
        Arrays.fill(num, 10);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
