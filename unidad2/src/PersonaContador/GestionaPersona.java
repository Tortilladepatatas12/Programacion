package PersonaContador;

import java.util.Scanner;

public class GestionaPersona {

	public static void main(String[] args) {
	
		Persona p1 = new Persona (0, "Pepe",20);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(Persona.validaSiDniValido(input));
		
	}

}
