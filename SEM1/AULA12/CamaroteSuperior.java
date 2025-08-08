package AULA12;
public class CamaroteSuperior extends VIP {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double getValorIngresso() {
        return getValorVIP();
    }
}
