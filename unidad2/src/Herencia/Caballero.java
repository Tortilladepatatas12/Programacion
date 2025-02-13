package Herencia;

public class Caballero extends Personaje{

	public Caballero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp,"Espada");
			
	}

	public boolean esAtacado(Personaje p) {
		boolean atacado;
		if (p instanceof Mago)
			atacado = true;
		else if (p instanceof Arquero) {

			atacado = true;
		} else {

			atacado = false;
		}
		return atacado;
	}
}
