package Command;

public class Depositar implements IOperacion {

    private Cuenta cuenta;
    private double monto;

    public Depositar() {
    }

    public Depositar(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }
    
    
    @Override
    public void execute() {
        this.cuenta.depositar(this.monto);
    }

}
