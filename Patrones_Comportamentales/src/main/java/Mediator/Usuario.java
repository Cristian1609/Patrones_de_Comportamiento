package Mediator;

public abstract class Usuario {

    protected ChatMediator mediator;
    protected String name;

    public Usuario(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void enviar(String mensaje);

    public abstract void recibirMensaje(String message);

}
