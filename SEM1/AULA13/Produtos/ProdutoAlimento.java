public class ProdutoAlimento extends Produto {
    public ProdutoAlimento(String nome, double precoUnitario) {
        super(nome, precoUnitario);
    }

    @Override
    public double calcularTotal(double quantidadeEmKg) {
        return precoUnitario * quantidadeEmKg;
    }
}
