package ar.edu.unju.fi.ejercicio12.model;

	import java.util.Calendar;

	public class Persona {
	    private String nombre;
	    private Calendar fechaNacimiento;

	    // Constructor
	    public Persona(String nombre, Calendar fechaNacimiento) {
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    // Método para calcular la edad de la persona
	    public int calcularEdad() {
	        Calendar ahora = Calendar.getInstance();
	        int edad = ahora.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
	        if (ahora.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
	            edad--;
	        }
	        return edad;
	    }

	    // Método para determinar el signo del zodiaco
	    public String determinarSignoZodiaco() {
	        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
	        int mes = fechaNacimiento.get(Calendar.MONTH);

	        if ((mes == 0 && dia >= 20) || (mes == 1 && dia <= 18)) {
	            return "Acuario";
	        } else if ((mes == 1 && dia >= 19) || (mes == 2 && dia <= 20)) {
	            return "Piscis";
	        } else if ((mes == 2 && dia >= 21) || (mes == 3 && dia <= 19)) {
	            return "Aries";
	        } else if ((mes == 3 && dia >= 20) || (mes == 4 && dia <= 20)) {
	            return "Tauro";
	        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
	            return "Géminis";
	        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 22)) {
	            return "Cáncer";
	        } else if ((mes == 6 && dia >= 23) || (mes == 7 && dia <= 22)) {
	            return "Leo";
	        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	            return "Virgo";
	        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	            return "Libra";
	        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 21)) {
	            return "Escorpio";
	        } else if ((mes == 10 && dia >= 22) || (mes == 11 && dia <= 21)) {
	            return "Sagitario";
	        } else {
	            return "Capricornio";
	        }
	    }

	    // Método para determinar la estación del año
	    public String determinarEstacion() {
	        int mes = fechaNacimiento.get(Calendar.MONTH);

	        if (mes >= 3 && mes <= 5) {
	            return "Otoño";
	        } else if (mes >= 6 && mes <= 8) {
	            return "Invierno";
	        } else if (mes >= 9 && mes <= 11) {
	            return "Primavera";
	        } else {
	            return "Verano";
	        }
	    }

	    // Getter para el nombre
	    public String getNombre() {
	        return nombre;
	    }
	}
