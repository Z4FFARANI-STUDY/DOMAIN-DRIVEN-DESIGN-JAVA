package AULA6;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vingador> listaVingadores = new ArrayList<>();
        ArrayList<Vilao> listaViloes = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Cadastro de vingador [1] | Cadastro de vilao [2] | Exibir informacoes [3] | Lutar [4] | Encerrar [5]:");
                int opcao = sc.nextInt();
                
                if (opcao == 1) {
                    System.out.println("Nome do vingador:");
                    String nomeVingador = sc.next();
        
                    System.out.println("Idade do vingador:");
                    int idadeVingador = sc.nextInt();
        
                    System.out.println("Peso do vingador:");
                    double pesoVingador = sc.nextDouble();
        
                    System.out.println("País do vingador:");
                    String paisVingador = sc.next();
        
                    System.out.println("Tem poderes?");
                    boolean temPoderes = sc.nextBoolean();
        
                    Vingador vingador = new Vingador(nomeVingador, idadeVingador, pesoVingador, paisVingador, temPoderes);
                    listaVingadores.add(vingador);
    
                    System.out.println("Vingador " + vingador.nome + " adicionado com sucesso!");
                    
                } else if (opcao == 2) {
                    System.out.println("Nome do vilao:");
                    String nomeVilao = sc.next();
        
                    System.out.println("Forca do vilao:");
                    double forcaVilao = sc.nextInt();
        
                    System.out.println("Mundo do vilao:");
                    String mundoVilao = sc.next();
        
                    System.out.println("Altura do vilao:");
                    double alturaVilao = sc.nextDouble();
        
                    Vilao vilao = new Vilao(nomeVilao, forcaVilao, mundoVilao, alturaVilao);
    
                    listaViloes.add(vilao);
    
                    System.out.println("Vilao " + vilao.nome + " adicionado com sucesso!");
                } else if (opcao == 3) {
                    System.out.println("Lista de vingadores:");
                    listaVingadores.stream().forEach(n -> n.exibirInformacoes());
    
                    System.out.println("\nLista de viloes:");
                    listaViloes.stream().forEach(n -> n.exibirInformacoes());
                } else if (opcao == 4) {
                    listaViloes.stream().forEach(n -> n.atacar());
                    listaVingadores.stream().forEach(n -> n.darPoderes(true));
                    listaViloes.stream().forEach(n -> n.defender());
                    listaVingadores.stream().forEach(n -> n.atacar());
                    listaViloes.stream().forEach(n -> n.derrotar());
                    System.out.println();
                } else if (opcao == 5) {
                    break;
                } else {
            }
                System.out.println("Opcao invalida. Tente novamente.");
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        sc.close();
    }
}