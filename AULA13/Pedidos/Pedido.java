public class Pedido {
    public static void main(String[] args) {
        Produto p1 = new Eletronico("Notebook", 3000);
        Produto p2 = new Roupa("Camiseta", 100);
        Produto p3 = new Livro("Java Básico", 80);

        p1.exibirPreco();
        p2.exibirPreco();
        p3.exibirPreco();
    }
}
