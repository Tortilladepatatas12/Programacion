package PersonaContador;

public class Persona {

	static int contador;
	int identificador;
	String nombre;
	int edad;
	int dni;
	
	public Persona(int identificador, String nombre, int edad) {
		super();
		this.identificador = contador+1;
		this.nombre = nombre;
		this.edad = edad;
		
		
	}

	@Override
	public String toString() {
		return "Persona [identificador=" + identificador + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	static boolean validaSiDniValido(String dni) {
		boolean valido = false;
		if (dni.matches("\\d{8}[A-Za-z]{1}")) {
			valido = true;
		} else {
			System.out.println("Error, dni no válido");
			valido = false;
		}
		return valido;
	}
	
}
