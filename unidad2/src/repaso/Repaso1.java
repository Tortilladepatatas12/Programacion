package repaso;
import java.util.Scanner;
public class Repaso1 {

	public static void main(String[] args) {

		Repaso f = new Repaso();
		Scanner input = new Scanner(System.in);
		System.out.print("Cuantos numeros quieres sumar: ");
		int numero = input.NextInt();
		System.out.println(f.sumaNumPar(numero));
		
	}
	int sumaNumPar (int x ) {
			int resultado = 0;
			for (int i =1; i<x; i++) {
				if (i %2 == 0) {
					resultado = resultado + i;
				}
	
	}
	
	}

}
