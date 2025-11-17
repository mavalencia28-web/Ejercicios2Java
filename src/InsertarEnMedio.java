import java.util.LinkedList;
import java.util.Scanner;

public class InsertarEnMedio {
    public static void main(String[] args) {

        //Crear una lista enlazada doble
        LinkedList<String> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Insertar en posición específica");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el elemento: ");
                    String inicio = sc.nextLine();
                    lista.addFirst(inicio); //inserta al inicio sin mover elemento
                    System.out.println("Elemento agregado al inicio.");
                    break;

                case 2:
                    System.out.print("Ingrese el elemento: ");
                    String fin = sc.nextLine();
                    lista.addLast(fin); //inserta al final sin mover elementos
                    System.out.println("Elemento agregado al final.");
                    break;

                case 3:
                    System.out.print("Ingrese el elemento: ");
                    String elemento = sc.nextLine();

                    System.out.print("Ingrese la posición (0 a " + lista.size() + "): ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos >= 0 && pos <= lista.size()) {
                        lista.add(pos, elemento); //inserta en una posición especifica
                        System.out.println("Elemento insertado correctamente.");
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;

                case 4:
                    System.out.println("\nContenido de la lista:");
                    for (String e : lista) { //hace un recorrido que permite mostrar toda la lista
                        System.out.println("- " + e);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
