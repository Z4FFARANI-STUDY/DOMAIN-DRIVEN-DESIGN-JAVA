public class Tv extends Eletrodomestico {
    private int tamanho;
    private int canal;
    private int volume;
    
    public Tv(boolean ligado, int voltagem, int tamanho, int canal, int volume) {
        super(false, voltagem);
        this.tamanho = tamanho;
        this.canal = canal;
        this.volume = volume;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void ligar() {
        super.setLigado(true);
        setCanal(34);
        setVolume(10);
    }

    @Override
    public void desligar() {
        super.setLigado(true);
        setCanal(0);
        setVolume(0);        
    }
}
