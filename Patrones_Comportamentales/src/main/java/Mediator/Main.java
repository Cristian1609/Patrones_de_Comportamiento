package Mediator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediator();

        Usuario Usuario1 = new ChatUser(mediator, "User 1");
        Usuario Usuario2 = new ChatUser(mediator, "User 2");
        Usuario Usuario3 = new ChatUser(mediator, "User 3");

        mediator.agregarUsuario(Usuario1);
        mediator.agregarUsuario(Usuario2);
        mediator.agregarUsuario(Usuario3);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter sender (Usuario 1, Usuario 2, or Usuario 3): ");
            String Usuario = scanner.nextLine();
            Usuario U1 = null;
            switch (Usuario.toLowerCase()) {
                case "Usuario 1":
                    U1 = Usuario1;
                    break;
                case "Usuario 2":
                    U1 = Usuario2;
                    break;
                case "Usuario 3":
                    U1 = Usuario3;
                    break;
                default:
                    System.out.println("Usuario invalido");
                    continue;
            }

            System.out.print("Enter message: ");
            String message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Exiting chat...");
                break;
            }
            U1.enviar(message);
        }
        scanner.close();
    }
}
