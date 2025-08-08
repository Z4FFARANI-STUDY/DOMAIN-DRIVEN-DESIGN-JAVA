package AULA12;
public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(30.0);
        i1.imprimeValor();

        Normal i2 = new Normal(30.0);
        i2.imprimeTipo();

        VIP i3 = new VIP(30.0, 50.0);
        System.out.println("\nIngresso VIP | R$" + i3.getValorVIP());

        CamaroteInferior camaroteInferior = new CamaroteInferior(30.0, 50.0, "Setor XPTO");
        camaroteInferior.imprimeLocalizacao();
        System.out.println("\nCamarote inferior | R$" + camaroteInferior.getValorVIP());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(30.0, 70.0);
        System.out.println("\nCamarote superior | R$" + camaroteSuperior.getValorIngresso());
    }
}
