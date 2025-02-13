package Herencia3;

public class GestionaPersona {

	public static void main(String[] args) {
		
		Persona p = new Persona("pepe","geniz","pepe@gmail.com",30,30000);
		Persona p2 = new Persona("pepe", "pepe@gmail.com");
		System.out.println(p.toString());

	}

}
