package unidad2.boletin1;

import java.util.Scanner;

public class edad60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dime tu edad");
		Scanner input = new Scanner(System.in);
		int edad = input.nextInt();
		System.out.println(edad);
		double descuento = 0.3;
		double descuentomenor = 0.1;
		if (edad > 60) {
			System.out.println("Se te ha aplicado el 30% descuento");
			System.out.println("¿Cuánto vale tu producto?");
			int producto = input.nextInt();
			double preciodescuento = (producto * descuento);
			double preciofinal = (producto - preciodescuento);
			System.out.println("El precio final del producto con el descuento es:");
			System.out.println(preciofinal);
		} else {
			System.out.println("Se te ha aplicado un 10% de descuento");
			System.out.println("¿Cuánto vale tu producto?");
			int producto = input.nextInt();
			double preciodescuentomenor = (producto * descuentomenor);
			double preciofinalmenor = (producto - preciodescuentomenor);
			System.out.println("El precio final del producto con el descuento es:");
			System.out.println(preciofinalmenor);
		}

	}

}
