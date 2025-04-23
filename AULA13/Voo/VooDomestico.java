public class VooDomestico extends Voo {
    private double taxaDomestico = 0.50;

    public VooDomestico(String origem, String destino, double distancia, String data) {
        super(origem, destino, distancia, data);
    };

    @Override
    public double calcularPreco() {
        return (distancia * taxaDomestico);
    }
}
