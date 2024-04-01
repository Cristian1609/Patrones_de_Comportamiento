package Chain_of_Responsibility;

public interface IManejador {
    
    public void peticion(int monto);
    
    public IManejador getSucesor();
    
    public void setSucesor(IManejador sucesor);
}
