public class Capitan extends Rango implements OperacionesMilitares{
    private int cantidadSoldadosBajoSuMando;
    

    public Capitan(int nivel, int cantidadSoldadosBajoSuMando) {
        super(3);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    @Override
    public void asignarMision(String mision) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Mision asignada al capitan: " + mision);
    }

    @Override
    public void reportarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Estado del Capitán: Liderando " + cantidadSoldadosBajoSuMando);
    }

    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Capitán coordinando misiones.");
    }
    
    
}
