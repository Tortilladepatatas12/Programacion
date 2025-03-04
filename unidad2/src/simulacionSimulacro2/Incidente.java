package simulacionSimulacro2;

import java.time.LocalDate;

public class Incidente {

	private int id;
	private String nombre;
	private String descripcion;
	private LocalDate fecharegistro;
	private LocalDate fechacierre;
	private Estado estado;
	private Criticidad criticidad;
	private Equipo equipo;
	
boolean ComprobarCierre() { 
if (estado != Estado.CERRADA){
	fechacierre=null;
	return false;
	
}
System.out.println("El estado es Cerrado");
return true;
}

public Incidente(int id, String nombre, String descripcion, LocalDate fecharegistro, LocalDate fechacierre,
		Estado estado, Criticidad criticidad, Equipo equipo) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.fecharegistro = fecharegistro;
	this.fechacierre = fechacierre;
	this.estado = estado;
	this.criticidad = criticidad;
	this.equipo = equipo;
}


@Override
public String toString() {
	return  nombre + "- "+ estado + ": " + criticidad + "- "+fecharegistro+ "- "+equipo.getNombre();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public LocalDate getFecharegistro() {
	return fecharegistro;
}

public void setFecharegistro(LocalDate fecharegistro) {
	this.fecharegistro = fecharegistro;
}

public LocalDate getFechacierre() {
	return fechacierre;
}

public void setFechacierre(LocalDate fechacierre) {
	this.fechacierre = fechacierre;
}

public Estado getEstado() {
	return estado;
}

public void setEstado(Estado estado) {
	this.estado = estado;
}

public Criticidad getCriticidad() {
	return criticidad;
}

public void setCriticidad(Criticidad criticidad) {
	this.criticidad = criticidad;
}

public Equipo getEquipo() {
	return equipo;
}

public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}



}
