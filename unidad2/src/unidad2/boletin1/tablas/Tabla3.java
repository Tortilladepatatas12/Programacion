package unidad2.boletin1.tablas;

import java.util.Scanner;

public class Tabla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] tabla = {1,3,4,7};
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el número que quieres buscar ");
		int encontrar = input.nextInt();
		
		for (int posicion = 0; posicion < tabla.length; posicion++)
		{
			if (posicion == encontrar);
			System.out.println("Está en la posición "+posicion);
			
		}
		
		
	}

}
