public class TesteVingadores {
    public static void main(String[] args) {
        Vingadores homemDeFerro = new Vingadores();
        homemDeFerro.nome = "Homem de Ferro (Tony Stark)";
        homemDeFerro.idade = 50;
        homemDeFerro.armadura = "Mark II";
        homemDeFerro.peso = 150.0;
        homemDeFerro.altura = 1.80;
        
        Vingadores hulk = new Vingadores();
        hulk.armadura = "Shorts roxo";
        hulk.nome = "Hulk (Bruce Banner)";
        
        System.out.println("Nome do vingador: " + homemDeFerro.nome);
        System.out.println("Idade: " + homemDeFerro.idade);
        homemDeFerro.lutar();
        
        System.out.println("\nArmadura do vingador: " + hulk.armadura);
        System.out.println("É a identidade secreta do: " + hulk.nome);
        hulk.salvar();
    }
}