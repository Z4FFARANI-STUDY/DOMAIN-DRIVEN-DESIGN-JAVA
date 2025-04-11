public class Administrativo extends Assistente {
    private String turno;
    private double adicionalnoturno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalnoturno){
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalnoturno = adicionalnoturno;
    }

    @Override
    public void exibeDados(){
        System.out.println("Categoria : Administrativo");
        super.exibeDados();
        System.out.println("Turno: " + turno);
        if (turno.equalsIgnoreCase("noite")){
            System.out.println("Adicional noturno: " + adicionalnoturno);
            System.out.println("Salario Total: R$" + (salario + adicionalnoturno));
        } else {
            System.out.println("Salario Total R$: " + salario);
        }
    }
}