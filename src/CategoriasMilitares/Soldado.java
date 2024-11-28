package CategoriasMilitares;
import java.util.ArrayList;
import java.util.List;

import Rango.Rango;

public class Soldado extends Rango{
    private String nombre;
    private String id; 
    private static int contadorSoldados = 0;
    
    public class SoldadoCRUD {
    private List<Soldado> soldados = new ArrayList<>();

    public void addSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public List<Soldado> getAllSoldados() {
        return soldados;
    }

    public void updateSoldado(Soldado soldado) {
        for (int i = 0; i < soldados.size(); i++) {
            if (soldados.get(i).getId() == soldado.getId()) {
                soldados.set(i, soldado);
                return;
            }
        }
    }

    public void deleteSoldado(String id) {
        soldados.removeIf(s -> s.getId().equals(id));
    }
}

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
