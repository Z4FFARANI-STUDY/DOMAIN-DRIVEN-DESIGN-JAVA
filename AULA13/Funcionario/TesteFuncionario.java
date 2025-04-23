public class TesteFuncionario {
    public static void main(String[] args) {
        FuncionarioComum func1 = new FuncionarioComum(3500.00);
        Gerente g1 = new Gerente(7000.00, 2000.00);
        Diretor d1 = new Diretor(15.000, 3000.00);

        System.out.println("Pagamento do funcionario comum: R$" + func1.calcularPagamento());
        System.out.println("Pagamento do gerente: R$" + g1.calcularPagamento());
        System.out.println("Pagamento do diretor: R$" + d1.calcularPagamento());
    }
}
