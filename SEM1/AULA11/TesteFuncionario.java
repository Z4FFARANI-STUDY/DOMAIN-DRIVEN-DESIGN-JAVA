public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gustavo", 50000);
        System.out.println("Dados do Gerente");
        gerente.exibeDados();

        Assistente assistente = new Assistente("Rosangela", 3000, 123);
        System.out.println("\nDados do Assistente");
        assistente.exibeDados();

        Tecnico tecnico = new Tecnico("Carla", 3500, 453, 500);
        System.out.println("\nDados do Assistente Tecnico");
        tecnico.exibeDados();

        Administrativo administrativo = new Administrativo("Daniel", 3200, 789, "dia", 0.0);
        System.out.println("\nDados do Assistente ADM");
        administrativo.exibeDados();
    }
}