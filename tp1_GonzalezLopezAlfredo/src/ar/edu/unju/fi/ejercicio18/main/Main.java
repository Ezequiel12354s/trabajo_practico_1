package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pais> paises = new ArrayList<>();
        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Brasil"));
        paises.add(new Pais(3, "Chile"));

        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("********MENU********");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el código del destino turístico:");
                    int codigoDestino = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del destino turístico:");
                    String nombreDestino = scanner.nextLine();
                    System.out.println("Ingrese el precio del destino turístico:");
                    double precioDestino = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.println("Ingrese el código del país:");
                    int codigoPais = scanner.nextInt();
                    scanner.nextLine(); 
                    Pais paisDestino = buscarPaisPorCodigo(paises, codigoPais);
                    if (paisDestino != null) {
                        System.out.println("Ingrese la cantidad de días del destino turístico:");
                        int cantidadDiasDestino = scanner.nextInt();
                        scanner.nextLine(); 
                        destinos.add(new DestinoTuristico(codigoDestino, nombreDestino, precioDestino, paisDestino, cantidadDiasDestino));
                        System.out.println("Destino turístico agregado exitosamente.");
                    } else {
                        System.out.println("El país con el código ingresado no existe.");
                    }
                    break;
                case 2:
                    System.out.println("Destinos turísticos:");
                    for (DestinoTuristico destino : destinos) {
                        System.out.println(destino.getNombre() + " - " + destino.getPais().getNombre());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el código del destino turístico a modificar:");
                    int codigoModificar = scanner.nextInt();
                    scanner.nextLine();
                    DestinoTuristico destinoModificar = buscarDestinoPorCodigo(destinos, codigoModificar);
                    if (destinoModificar != null) {
                        System.out.println("Ingrese el nuevo código del país:");
                        int nuevoCodigoPais = scanner.nextInt();
                        scanner.nextLine();
                        Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);
                        if (nuevoPais != null) {
                            destinoModificar.setPais(nuevoPais);
                            System.out.println("País modificado exitosamente.");
                        } else {
                            System.out.println("El país con el código ingresado no existe.");
                        }
                    } else {
                        System.out.println("El destino turístico con el código ingresado no existe.");
                    }
                    break;
                case 4:
                    destinos.clear();
                    System.out.println("Lista de destinos turísticos limpiada.");
                    break;
                case 5:
                    System.out.println("Ingrese el código del destino turístico a eliminar:");
                    int codigoEliminar = scanner.nextInt();
                    scanner.nextLine();
                    Iterator<DestinoTuristico> iterator = destinos.iterator();
                    while (iterator.hasNext()) {
                        DestinoTuristico destino = iterator.next();
                        if (destino.getCodigo() == codigoEliminar) {
                            iterator.remove();
                            System.out.println("Destino turístico eliminado exitosamente.");
                            break;
                        }
                    }
                    break;
                case 6:
                    Collections.sort(destinos, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));
                    System.out.println("Destinos turísticos ordenados por nombre:");
                    for (DestinoTuristico destino : destinos) {
                        System.out.println(destino.getNombre());
                    }
                    break;
                case 7:
                    System.out.println("Países:");
                    for (Pais pais : paises) {
                        System.out.println(pais.getNombre());
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el código del país:");
                    int codigoPaisMostrar = scanner.nextInt();
                    scanner.nextLine();
                    Pais paisMostrar = buscarPaisPorCodigo(paises, codigoPaisMostrar);
                    if (paisMostrar != null) {
                        System.out.println("Destinos turísticos de " + paisMostrar.getNombre() + ":");
                        for (DestinoTuristico destino : destinos) {
                            if (destino.getPais().getCodigo() == codigoPaisMostrar) {
                                System.out.println(destino.getNombre());
                            }
                        }
                    } else {
                        System.out.println("El país con el código ingresado no existe.");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, int codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo() == codigo) {
                return pais;
            }
        }
        return null;
    }

    private static DestinoTuristico buscarDestinoPorCodigo(ArrayList<DestinoTuristico> destinos, int codigo) {
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo() == codigo) {
                return destino;
            }
        }
        return null;
    }
}