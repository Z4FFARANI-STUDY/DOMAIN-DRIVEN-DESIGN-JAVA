public class FilmeTerror extends Filme {
    private int anoLancamento;
    private String tipoCategoria;

    public FilmeTerror(String titulo, String diretor, int anoLancamento, String tipoCategoria) {
        super(titulo, diretor);
        this.anoLancamento = anoLancamento;
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    protected void exibirInfo() {
        super.exibirInfo();
        System.out.println("O filme: " + titulo + " foi lançado em: " + anoLancamento + " e é do tipo: " + tipoCategoria + "👾");
    }

    public void frases() {
        System.out.println("Frase icônica do filme: " + titulo + ": Here's Jhonny!");
    }
}
