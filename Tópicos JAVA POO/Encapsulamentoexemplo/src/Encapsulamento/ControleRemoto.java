package Encapsulamento;

public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodos especiais

    public ControleRemoto()
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getvolume()
    {
        return this.volume;
    }
    
    private void setvolume(int v)
    {
        this.volume = v;
    }
    
    private boolean getligado()
    {
        return this.ligado;
    }
    
    private void setligado(boolean l)
    {
        this.ligado = l;
    }
    
    private boolean gettocando()
    {
        return this.tocando;
    }
    private void settocando(boolean t)
    {
        this.tocando = t;
    }
    
    @Override
    public void ligar() {
        this.setligado(true);        
    }

    @Override
    public void desligar() {
        this.setligado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + this.getligado());
        System.out.println("Tocando: " + this.gettocando());
        System.out.println("Volume: " + this.getvolume());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getligado())
        {
            this.setvolume(this.getvolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getligado())
        {
            this.setvolume(getvolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getligado() && this.getvolume() > 0)
        {
            this.setvolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getligado() && this.getvolume() == 0)
        {
            this.setvolume(5);
        }
    }

    @Override
    public void play() {
        if(this.getligado() && !(this.gettocando()))
        {
            this.settocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getligado() && this.gettocando())
        {
            this.settocando(false);
        }        
    }

}
