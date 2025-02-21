public class Exercicios {
    public static void descobrirDias(int idade, int meses, int dias) {
        int totalDias = (idade * 12 * 30) + (meses * 30) + dias;
        
        System.out.println("Seus dias de idade: " + totalDias);
    }

    public static void mediaAritmetica(double n1, double n2, double n3, double n4, double n5, double n6) {
        double media1 = n1 + n2 + n3 / 3;
        double media2 = n4 + n5 + n6 / 3;
        double mediaFinal = media1 + media2 / 2;

        System.out.println("Média 1: " +  media1 + " | Média 2: " + media2 + " | Média final: " + mediaFinal);
    }

    public static void reajusteSaldo(double salario) {
        System.out.println("Reajusta de 1%: " + (salario - (salario * 0.1)));
    }
    
    public static void posicaoNumero(int numero) {
        System.out.println("Anterior: " + (numero - 1) + " | Sucessor: " + (numero + 1));
    }

    public static void quantosSalariosMin(double salario) {
        double salarioMin = 1500;

        if (salario > salarioMin) {
            System.out.println("Você recebe menos que um salário mínimo.");
        } else {
            int quantosSalariosMin = (int) salario / (int) salarioMin;
            System.out.println("Quantidade de salários mínimos: " + quantosSalariosMin);
        }
    }

    public static void temperaturas(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = (celsius * 1.8) + 32 + 459.67;

        System.out.println("Kelvin (K): " + kelvin + " | Réaumur (Re): " + reaumur + " | Rankine (Ra): " + rankine + " | Fahrenheit (F): " + fahrenheit);
    }
    
    public static void mediaSalarial(double salario1, double salario2, double salario3) {
        System.out.println("Média salarial: " + (salario1 + salario2 + salario3) / 3);
    }
    
    public static void volumeOleo(double volume, double raio, double altura) {
        double total = 3.14159 * raio * raio * altura;
        System.out.println("Volume da lata de óleo: " + total);
    }

    public static void main(String[] args) {
        descobrirDias(3, 2, 15);
        mediaAritmetica(8, 9, 7, 4, 5, 6);
        reajusteSaldo(1500);
        posicaoNumero(5);
        quantosSalariosMin(4500);
        temperaturas(30);
        mediaSalarial(2500, 1600, 7000);
        volumeOleo(15, 30, 40);
    }
}