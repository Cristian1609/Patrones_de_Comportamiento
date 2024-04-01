
package Mediator;

public class ChatUser extends Usuario {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(this.name + " enviando mensaje: " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String message) {
        System.out.println(this.name + " recibiendo mensaje: " + message);
    }

}
