package entornosDeDesarrollo;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        while (true) {
            System.out.print("Elige (1) Piedra, (2) Papel, (3) Tijeras, (0) Salir: ");
            int usuario = input.nextInt();
            if (usuario == 0) break;
            int maquina = aleatorio.nextInt(3) + 1;
            if (usuario == maquina) System.out.println("empate ");
            else if ((usuario == 1 && maquina == 3) || (usuario == 2 && maquina == 1) || (usuario == 3 && maquina == 2)) 
                System.out.println("Has ganado ");
            else 
                System.out.println("Has perdido ");
        }
        
	}

}
