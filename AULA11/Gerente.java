public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibeDados() {
        System.out.println("Cargo: Gerente");
        super.exibeDados();
    }
}