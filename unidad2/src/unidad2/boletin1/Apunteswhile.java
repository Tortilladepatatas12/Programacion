package unidad2.boletin1;
import java.util.Scanner;
public class Apunteswhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean encontrado=false;
		int numeroAlAzar = (int) Math.random();
		Scanner input = new Scanner(System.in);
				int apuesta;
		while (!encontrado)
		{System.out.print("Adivina mi nº");
		if (apuesta == numeroAlAzar)
			encontrado = true;
		}
		
	}

}
