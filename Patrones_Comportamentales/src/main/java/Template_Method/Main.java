
package Template_Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Construyendo una casa de madera:");
        ConstruccionDeCasa casaMadera = new ConstruccionCasaMadera();
        casaMadera.construirCasa();

        System.out.println("\nConstruyendo una casa de ladrillos:");
        ConstruccionDeCasa casaLadrillos = new ConstruccionCasaLadrillos();
        casaLadrillos.construirCasa();
    }
}

