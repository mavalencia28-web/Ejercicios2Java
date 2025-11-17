import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RegistrarTurnos {
    public static void main(String[] args) {

        //la cola almacena los nombres de las personas
        Queue<String> colaTurnos = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        //do-while: permite que el sistema continue hasta que se decida salir
        do {
            System.out.println("\n--- SISTEMA DE TURNOS ---");
            System.out.println("1. Registrar turno");
            System.out.println("2. Atender turno");
            System.out.println("3. Mostrar turnos en espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            //switch: estructura de control en vez de usar muchos if-else
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    colaTurnos.add(nombre); //add() agrega el turno al final de la cola, respetando el orden FIFO
                    System.out.println("Turno registrado para: " + nombre);
                    break;

                case 2:
                    if (colaTurnos.isEmpty()) { //se verifica con isEmpty que la cola no esté vacía
                        System.out.println("No hay turnos para atender.");
                    } else {
                        String atendido = colaTurnos.poll(); // saca el primero
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;

                case 3:
                    System.out.println("Turnos en espera: " + colaTurnos); //imprime la cola completa, mostrando primero el siguiente en ser atendido
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
