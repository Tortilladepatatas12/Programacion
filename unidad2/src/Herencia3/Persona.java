package Herencia3;

import java.util.Objects;

public class Persona {
private String Nombre;
private String Apellido;
private int Edad;
private float salario;



public Persona(String nombre, String apellido, int edad, float salario) {
	super();
	Nombre = nombre;
	Apellido = apellido;
	Edad = edad;
	this.salario = salario;
}



protected String getNombre() {
	return Nombre;
}



protected void setNombre(String nombre) {
	Nombre = nombre;
}



protected String getApellido() {
	return Apellido;
}



protected void setApellido(String apellido) {
	Apellido = apellido;
}



protected int getEdad() {
	return Edad;
}



protected void setEdad(int edad) {
	Edad = edad;
}



protected float getSalario() {
	return salario;
}



protected void setSalario(float salario) {
	this.salario = salario;
}



@Override
public int hashCode() {
	return Objects.hash(Apellido, Edad, Nombre, salario);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona other = (Persona) obj;
	return Objects.equals(Apellido, other.Apellido) && Edad == other.Edad && Objects.equals(Nombre, other.Nombre)
			&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
}


public void concentrarse() {
	
	System.out.println("Método concentrarse del padre");
	
}

public void concentrarse(String lugar) {
	
	System.out.println("Método concentratse del padre con String" + lugar);
	
}
}
