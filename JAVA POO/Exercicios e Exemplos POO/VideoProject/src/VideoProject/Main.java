package VideoProject;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        Gafanhoto[] gafanhotos = new Gafanhoto[3];

        videos[0] = new Video("Video 1");
        videos[1] = new Video("Video 2");
        videos[2] = new Video("Video 3");

        System.out.println("VIDEOS ------------------------------------------------------");
        System.out.println(videos[0].toString());
        System.out.println(videos[1].toString());
        System.out.println(videos[2].toString());
        System.out.println();

        gafanhotos[0] = new Gafanhoto("Luiz", 21, "M", "Sinclair");
        gafanhotos[1] = new Gafanhoto("Carlos", 25, "M", "Carlinhos");
        gafanhotos[2] = new Gafanhoto("Fernanda", 20, "F", "Feer");

        System.out.println("USUARIOS ----------------------------------------------------");
        System.out.println(gafanhotos[0].toString());
        System.out.println(gafanhotos[1].toString());
        System.out.println(gafanhotos[2].toString());
        System.out.println();

        Visualizacao[] v = new Visualizacao[3];
        v[0] = new Visualizacao(gafanhotos[0], videos[0]);
        v[1] = new Visualizacao(gafanhotos[1], videos[0]);
        v[2] = new Visualizacao(gafanhotos[2], videos[0]);

        System.out.println("VISUALIZACAO -------------------------------------------------");
        v[0].avaliar(10);
        v[1].avaliar(10);
        v[2].avaliar(10);
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
    }
}