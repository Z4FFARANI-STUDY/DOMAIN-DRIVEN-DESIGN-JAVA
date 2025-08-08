public class FuncionarioComum extends Funcionario {
    public FuncionarioComum(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularPagamento() {
        return salarioFixo;
    }
}
