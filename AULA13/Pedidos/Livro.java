public class Livro extends Produto {
    public Livro(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.95;
    }
}
