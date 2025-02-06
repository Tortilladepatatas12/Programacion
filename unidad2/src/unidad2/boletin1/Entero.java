package unidad2.boletin1;

import java.util.Scanner;

public class Entero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 6;
		System.out.println(numero);
		String cadena = ("Hola");
		System.out.println(cadena);
		System.out.println(cadena + " mi numero es " + numero);
		final int codigopostal = 41980;
		System.out.println(codigopostal);
		int a = 1;
		System.out.println(a);
		int b = a++;
		System.out.println(b);
		System.out.println(a);
		int c = a--;
		System.out.println(a);
		System.out.println(c);

		double y = 4.0;
		double z = 3.0;
		double res = y / z - y * z;
		System.out.println(res);
		// Para hacer un input de numero
		System.out.println("Dame un número entero");
		Scanner sc = new Scanner (System.in);
		int numero2 =sc.nextInt();
		System.out.println(numero2);

		// Para hacer un input de cadena
		System.out.println("Dame una cadena");
		Scanner sc2 = new Scanner (System.in);
		String cadena2 =sc.next();
		System.out.println(cadena2);
	
		// If
		int j=8;
		System.out.println("Dame un número entero");
		Scanner sc3 = new Scanner (System.in);
	}
}
