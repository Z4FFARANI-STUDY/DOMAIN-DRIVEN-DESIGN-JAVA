public abstract class Eletrodomestico {
    private boolean ligado;
    private int voltagem;
    
    public abstract void ligar();
    public abstract void desligar();

    public Eletrodomestico(boolean ligado, int voltagem) {
        this.ligado = ligado;
        this.voltagem = voltagem;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int setVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}