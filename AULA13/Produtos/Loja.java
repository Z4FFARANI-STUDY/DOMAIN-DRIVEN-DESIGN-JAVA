public class Loja {
    public static void main(String[] args) {
        Produto p1 = new ProdutoEletronico("TV", 2000);
        Produto p2 = new ProdutoRoupa("Calça Jeans", 150);
        Produto p3 = new ProdutoAlimento("Arroz", 5);

        System.out.println("Total TV (12 unid): R$ " + p1.calcularTotal(12));
        System.out.println("Total Calça (3 unid): R$ " + p2.calcularTotal(3));
        System.out.println("Total Arroz (10 kg): R$ " + p3.calcularTotal(10));
    }
}
