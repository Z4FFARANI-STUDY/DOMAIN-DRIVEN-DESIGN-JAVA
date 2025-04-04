public class TestaFilme {
    public static void main(String[] args) {
        FilmeTerror filme1 = new FilmeTerror("The Shining ⭐", "Stanley Kubrick", 1980, "Bem assustador");
        FilmeComedia filme2 = new FilmeComedia("Dumb and Dumber 🚐", "Peter Farrely", "Cringe", false);

        System.out.println("🎬 Filmes ANTES da avaliação");
        filme1.exibirInfo();
        filme2.exibirInfo();

        System.out.println("\nAvaliando os Filmes ⭐:");
        filme1.avaliarFilme(4.5);
        filme2.avaliarFilme(3.5);

        System.out.println("Após avaliacaoo ⭐");
        filme1.exibirInfo();
        filme1.frases();

        System.out.println("===============================");

        filme2.exibirInfo();
        filme2.contarPiada();
    }
}
