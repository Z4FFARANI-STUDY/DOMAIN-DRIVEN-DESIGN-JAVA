public class Funcionario {
    protected double salarioFixo;

    public Funcionario(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularPagamento() {
        return salarioFixo;
    }
}
