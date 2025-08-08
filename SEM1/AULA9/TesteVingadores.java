public class TesteVingadores {
    public static void main(String[] args) {
        Herois vingador = new Herois("Homem de Ferro", 48, true, 1.75);
        
        System.out.println("\nCriando um herói:\n");
        System.out.println("Nome: " + vingador.nome);
        vingador.identificador = 123;
        System.out.println("Idade: " + vingador.idade);
        System.out.println("Possui armadura: " + vingador.armadura);
        System.out.println("Altura: " + vingador.altura);
        System.out.println("ID: " + vingador.identificador);

        Vilao thanos = new Vilao("Thanos", 1000, false, 2.50);
        thanos.vilania = 555;
        thanos.poder = "Destruir mundos";

        System.out.println("\nCriando um vilão:\n");
        System.out.println("Nome: " + thanos.nome);
        System.out.println("Idade: " + thanos.idade);
        System.out.println("Possui armadura: " + thanos.armadura);
        System.out.println("Altura: " + thanos.altura);
        System.out.println("Vilania: " + thanos.vilania);
    }
}
