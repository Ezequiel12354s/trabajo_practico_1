package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	private static final double SALARIO_MINIMO = 210000.00;
	private static final double AUMENTO_POR_MERITOS = 20000.00;
	
	public Empleado(String nombre, int legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: "+salario);
	}
	
	public void darAumento() {
		salario = salario + AUMENTO_POR_MERITOS;
	}
	
	
}
