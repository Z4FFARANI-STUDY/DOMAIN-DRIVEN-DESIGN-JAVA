class Funcionario {
    private String turno;
    private int salario;

    public Funcionario(String turno, int salario) {
        this.turno = turno;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Turno: " + turno + " | Salario: " + salario;
    }
}

class Tecnico extends Funcionario {
    public Tecnico(String turno, int salario) {
        super(turno, salario += 20);
    }

    @Override
    public String toString() {
        System.out.println("Tecnico:");
        return super.toString();
    }
}

class Administrativo extends Funcionario {
    public Administrativo(String turno, int salario) {
        super(turno, turno == "noite" ? salario + 100 : salario + 50);
    }

    @Override
    public String toString() {
        System.out.println("Administrativo:");
        return super.toString();
    }
}

public class Empresa {
    public static void main(String... args) {
        Tecnico tecnico = new Tecnico("dia", 1000);
        Administrativo administrativoDia = new Administrativo("dia", 1000);
        Administrativo administrativoNoite = new Administrativo("noite", 1000);

        System.out.println(tecnico);
        System.out.println(administrativoDia);
        System.out.println(administrativoNoite);
    }
}