public class PatoMandarim extends Animal {
    public PatoMandarim() {
        this.nome = "Donald";
        this.numeroPatas = 2;
    }

    @Override
    public void som() {
        System.out.println("O pato " + this.nome + " tem " + this.numeroPatas + " patas e faz quack!");
    }
}