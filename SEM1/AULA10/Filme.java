class Filme {
    protected String titulo;
    protected String diretor;
    protected double avaliacao;

    public Filme(String titulo, String diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.avaliacao = 0.0;
    }

    protected void exibirInfo() {
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Avaliacao: " + (avaliacao == 0.0 ? "Ainda nao foi avaliado" : avaliacao + "/5" + "⭐"));
    }

    public void avaliarFilme(double nota) {
        if (nota >= 0 && nota <= 5) {
            avaliacao = nota;
            System.out.println("O filme " + titulo + " recebeu nota: " + nota + " estrelas! ⭐");
        } else {
            System.out.println("Nota precisa ser entre 0 e 5!");
        }
    }
}