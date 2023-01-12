import java.util.ArrayList;
import java.util.List;

public class Feriados {
    private List<String> feriados = new ArrayList<>();

    public Feriados() {
        feriados.add("01/01/2023 - Confraternização mundial");
        feriados.add("21/02/2023 - Carnaval");
        feriados.add("17/04/2023 - Páscoa");
        feriados.add("21/04/2023 - Tiradentes");
        feriados.add("01/05/2023 - Dia do trabalho");
        feriados.add("08/06/2023 - Corpus Christi");
        feriados.add("07/09/2023 - Independência do Brasil");
        feriados.add("12/10/2023 - Nossa Senhora Aparecida");
        feriados.add("02/11/2023 - Finados");
        feriados.add("15/11/2023 - Proclamação da República");
        feriados.add("25/12/2023 - Natal");
    }

    public String getFeriado(String data) {
        String feriado = "Não existe um feriado nessa data";
        for (String date : feriados) {
            if (date.contains(data)) {
                feriado = date.split(" - ")[1];
                return feriado;
            }
        }
        return feriado;
    }

    public List<String> getTodosFeriados() {
        return this.feriados;
    }
}
