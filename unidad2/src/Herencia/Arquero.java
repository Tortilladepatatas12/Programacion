package Herencia;

public class Arquero extends Personaje{

	public Arquero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp,"Flecha");
		// TODO Auto-generated constructor stub
	}

	public boolean esAtacado(Personaje p) {
		boolean atacado;
		if (p instanceof Mago)
			atacado = true;
		else {
			atacado = false;
		}
		return atacado;
	}
	
	public boolean esAtacado(Personaje p,int distancia) {
		boolean atacado;
		if (p instanceof Mago)
			atacado = true;
		else if(p instanceof Caballero && distancia < 50) {
			
			atacado = true;
			
		}
		else {
			atacado = false;
		}
		return atacado;
	}
	
}
