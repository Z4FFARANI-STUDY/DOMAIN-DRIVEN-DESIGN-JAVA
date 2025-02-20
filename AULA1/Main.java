import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, endereco;
        int idade;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        System.out.println("Digite o seu endereço (em underline):");
        endereco = sc.next();

        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Endereço: " + endereco);

        sc.close();
    }

}