public class Vilao extends Vingadores {
    public Vilao(String nome, int idade, boolean armadura, double altura) {
        super(nome, idade, armadura, altura); // executando e reaproveitando o construtor da classe mãe 
    }

    // atributos exclusivos da classe
    public String poder;
    public int vilania;
}
