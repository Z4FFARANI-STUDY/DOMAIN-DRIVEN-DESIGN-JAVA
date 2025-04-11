public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibeDados(){
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Salario do funcionario: " + salario);
    }
}