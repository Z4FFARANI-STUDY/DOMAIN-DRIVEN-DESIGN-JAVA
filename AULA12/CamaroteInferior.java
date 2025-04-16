package AULA12;
public class CamaroteInferior extends VIP {
    public String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localizacao do ingresso | " + localizacao);
    }
}
