package Chain_of_Responsibility;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        int monto = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto a retirar"));
        Banco banco = new Banco();
        banco.peticion(monto);
    }

}
