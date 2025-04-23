public abstract class Produto {
    protected String nome;
    protected double precoUnitario;

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public abstract double calcularTotal(double quantidade);
}
