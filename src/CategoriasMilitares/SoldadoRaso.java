package CategoriasMilitares;
import MisionesMilitares.OperacionesMilitares;
import Rango.Rango;

public class SoldadoRaso extends Rango implements OperacionesMilitares{
    public SoldadoRaso(int nivel, String nombre, String id) {
        super(2);
        this.nivel = 1; 
    }

    @Override
    public void asignarMision(String mision) {
        // TODO Auto-generated method stub
        System.out.println("Misión asignada al Soldado Raso: " + mision);
    }

    @Override
    public void reportarEstado() {
        // TODO Auto-generated method stub
        System.out.println("Estado del Soldado Raso: En posición de ataque");
    }

    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        System.out.println("Soldado raso en posición de ataque");
    }
}
