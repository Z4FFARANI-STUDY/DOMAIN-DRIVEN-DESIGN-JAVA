public class Assistente extends Funcionario {
    protected  int matricula;
    public Assistente(String nome, double salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void exibeDados(){
        System.out.println("Cargo: Assistente");
        super.exibeDados();
        System.out.println("Numero da matricula: " + matricula);
    }
}