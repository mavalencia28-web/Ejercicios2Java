import java.util.HashMap;
import java.util.Scanner;

public class EdadesPorNombres {
    public static void main(String[] args) {

        //HashMap asocia llaves/claves con valores
        HashMap<String, Integer> edades = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Consultar edad por nombre");
            System.out.println("3. Mostrar todas las personas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    edades.put(nombre, edad); //edades.put agrega o actualiza una persona
                    System.out.println("Persona registrada correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre a consultar: ");
                    String buscar = sc.nextLine();

                    if (edades.containsKey(buscar)) { //verifica si el nombre existe antes de buscar
                        System.out.println("La edad de " + buscar + " es: " + edades.get(buscar) + " años."); //edades.get(buscar) obtiene la edad que corresponde al nombre
                    } else {
                        System.out.println("La persona no está registrada.");
                    }
                    break;

                case 3:
                    System.out.println("\nPersonas registradas:");
                    for (String n : edades.keySet()) { // devuelve todas las claves/llaves para listarlas
                        System.out.println("- " + n + ": " + edades.get(n) + " años");
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

