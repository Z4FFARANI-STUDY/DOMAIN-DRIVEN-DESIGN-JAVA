public class TestaConta {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(1000.00);
        cp.imprimeExtrato();
    }
}