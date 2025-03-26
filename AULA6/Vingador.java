package AULA6;
class Vingador {
    public String nome;
    public int idade;
    public double peso;
    public String pais;
    public boolean temPoderes;

    public Vingador(String nome, int idade, double peso, String pais, boolean temPoderes) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.pais = pais;
        this.temPoderes = temPoderes;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Peso: " + peso + " | País: " + pais + " | Tem poderes: " + temPoderes);
    }

    public void darPoderes(boolean temPoderes) {
        this.temPoderes = temPoderes;
        System.out.println("O vingador " + nome + " agora tem poderes!");
    }

    public void atacar() {
        System.out.println("O vingador " + nome + " está atacando!");
    }
}