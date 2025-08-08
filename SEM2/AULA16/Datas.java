public class Datas {
    private int dia;
    private int mes;

    public Datas(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public void transforma() throws ErroCalendario {
        if (mes < 1 || mes > 12) {
            throw new ErroCalendario("Mês inválido.");
        }

        if (dia < 1 || dia > 31) {
            throw new ErroCalendario("Dia inválido.");
        }

        if (mes == 2 && dia > 29) {
            throw new ErroCalendario("Fevereiro com mais de 29 dias.");
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            throw new ErroCalendario("Dia e mês incompatíveis.");
        }

        String nomeMes = switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Inválido";
        };

        System.out.println(dia + "/" + nomeMes);
    }
}