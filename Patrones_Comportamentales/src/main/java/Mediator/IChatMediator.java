package Mediator;

public interface IChatMediator {

    void enviarMensaje(String mensaje, Usuario user);

    void agregarUsuario(Usuario user);
}
