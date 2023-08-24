package MetodosEspeciais;

public class Caneta {
    public String modelo;
    private float ponta;
    private final String color;

    public Caneta(String m, float p, String c) {
        this.modelo = m;
        this.setPonta(p);
        this.color = c;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + ponta);
        System.out.println("COR: " + color);
    }
}
