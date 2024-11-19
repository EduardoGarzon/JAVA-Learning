package VisibilidadeTeste;

public class Caneta {
    public String modelo;
    public String cor;
    protected int carga;
    protected boolean tampada;  

    public void status() {
        float ponta = 0.5f;
        System.out.println("Caneta: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (tampada) {
            System.out.println("Caneta Tampada!");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    protected void tampar() {
        this.tampada = true;
     }

    protected void destampar() {
        this.tampada = false;
    }
}
