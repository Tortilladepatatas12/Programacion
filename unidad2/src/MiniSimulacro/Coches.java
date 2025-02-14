package MiniSimulacro;

import java.util.Objects;

public class Coches {

	private String marca;
	private String modelo;
	private String matricula;
	private String dueno;
	
	
	
	public Coches(String marca, String modelo, String matricula, String dueno) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.dueno = dueno;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getDueno() {
		return dueno;
	}


	public void setDueno(String dueno) {
		this.dueno = dueno;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dueno, marca, matricula, modelo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coches other = (Coches) obj;
		return Objects.equals(dueno, other.dueno) && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo);
	}


	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", dueno=" + dueno + "]";
	}
	
	
	
}
