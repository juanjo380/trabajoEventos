public class App {
    public static void main(String[] args) throws Exception {
        Soldado soldado1 = new Soldado(1,"josue","1235");
        Teniente teniente1 = new Teniente(2,"Clock tower");

        OperacionesMilitares operaciones1 = (OperacionesMilitares) teniente1;
        operaciones1.asignarMision("Defender la torre");
        operaciones1.reportarEstado();

    }
}
