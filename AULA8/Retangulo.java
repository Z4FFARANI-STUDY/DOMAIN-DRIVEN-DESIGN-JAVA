import java.util.Scanner;

public class Retangulo {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void perimetro() {
        System.out.println("Perimetro: " + 2 * (largura + comprimento));
    }

    public void area() {
        System.out.println("Area: " + largura * comprimento);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = null;

        while (true) {
            System.out.println("Perimetro [1] | Area [2] | Modificar [3] | Encerrar [4]:");
            int opcao = sc.nextInt();

            if (opcao == 4) {
                System.out.println("Encerrando...");
                break;
            }

            if (opcao == 1 || opcao == 2 || opcao == 3) {
                if (retangulo == null || opcao == 3) {
                    System.out.println("Largura do retangulo:");
                    double largura = sc.nextDouble();

                    System.out.println("Comprimento do retangulo:");
                    double comprimento = sc.nextDouble();

                    if (largura == comprimento) {
                        System.out.println("A largura não pode ser igual ao comprimento.");
                        continue;
                    }

                    if (retangulo == null) {
                        retangulo = new Retangulo(largura, comprimento);
                    } else {
                        retangulo.setLargura(largura);
                        retangulo.setComprimento(comprimento);
                        System.out.println("Valores modificados.");
                    }
                }

                if (opcao == 1) {
                    System.out.println("Largura: " + retangulo.getLargura());
                    System.out.println("Comprimento: " + retangulo.getComprimento());
                    retangulo.perimetro();
                } else if (opcao == 2) {
                    System.out.println("Largura: " + retangulo.getLargura());
                    System.out.println("Comprimento: " + retangulo.getComprimento());
                    retangulo.area();
                }
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}