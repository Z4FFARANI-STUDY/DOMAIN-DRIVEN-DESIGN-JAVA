public class VooInternacional extends Voo {
    private double precoInternacional = 1.50;
    private double taxaConversao = 1.20;

    public VooInternacional(String origem, String destino, double distancia, String data) {
        super(origem, destino, distancia, data);
    }

    @Override
    public double calcularPreco() {
        double preco = distancia * precoInternacional;
        if (preco > 1800) {
            preco *= taxaConversao;
        }
        return preco;
    }
}
