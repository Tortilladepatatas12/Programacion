package SimulacroMiercoles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Dados d = new Dados();
        int[] apuestaUsuario = d.apuestaUsuario();
        Random r = new Random();
        int dado1 = r.nextInt(6) + 1;
        int dado2 = r.nextInt(6) + 1;
        int sumarDados = d.sumarDados(dado1, dado2);
        int ganancia = apuestaUsuario[1]*2;
        
//While apuestaUsuario != "Fin" entonces que ejecute el if
//En caso de que sea Fin Mostrará el historial
//El historial sería una variable que se guarda cada vez que el sistema muestra la ganancia o la pérdida.
        if (apuestaUsuario[0] == sumarDados) {
            System.out.println("Ganaste, la suma de los dados es " + sumarDados);
            System.out.println("Ganaste " + ganancia + " euros.");
        } else {
            System.out.println("Perdiste, la suma de los dados es " + sumarDados);
        }
    }
}

public class Dados {

    public int sumarDados(int dado1, int dado2) {
        int sumaDado = dado1 + dado2;
        System.out.println("La suma de los dados es: " + sumaDado);
        return sumaDado;
    }

    public int[] apuestaUsuario() {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué número deseas apostar? ");
        int[] apuesta = new int[2];
        int numusuario = input.nextInt();

        System.out.println("¿Qué cantidad deseas apostar? ");
        int cantusuario = input.nextInt();

        apuesta[0] = numusuario;
        apuesta[1] = cantusuario;

        System.out.println("Se ha apostado al número " + apuesta[0]);
        System.out.println("Se ha apostado la cantidad de " + apuesta[1]);

        return apuesta;
    }
}
