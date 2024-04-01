
package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    
    private List<IOperacion> operaciones = new ArrayList<>();
    
    public void recibirOperaciones(IOperacion operacion){
        this.operaciones.add(operacion);
    }
    
    public void realizarOperaciones(){
        this.operaciones.forEach(x -> x.execute());
        this.operaciones.clear();    }
        
}
