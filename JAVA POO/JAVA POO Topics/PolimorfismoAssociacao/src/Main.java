import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        Animal cat = new Gato();
        Animal a = new Animal() {
            @Override
            public void emitirSom() {
                System.out.println("Som generico de animal.");
            }
        };

        a.emitirSom();
        dog.emitirSom();
        cat.emitirSom();
    }
}