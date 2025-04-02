class Classe {
    private String nome;
    private int idade;
    private double altura;

    public Classe(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}

public class Pessoa {
    public static void main(String[] args) {
        Classe pessoa = new Classe("Rodolfo", 56, 1.85);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
}