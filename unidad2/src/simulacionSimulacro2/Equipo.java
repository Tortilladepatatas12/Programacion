package simulacionSimulacro2;

import java.util.Objects;

public class Equipo {

	private String nombre;
	
	private String mac;
	
	private String so;
	
	private int numincidentes;

	public Equipo(String nombre, String mac, String so, int numincidentes) {
		super();
		this.nombre = nombre;
		this.mac = mac;
		this.so = so;
		this.numincidentes = numincidentes;
	}

	
	
	@Override
	public String toString() {
		return nombre +"- " + mac + ": "+ numincidentes;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public int getNumincidentes() {
		return numincidentes;
	}

	public void setNumincidentes(int numincidentes) {
		this.numincidentes = numincidentes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mac, nombre, numincidentes, so);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(mac, other.mac);
	}
	
	
	
}
