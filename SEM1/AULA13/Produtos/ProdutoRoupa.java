public class ProdutoRoupa extends Produto {
    public ProdutoRoupa(String nome, double precoUnitario) {
        super(nome, precoUnitario);
    }

    @Override
    public double calcularTotal(double quantidade) {
        double total = precoUnitario * quantidade;
        return quantidade >= 5 ? total * 0.90 : total;
    }
}
