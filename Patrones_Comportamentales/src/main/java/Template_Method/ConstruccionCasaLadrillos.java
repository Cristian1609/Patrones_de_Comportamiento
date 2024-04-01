package Template_Method;

public class ConstruccionCasaLadrillos extends ConstruccionDeCasa {

   

    @Override
    void ponerPiso() {
        System.out.println("Poniendo piso de cemento.");
    }

    @Override
    void ponerParedes() {
        System.out.println("Poniendo paredes de ladrillos.");
    }

    @Override
    void ponerTecho() {
        System.out.println("Poniendo techo de tejas sobre la estructura de madera.");
    }
}
