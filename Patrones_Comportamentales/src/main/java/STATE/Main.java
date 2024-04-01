package STATE;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Alarma alarma = new Alarma();
        Activa activa = new Activa();
        Mantenimiento mantenimiento = new Mantenimiento();

        int opcion = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n\n");
            System.out.println("---------------------------------");
            System.out.println("Slecciona el estado de la alarma");
            System.out.println("0.Salir");
            System.out.println("1.Activa");
            System.out.println("2.Mantenimiento");
            System.out.println("---------------------------------\n");
            System.out.print("Elección: ");
            opcion = entrada.nextInt();
            System.out.println("\n\n");
            switch (opcion) {

                case 0:
                    System.out.println(0);
                    break;
                case 1:
                    alarma.setMiEstado(activa);
                    break;
                case 2:
                    alarma.setMiEstado(mantenimiento);
                    break;

                default:
                    System.out.println("Opción errada");
                    break;
            }

            alarma.ejecutarAccion();

        } while (opcion != 0);

    }

}
