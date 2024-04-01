package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1", "Mouse"));
        productos.add(new Producto("2", "Teclado"));
        productos.add(new Producto("3", "Movil"));
        
        JOptionPane.showMessageDialog(null,"Productos \n\n"+imprimirProductos(productos));

    }

    private static String imprimirProductos(ArrayList<Producto> productos) {
        
        String lista = "";
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {            
            lista += iterator.next().toString();
        }
        
        return lista;
    }
}
