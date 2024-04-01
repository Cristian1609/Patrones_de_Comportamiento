
package STATE;


public class Activa implements Estado{

    @Override
    public void ejecutarAccion() {
        
        System.out.println("Estado activo : atento");
    }
    
}
