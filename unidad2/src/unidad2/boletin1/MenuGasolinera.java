package unidad2.boletin1;

import java.util.Scanner;

public class MenuGasolinera {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner declarado fuera del bucle
		int opcion; // Variable para almacenar la opción elegida

		do {
			System.out.println("1-Asignar surtidor");
			System.out.println("2-Consultar estado");
			System.out.println("3-Opcion tres");
			System.out.println("4-Opcion cuatro");
			System.out.println("5-Salir");

			opcion = input.nextInt(); // Leer la opción elegida por el usuario

			switch (opcion) {
			case 1:
				System.out.println("Has elegido opcion 1");
				break;
			case 2:
				System.out.println("Has elegido opcion 2");
				break;
			case 3:
				System.out.println("Has elegido opcion 3");
				break;
			case 4:
				System.out.println("Has elegido opcion 4");
				break;
			case 5:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 5); // El bucle continuará hasta que la opción sea 5
	}
}
