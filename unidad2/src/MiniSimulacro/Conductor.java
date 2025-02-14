package MiniSimulacro;

import java.util.Objects;

public class Conductor {

	private String nombre;
	private int anioExperiencia;

	
	
	public Conductor(String nombre, int anioExperiencia) {
		super();
		this.nombre = nombre;
		this.anioExperiencia = getAnioExperiencia();
	}



	protected String getNombre() {
		return nombre;
	}



	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}



	protected int getAnioExperiencia() {
		return anioExperiencia;
	}



	protected void setAnioExperiencia(int anioExperiencia) {
		if(anioExperiencia>0) {
		this.anioExperiencia = anioExperiencia;}
		else { 
			this.anioExperiencia=0;
		}
	}



	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anioExperiencia=" + anioExperiencia + "]";
	}

	
	
	

	
}
