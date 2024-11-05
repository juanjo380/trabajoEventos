public class Soldado extends Rango{
    private String nombre;
    private String id; 
    private String rango;

    //Constructor
    public Soldado(int nivel, String nombre, String id, String rango) {
        super(nivel);
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void mostrarInformacion(){
        System.out.println("-Informacion del soldado:"+ id+"-" );
        System.out.println("Nombre: "+ nombre);
        System.out.println("Id: "+ id);
        System.out.println("Rango: "+ rango);
    }

    //Implementacion del metodo abstracto
    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarAccion'");
    }

    
}
