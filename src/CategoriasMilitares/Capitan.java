package CategoriasMilitares;
import MisionesMilitares.OperacionesMilitares;
import Rango.Rango;

public class Capitan extends Rango implements OperacionesMilitares{
    private int cantidadSoldadosBajoSuMando;
    

    public Capitan(int nivel, int cantidadSoldadosBajoSuMando) {
        super(4);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    @Override
    public void asignarMision(String mision) {
        // TODO Auto-generated method stub
        System.out.println("Mision asignada al capitan: " + mision);
    }

    @Override
    public void reportarEstado() {
        // TODO Auto-generated method stub
        System.out.println("Estado del Capitán: Liderando " + cantidadSoldadosBajoSuMando);
    }

    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        System.out.println("Capitán coordinando misiones.");
    }
    
    
}
