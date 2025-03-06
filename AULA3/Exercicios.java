import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Exercicios {
    public static void ordemCrescente(int v1, int v2, int v3) {
        List<Integer> lista = Arrays.asList(v1, v2, v3);
        Collections.sort(lista);
        System.out.println(lista + "\n");
    }

    public static void pesoIdeal(String sexo, double altura) {
        if (sexo.toLowerCase().equals("masculino")) {
            System.out.printf("Seu peso ideal: %.2f\n", ((72.7 * altura) - 58));
        } else {
            System.out.printf("Seu peso ideal: %.2f\n", ((62.1 * altura) - 44.7));
        }
    }

    public static void calcularPoligono(int lados) {
        String poligono = (lados > 3) ? "NÃO É UM POLÍGONO" : (lados == 3) ? "TRIÂNGULO" : (lados == 4) ? "QUADRADO" : "POLÍGONO NÃO IDENTIFICADO";
        double altura = 5.0;
        double area = (lados > 3) ? 0 : (lados == 3) ? (Math.sqrt(3) / 4) * Math.pow(altura, 2) : (lados == 4) ? Math.pow(altura, 2) : 0;
        System.out.printf("Polígono: %s | Área (cm): %.2f\n", poligono, area);
    }

    public static void ladosTriangulo(double l1, double l2, double l3) {
        String tipo = (l1 == l2 && l2 == l3) ? "Equilátero" : (l1 == l2 || l2 == l3 || l1 == l3) ? "Isósceles" : "Escaleno";
        System.out.println("Tipo do triângulo: " + tipo);
    }

    public static void anguloTriangulo(int grau) {
        String tipo = (grau == 90) ? "Retângulo" : (grau < 90) ? "Acutângulo" : "Obtusângulo";
        System.out.println("Tipo do triângulo: " + tipo);
    }

    public static void main(String[] args) {
        // ordemCrescente(2, 1, 3);
        // pesoIdeal("masculino", 1.70);
        // calcularPoligono(3);
        // ladosTriangulo(5, 5, 0);
        // anguloTriangulo(90);
    }
}