package Template_Method;

public class ConstruccionCasaMadera extends ConstruccionDeCasa {

    @Override
    void ponerPiso() {
        System.out.println("Poniendo piso de madera.");
    }

    @Override
    void ponerParedes() {
        System.out.println("Poniendo paredes de madera.");
    }

    @Override
    void ponerTecho() {
        System.out.println("Poniendo techo de madera.");
    }
}
