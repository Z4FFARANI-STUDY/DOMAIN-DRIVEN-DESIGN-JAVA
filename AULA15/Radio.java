public class Radio extends Eletrodomestico {
    private float frequencia;

    public Radio(boolean ligado, int voltagem, float frequencia) {
        super(ligado, voltagem);
        this.frequencia = frequencia;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public void ligar() {
        super.setLigado(true);
        setVoltagem(110);
        setFrequencia(89);        
    }

    @Override
    public void desligar() {
        super.setLigado(false);
        setVoltagem(0);
        setFrequencia(0);
    }
}
