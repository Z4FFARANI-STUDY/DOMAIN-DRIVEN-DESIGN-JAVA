public class Hiena extends Animal {
    public Hiena() {
        this.nome = "Banzai";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("A hiena " + this.nome + " tem " + this.numeroPatas + " patas e faz ih ih!");
    }
}