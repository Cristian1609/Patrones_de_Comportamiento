/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain_of_Responsibility;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class AsesorFinanciero implements IManejador{
    
    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        
        if (monto >= 300) {
            
            JOptionPane.showMessageDialog(null,"La petición ha sido atendida por el Asesor Financiero");
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
