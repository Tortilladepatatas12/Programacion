package modelo.mascota;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascotas {

	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;
	
	public abstract String muestra();

	public LocalDate cumpleaños() {
		return fechaNacimiento;
	}
	
	public boolean morir(){
		
		return true;
	}
	
	public abstract boolean habla();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, estado, fechaNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascotas other = (Mascotas) obj;
		return edad == other.edad && Objects.equals(estado, other.estado)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
