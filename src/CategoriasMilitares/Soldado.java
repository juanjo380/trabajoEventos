package CategoriasMilitares;
import Rango.Rango;

public class Soldado extends Rango{
    private String nombre;
    private String id; 
    private static int contadorSoldados = 0;
    

    //Constructor
    public Soldado(int nivel, String nombre, String id) {
        super(1);
        this.nombre = nombre;
        this.id = id;
            contadorSoldados++;
        }
    
        public static int getContadorSoldados() {
            return contadorSoldados;
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


    

    public void mostrarInformacion(){
        System.out.println("-Informacion del soldado:"+ id+"-" );
        System.out.println("Nombre: "+ nombre);
        System.out.println("Id: "+ id);
        
    }

    //Implementacion del metodo abstracto
    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        System.out.println("Soldado en posición de ataque");
    }

    
}
