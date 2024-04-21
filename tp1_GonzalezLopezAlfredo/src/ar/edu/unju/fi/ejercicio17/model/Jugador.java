package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jugador {
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;
	
	
	
	public Jugador(String nombre, String apellido, String fechaNacimiento, String nacionalidad, double estatura,
			double peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	public double getEstatura() {
		return estatura;
	}



	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	public int calcularEdad() {
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        return periodo.getYears();
	}



	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}
	
}
