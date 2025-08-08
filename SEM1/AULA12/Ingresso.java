package AULA12;
public class Ingresso {
    protected  double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Ingresso | R$" + valor);
    }
}
