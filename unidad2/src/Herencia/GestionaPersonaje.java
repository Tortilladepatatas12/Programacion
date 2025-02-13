package Herencia;

public class GestionaPersonaje {

	public static void main(String[] args) {
		
		Caballero caballero = new Caballero("JC",1,100,"Espada");
		
		Mago mago = new Mago ("Pedro",1,100,"Hechizo");

		Arquero arquero = new Arquero ("Gustavo",1,100,"Flecha");
		
		System.out.println(caballero.toString());
		
		System.out.println(mago.toString());
		
		System.out.println(arquero.toString());
		
	}

}
