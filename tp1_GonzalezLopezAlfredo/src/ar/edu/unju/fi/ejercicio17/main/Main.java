package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;


public class Main {
    private static ArrayList<Jugador> jugadores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("*******MENU*******");
            System.out.println("1 – Alta de jugador");
            System.out.println("2 – Mostrar los datos del jugador");
            System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 – Modificar los datos de un jugador");
            System.out.println("5 – Eliminar un jugador");
            System.out.println("6 – Mostrar la cantidad total de jugadores");
            System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 – Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    altaJugador();
                    break;
                case 2:
                    mostrarDatosJugador();
                    break;
                case 3:
                    mostrarJugadoresOrdenados();
                    break;
                case 4:
                    modificarJugador();
                    break;
                case 5:
                    eliminarJugador();
                    break;
                case 6:
                    mostrarCantidadTotalJugadores();
                    break;
                case 7:
                    mostrarCantidadJugadoresPorNacionalidad();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 8);
    }

    private static void altaJugador() {
        System.out.println("Ingrese los datos del jugador:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        System.out.print("Estatura: ");
        double estatura = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Posición: ");
        String posicion = scanner.next();

        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
        jugadores.add(jugador);
        System.out.println("Jugador agregado correctamente.");
    }

    private static void mostrarDatosJugador() {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.next();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                System.out.println("Datos del jugador:");
                System.out.println(jugador);
                return;
            }
        }
        System.out.println("No se encontró el jugador con ese nombre y apellido.");
    }

    private static void mostrarJugadoresOrdenados() {
        ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        Collections.sort(jugadoresOrdenados, Comparator.comparing(Jugador::getApellido));
        System.out.println("Jugadores ordenados por apellido:");
        for (Jugador jugador : jugadoresOrdenados) {
            System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
        }
    }

    private static void modificarJugador() {
        System.out.print("Ingrese el nombre del jugador a modificar: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del jugador a modificar: ");
        String apellido = scanner.next();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                System.out.println("Ingrese los nuevos datos del jugador:");
                System.out.print("Nuevo nombre: ");
                jugador.setNombre(scanner.next());
                System.out.print("Nuevo apellido: ");
                jugador.setApellido(scanner.next());
                System.out.print("Nueva fecha de nacimiento: ");
                jugador.setFechaNacimiento(scanner.next());
                System.out.print("Nueva nacionalidad: ");
                jugador.setNacionalidad(scanner.next());
                System.out.print("Nueva estatura: ");
                jugador.setEstatura(scanner.nextDouble());
                System.out.print("Nuevo peso: ");
                jugador.setPeso(scanner.nextDouble());
                System.out.print("Nueva posición: ");
                jugador.setPosicion(scanner.next());
                System.out.println("Datos modificados correctamente.");
                return;
            }
        }
        System.out.println("No se encontró el jugador con ese nombre y apellido.");
    }

    private static void eliminarJugador() {
        System.out.print("Ingrese el nombre del jugador a eliminar: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del jugador a eliminar: ");
        String apellido = scanner.next();

        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                iterator.remove();
                System.out.println("Jugador eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró el jugador con ese nombre y apellido.");
    }

    private static void mostrarCantidadTotalJugadores() {
        System.out.println("La cantidad total de jugadores es: " + jugadores.size());
    }

    private static void mostrarCantidadJugadoresPorNacionalidad() {
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.next();

        int count = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                count++;
            }
        }
        System.out.println("La cantidad de jugadores de nacionalidad " + nacionalidad + " es: " + count);
    }
}