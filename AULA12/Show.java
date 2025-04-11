package AULA12;
class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void tipoIngresso() {
        System.out.println("Ingresso Normal");
    }
}

class VIP extends Ingresso {
    protected double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double valorVIP() {
        return valor + adicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso VIP: R$ " + valorVIP());
    }
}

class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do Camarote Inferior: " + localizacao);
    }
}

class CamaroteSuperior extends VIP {
    private double adicionalSuperior;

    public CamaroteSuperior(double valor, double adicional, double adicionalSuperior) {
        super(valor, adicional);
        this.adicionalSuperior = adicionalSuperior;
    }

    public double valorCamaroteSuperior() {
        return valor + adicional + adicionalSuperior;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do Camarote Superior: R$ " + valorCamaroteSuperior());
    }
}

public class Show {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(100);
        ingresso.imprimeValor();

        Normal normal = new Normal(80);
        normal.tipoIngresso();
        normal.imprimeValor();

        VIP vip = new VIP(100, 50);
        vip.imprimeValor();

        CamaroteInferior inferior = new CamaroteInferior(100, 60, "Setor A");
        inferior.imprimeValor();
        inferior.imprimeLocalizacao();

        CamaroteSuperior superior = new CamaroteSuperior(100, 60, 40);
        superior.imprimeValor();
    }
}