public class Vingadores {
    String nome;
    int idade;
    String armadura;
    double peso;
    double altura;

    void salvar() {
        System.out.println("O vingador está salvando as pessoas de NY");
    }

    void lutar() {
        System.out.println("O vingador " + nome + " está lutando");
    }

    void correr() {
        System.out.println("O vingador está correndo");
    }

    @Override
    public String toString() {
        return nome;
    }
}