public abstract class Rango {
    protected int nivel;
    
    //Constructor
    public Rango(int nivel) {
        this.nivel = nivel;
    }

    public abstract void realizarAccion();
}