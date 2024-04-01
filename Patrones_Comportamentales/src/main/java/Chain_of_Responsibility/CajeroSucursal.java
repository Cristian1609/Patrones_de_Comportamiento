
package Chain_of_Responsibility;

import javax.swing.JOptionPane;


public class CajeroSucursal implements IManejador{
    
    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        
        if (monto > 100 && monto < 300) {
            
            JOptionPane.showMessageDialog(null,"La petición ha sido atendida por el Cajero de la Sucursal");
        }else{
            sucesor.peticion(monto);
        }
    }

    @Override
    public IManejador getSucesor() {
        return sucesor;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
        
        this.sucesor = sucesor;
        
    }

   
    
}
