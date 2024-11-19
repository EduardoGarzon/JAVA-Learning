package resolucao.Resolucao;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolucao {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width =  " + d.width); // imprime a largura da tela
        System.out.println("Screen heigh = " + d.height); // imprime a altura da tela
    }
}
