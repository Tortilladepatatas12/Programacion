package Controlador;
import modelo.*;
public class GestionaAnimal {

	
	public static void main(String[] args) {
	
		Animal p = new Perro();
		Animal g = new Gato();
		Animal pez = new Pez();
		
		System.out.println(p.getSonidoQueEmite());
		System.out.println(g.getSonidoQueEmite());
		

	}

}
