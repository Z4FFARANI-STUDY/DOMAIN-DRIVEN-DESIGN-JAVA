public class Dromedario extends Animal {
    public Dromedario() {
        this.nome = "Romário";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("O dromedário " + this.nome + " tem " + this.numeroPatas + " patas e faz brããã!");
    }
}