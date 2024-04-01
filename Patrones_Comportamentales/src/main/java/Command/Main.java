
package Command;

public class Main {

    
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(1,400);
        
        Depositar depositar = new Depositar(cuenta,100);
        Retirar retirar = new Retirar(cuenta,10);
        
        Invoker ivk = new Invoker();
        ivk.recibirOperaciones(depositar);
        ivk.recibirOperaciones(retirar);
        
        ivk.realizarOperaciones();
    }
    
}
