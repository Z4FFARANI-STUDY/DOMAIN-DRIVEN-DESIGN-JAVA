public class TestePessoa {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Roberto", "123.456.789-10");
        a1.rm = "123";

        Funcionario f1 = new Funcionario("Angela", "109.876.543-21");
        f1.cargo = "Gerente de produção";
        f1.salario = 999.99;

        Professor p1 = new Professor("Gustavo", "111.222.333-44");
        p1.disciplina = "Domain Driven Design";
        p1.salarioProf = 19.000;
        
    }
}
