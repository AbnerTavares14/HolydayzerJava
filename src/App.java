public class App {
    public static void main(String[] args) throws Exception {
        Feriados feriados = new Feriados();
        System.out.println(feriados.getFeriado("02/11/2023") + "\n\n");
        for (String feriado : feriados.getTodosFeriados()) {
            System.out.println(feriado);
        }
    }
}
