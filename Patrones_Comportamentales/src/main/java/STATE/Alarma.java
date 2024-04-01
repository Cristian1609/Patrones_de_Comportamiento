
package STATE;


public class Alarma {
    
    private Estado miEstado;

    public Alarma() {
    }

    public Alarma(Estado miEstado) {
        this.miEstado = miEstado;
    }

    public Estado getMiEstado() {
        return miEstado;
    }

    public void setMiEstado(Estado e) {
        this.miEstado = e;
    }
    public void ejecutarAccion(){
        miEstado.ejecutarAccion();
    }
    
}
