import java.util.HashSet;
import java.util.Scanner;

public class NombresSinDuplicados {
    public static void main(String[] args) {

        //HashSet guarda elementos unicos y evita repetidos
        HashSet<String> nombres = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Mostrar nombres");
            System.out.println("3. Buscar nombre");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    if (nombres.add(nombre)) { //nombres.add() devuelve true si lo agrego, devuelve false si ya estaba agregado
                        System.out.println("Nombre agregado con éxito.");
                    } else {
                        System.out.println("Este nombre ya existe. No se agregó.");
                    }
                    break;

                case 2:
                    System.out.println("\nNombres guardados:");
                    for (String n : nombres) {
                        System.out.println("- " + n);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String buscar = sc.nextLine();

                    if (nombres.contains(buscar)) { //nombres.contains(buscar) permite saber si un nombre está agregado
                        System.out.println("El nombre SÍ está registrado.");
                    } else {
                        System.out.println("El nombre NO está registrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
