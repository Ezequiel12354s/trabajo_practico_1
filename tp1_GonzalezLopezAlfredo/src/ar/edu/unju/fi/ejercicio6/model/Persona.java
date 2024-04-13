package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	public Persona() { 		//constructor por defecto
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) { //constructor parametrizado
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}
	public Persona(String dni, String nombre, LocalDate fechaNac) { //contructor con provincia por defecto 
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		provincia = "Jujuy";
	}
	
	public void mostrarDatos() { //metodo mostrar datos
		System.out.println("el nombre es: "+nombre);
		System.out.println("el dni es: "+dni);
		System.out.println("la provincia es: "+provincia);
		System.out.println("La fecha de nacimiento es: "+fechaNac);
		System.out.println("la edad es: "+calcularEdad());
		if(mayorEdad()){
			System.out.println("la persona es mayor de edad");
			}
			else {
				System.out.println("la persona NO es mayor de edad");
			}
		
	}
	
	// Método para calcular la edad de la persona
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNac.getYear();
        return edad;
    }
    //Metodo para saber si es mayor de edad
	public boolean mayorEdad() { 
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.getYear() - fechaNac.getYear();
		return edad>=18;
	}
	//metodos accesores
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	

	
	
	
}