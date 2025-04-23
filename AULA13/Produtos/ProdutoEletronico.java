public class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, double precoUnitario) {
        super(nome, precoUnitario);
    }

    @Override
    public double calcularTotal(double quantidade) {
        double total = precoUnitario * quantidade;
        return quantidade >= 10 ? total * 0.95 : total;
    }
}
