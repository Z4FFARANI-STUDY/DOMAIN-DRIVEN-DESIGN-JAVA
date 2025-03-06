import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string:");

        String input = sc.nextLine();
        int valorInt = Integer.parseInt(input);
        double valorDouble = Double.parseDouble(input);
        boolean valorBoolean = Boolean.parseBoolean(input);

        System.out.println("Conversão (Integer): " + valorInt);
        System.out.println("Conversão (Integer): " + valorDouble);
        System.out.println("Conversão (Integer): " + valorBoolean);

        sc.close();
    }
}
