public class TesteVoo {
    public static void main(String[] args) {
        Voo voo1 = new VooDomestico("São Paulo", "Vitória", 748, "23/04/2025");
        Voo voo2 = new VooDomestico("Campinas", "Belo Horizonte", 463, "01/05/2025");
        Voo voo3 = new VooInternacional("São Paulo", "Londres", 9500, "17/05/2025");
        Voo voo4 = new VooInternacional("São Paulo", "Nova Iorque", 7700, "17/07/2025");

        voo1.exibirInformacoes();
        System.out.println();
        voo2.exibirInformacoes();
        System.out.println();
        voo3.exibirInformacoes();
        System.out.println();
        voo4.exibirInformacoes();
        System.out.println();
    }
}
