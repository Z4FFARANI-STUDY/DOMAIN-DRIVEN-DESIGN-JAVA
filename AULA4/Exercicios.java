import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicios {
    public static void escreverPare() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite uma palavra e depois enter:");
            String palavra = sc.nextLine();

            if (palavra.equalsIgnoreCase("PARE")) {
                break;
            }
        }

        sc.close();
    }

    public static void intervaloNumeros(int comeco, int fim) {
        for (int i = comeco; i <= fim; i++) System.out.println(i);
    }

    public static void zeroMilPares() {
        for (int i = 0; i <= 1000; i++) if (i % 2 == 0) System.out.println(i);
    }

    public static void zeroMilDivididoPor5() {
        for (int i = 0; i <= 1000; i++) if (i % 5 == 0) System.out.println(i);
    }

    public static void primeiroUltimo() {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        System.out.println("Digite números (0 encerra):");
    
        while (true) {
            int numero = sc.nextInt();
            if (numero == 0) break;
            lista.add(numero);
        }
    
        if (lista.isEmpty()) {
            System.out.println("Nenhum número digitado antes do 0.");
        } else {
            System.out.println("Primeiro número digitado: " + lista.get(0));
            System.out.println("Último número digitado antes do 0: " + lista.get(lista.size() - 1));
        }
    
        sc.close();
    }
    
    public static void zeroMilEm6() {
        for (int i = 0; i <= 1000; i += 6) System.out.println(i); 
    }

    public static void intervaloMultiplicado(int comeco, int fim) {
        for (int i = comeco; i <= fim; i++) System.out.println((i + 1) * i);
    }

    public static void tabuada(int numero, String operacao) {
        switch (operacao) {
            case "+":
                for (int i = 1; i <= 10; i++) System.out.printf("%d + %d = %d \n", numero, i, (numero + i));
                break;
            case "-":
                for (int i = 1; i <= 10; i++) System.out.printf("%d - %d = %d \n", numero, i, (numero - i));
                break;
            case "*":
                for (int i = 1; i <= 10; i++) System.out.printf("%d * %d = %d \n", numero, i, (numero * i));
                break;
            case "/":
                for (int i = 1; i <= 10; i++) if (i != 0) System.out.printf("%d / %d = %.2f \n", numero, i, (double)numero / i);
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    }    

    public static void main(String[] args) {
        // escreverPare();
        // intervaloNumeros(5, 10);
        // zeroMilPares();
        // zeroMilDivididoPor5();
        // primeiroUltimo();
        // zeroMilEm6();
        // intervaloMultiplicado(1, 3);
        // tabuada(10, "+");
    }
}
