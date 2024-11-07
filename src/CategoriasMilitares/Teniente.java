package CategoriasMilitares;
import MisionesMilitares.OperacionesMilitares;
import Rango.Rango;

public class Teniente extends Rango implements OperacionesMilitares{
    private String unidad;

    public Teniente(int nivel, String unidad) {
        super(2);
        this.unidad = unidad;
    }

    @Override
    public void asignarMision(String mision) {
        // TODO Auto-generated method stub
        System.out.println("Mision asignada al teniente: " + mision);
    }

    @Override
    public void reportarEstado() {
        // TODO Auto-generated method stub
        System.out.println("Estado del teniente: Liderando unidad " + unidad);
    }

    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        System.out.println("Teniente supervisando soldados");
    }
    
    
    
}
