public class FilmeComedia extends Filme {
    private String tipoHumor;
    private boolean engracado;

    public FilmeComedia(String titulo, String diretor, String tipoHumor, boolean engracado) {
        super(titulo, diretor);
        this.tipoHumor = tipoHumor;
        this.engracado = engracado;
    }

    @Override
    protected void exibirInfo() {
        super.exibirInfo();
        System.out.println("O filme: " + titulo + " é engraçado: " + engracado);
    }

    public void contarPiada() {
        System.out.println("Piada do filme: " + titulo + " do tipo de humor" + tipoHumor + ": Por que o tomate foi ao banco? Para tirar o extrato! 🍅");
    }
}
