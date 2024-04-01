package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

    private List<Usuario> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : users) {
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }

    @Override
    public void agregarUsuario(Usuario user) {
        this.users.add(user);
    }

}
