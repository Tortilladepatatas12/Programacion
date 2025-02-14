package Herencia3;

public class Automovil {
	
	private	String dueno;
	private	int numPuertas;
	private	int numRuedas;
	private	String calificacionEcologica;
	
	public String getDueno() {
		return dueno;
	}
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	private enum CalificacionEco{
		
		ECO,O,B,C;	
	}
	


		protected CalificacionEco getEco() {
		return eco;
	}
	protected void setEco(CalificacionEco eco) {
		if (calificacionEcologica.equals(CalificacionEco.ECO))
		this.eco = eco;
	}





	CalificacionEco eco = CalificacionEco.ECO;
	
}
