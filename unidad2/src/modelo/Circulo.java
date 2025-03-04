package modelo;

public class Circulo {

	private double radio;
	private final static double PI = 3.141621;
	
	
	public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}



	public double CalculaArea(){
		
		return PI*this.radio*this.radio;
	}
	
}
