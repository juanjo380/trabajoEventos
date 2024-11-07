import CategoriasMilitares.Capitan;
import CategoriasMilitares.Coronel;
import CategoriasMilitares.Soldado;
import CategoriasMilitares.Teniente;
import MisionesMilitares.OperacionesMilitares;

public class App {
    public static void main(String[] args) {
        
        Coronel coronel1 = new Coronel("Realizar un ataque aereo y reforzar la armada terrestre para la batalla. ", 4);
        Capitan capitan1 = new Capitan(3, 4);
        Teniente teniente1 = new Teniente(2, "Clock tower");
        Soldado soldado1 = new Soldado(1, "Josue Vente Macias", "1235");
        Soldado soldado2 = new Soldado(1, "Jhoan Andres Gonzalez", "6789");
        Soldado soldado3 = new Soldado(1, "Manuel Turizo", "1357");
        Soldado soldado4 = new Soldado(1, "Miguel Angel Marin", "0987");

        OperacionesMilitares operacionCoronel1 = (OperacionesMilitares) coronel1;
        operacionCoronel1.asignarMision("Asegurar que la mision salga correctamente y que no hayan soldados caidos. ");
        operacionCoronel1.reportarEstado();

        OperacionesMilitares operaciones1 = (OperacionesMilitares) teniente1;
        operaciones1.asignarMision("Defender la torre. ");
        operaciones1.reportarEstado();

        OperacionesMilitares operacionCapitan1 = (OperacionesMilitares) capitan1;
        operacionCapitan1.asignarMision("Comandar los soldados bajo su mando para la batalla. ");
        operacionCapitan1.reportarEstado();

        soldado1.mostrarInformacion();
        soldado2.mostrarInformacion();
        soldado3.mostrarInformacion();
        soldado4.mostrarInformacion();
        
    }
}
