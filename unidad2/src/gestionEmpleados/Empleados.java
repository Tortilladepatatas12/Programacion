package gestionEmpleados;

import java.util.Objects;

class Empleados {

	String nombre;
	String dni;
	int salario;
	
	
	int CalcularSalario(){

		return salario;
	}
	
	int ValidarSalario() {
		
		if (salario <0) {
			System.out.println("Error el salario no puede ser negativo. ");
			salario = 1134;
			return salario;}
			
		else {
				System.out.println("El salario es válido");
				return salario;
			}
		
		
	}
	
	boolean ComprobarDNI(){
		
		if (dni.equals(dni)){
			System.out.println("Los DNI coinciden. ");
			return true;}
		else {
			System.out.println("El dni no coincide. ");
			return false;
		}
	}
	
	public Empleados(String nombre, String dni, int salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected int getSalario() {
		return salario;
	}
	protected void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, salario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre) && salario == other.salario;
	}
	@Override
	public String toString() {
		return "DNI: " + dni +" Nombre: " + nombre +  "- Salario: " + salario ;
	}
		
	
	
	}
	
