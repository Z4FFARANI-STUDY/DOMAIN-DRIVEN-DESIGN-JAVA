public class Casting {
    public static void main(String[] args) {
        // widening casting (menor para maior, sem perda de dados)
        byte valorByte = 18;
        double valorDouble = valorByte;
        System.out.println("Valor (Byte): " + valorByte + " | Valor (Double): " + valorDouble);

        // narrowing casting (pode resultar em perda de dados)
        double mediaDouble = 9.8;
        int mediaInt = (int) mediaDouble;
        System.out.println("Média (Double): " + mediaDouble + " | Média (Integer): " + mediaInt);
    }
}
