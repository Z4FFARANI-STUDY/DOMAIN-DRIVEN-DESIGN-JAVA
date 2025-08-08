public abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();

    public void exibirPreco() {
        System.out.println(nome + ": R$ " + calcularPrecoFinal());
    }
}
