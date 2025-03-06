import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        int idade;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        System.out.println("Digite o seu endereço (em underline):");
        String endereco = sc.next();

        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Endereço: " + endereco);

        sc.close();
    }

}