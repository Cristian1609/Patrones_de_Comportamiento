package Template_Method;

public abstract class ConstruccionDeCasa {

    public final void construirCasa() {
        ponerPiso();
        ponerParedes();
        ponerTecho();
    }

    abstract void ponerPiso();

    abstract void ponerParedes();

    abstract void ponerTecho();
}
