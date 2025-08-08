public class Main {
    public static void main(String[] args) {
        try {
            Datas datas = new Datas(31, 4);
            datas.transforma();
        } catch (ErroCalendario e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}