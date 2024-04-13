package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		Scanner sc = new Scanner(System.in);
		System.out.println("CONSTRUCTOR POR DEFECTO");
		System.out.println("Ingrese dni: ");
		String dni1 = sc.nextLine();
		persona1.setDni(dni1);
		System.out.println("Ingrese el nombre: ");
		String nombre1 = sc.nextLine();
		persona1.setNombre(nombre1);
		System.out.println("Ingrese la fecha de nacimiento (AAAA-MM-DD:");
		LocalDate fechaNacimiento1 = LocalDate.parse(sc.nextLine());
		persona1.setFechaNac(fechaNacimiento1);
		System.out.println("Ingrese provincia: ");
		String prov1 = sc.nextLine();
		persona1.setProvincia(prov1);
		persona1.mostrarDatos();
		
		System.out.println("CONSTRUCTOR PARAMETRIZADO");
		System.out.println("Ingrese el dni: ");
		String dni2 = sc.nextLine();
		System.out.println("Ingrese nombre: ");
		String nombre2 = sc.nextLine();
		System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD)");
		LocalDate fechaNacimiento2 = LocalDate.parse(sc.nextLine());
		System.out.println("Ingrese provincia: ");
		String prov2 = sc.nextLine();
		Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, prov2);
		persona2.mostrarDatos();
		
		System.out.println("CONSTRUCTOR CON PROVINCIA POR DEFECTO");
		System.out.println("Ingrese el dni: ");
		String dni3 = sc.nextLine();
		System.out.println("Ingrese nombre: ");
		String nombre3 = sc.nextLine();
		System.out.println("Ingrese fecha de nacimiento: (AAAA-MM-DD");
		LocalDate fechaNacimiento3 = LocalDate.parse(sc.nextLine());
		Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
		persona3.mostrarDatos();
		sc.close();
	}

}
