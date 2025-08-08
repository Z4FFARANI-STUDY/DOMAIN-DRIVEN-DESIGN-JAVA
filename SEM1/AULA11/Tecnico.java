public class Tecnico extends Assistente {
    private double bonusSalarial;
    public Tecnico(String nome, double salario, int matricula, double bonusSalarial){
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void exibeDados() {
        System.out.println("Categoria: Tecnico");
        super.exibeDados();
        System.out.println("Bonus Salarial: " + bonusSalarial);
        System.out.println("Salario com bonus: " + (salario + bonusSalarial));
    }
}