package Herencia;

public class Mago extends Personaje {

	public Mago(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp,"Hechizo");
	}

	public boolean esAtacado(Personaje p) {
		
		return false;
	}
	
	public boolean esAtacado(Personaje p,int distancia) {
		
		return false;
	}
	
}
