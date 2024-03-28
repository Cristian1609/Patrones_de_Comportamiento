
package Chain_of_Responsibility;


public class Banco implements IManejador{
    
    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        
        CajeroAutomatico Ca = new CajeroAutomatico();
        setSucesor(Ca);
        
        CajeroSucursal Cs = new CajeroSucursal();
        Ca.setSucesor(Cs);
        
        AsesorFinanciero Af = new AsesorFinanciero();
        Cs.setSucesor(Af);
        
        sucesor.peticion(monto);
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
