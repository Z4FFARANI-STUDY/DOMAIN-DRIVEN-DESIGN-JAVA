package AULA6;
public class Vilao {
    public String nome;
    public double forca;
    public String mundo;
    public double altura;

    public Vilao(String nome, double forca, String mundo, double altura) {
        this.nome = nome;
        this.forca = forca;
        this.mundo = mundo;
        this.altura = altura;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Forca: " + forca + " | Mundo: " + mundo + " | Altura: " + altura);
    }

    public void atacar() {
        System.out.println("O vilao "+ nome + " está atacando!");
    }

    public void defender() {
        System.out.println("O vilao " + nome + " defendeu!");
    }

    public void derrotar() {
        System.out.println("O vilao " + nome + " foi derrotado!");
    } 
}
