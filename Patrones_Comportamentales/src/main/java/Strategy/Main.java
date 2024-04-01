package Strategy;

public class Main {

    public static void main(String[] args) {
        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();
    }

}
