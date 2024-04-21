package ar.edu.unju.fi.ejercicio12.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos de la persona
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (dd/mm/yyyy):");
        String fechaNacimientoStr = scanner.nextLine();
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Restamos 1 porque los meses en Calendar van de 0 a 11
        int año = Integer.parseInt(partesFecha[2]);

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(año, mes, dia);

        
        Persona persona = new Persona(nombre, fechaNacimiento);

        // Mostrar los datos de la persona y los resultados de los métodos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + año);
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
        System.out.println("Estación del año: " + persona.determinarEstacion());

        scanner.close();
    }
}