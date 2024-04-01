
package STATE;


public class Mantenimiento implements Estado{

    @Override
    public void ejecutarAccion() {
         System.out.println("Estado en mantenimiento :no atento");
         System.out.println("Enviar correo para informar el estado ");
    }
    
}
