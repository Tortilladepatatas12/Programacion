package boletin8;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alumnosA = 2, alumnosB = 2, alumnosC =2, alumnosD = 2;
        int numAlumnos = 0;
        String grupo;

        System.out.print("Introduce el grupo (A, B, C, D): ");
        grupo = input.nextLine().toUpperCase();
        
        switch (grupo) {
            case "A":
                numAlumnos = alumnosA;
                break;
            case "B":
                numAlumnos = alumnosB;
                break;
            case "C":
                numAlumnos = alumnosC;
                break;
            case "D":
                numAlumnos = alumnosD;
                break;
            default:
                System.out.println("Grupo no válido ");
                return;
        }

        String nombreMaximo = "";
        double notaMediaMaxima = 0;
        int alumnosSuspensos = 0;
        boolean sobresaliente = false;

        for (int i = 1; i <= numAlumnos; i++) {
            System.out.println("Alumno " + i + ":");

            System.out.print("Introduce el nombre del alumno: ");
            String nombre = input.nextLine();

            System.out.print("Introduce la nota del primer parcial: ");
            double primerParcial = input.nextDouble();

            System.out.print("Introduce la nota del segundo parcial: ");
            double segundoParcial = input.nextDouble();

            System.out.print("Introduce la nota del tercer parcial: ");
            double tercerParcial = input.nextDouble();

            input.nextLine(); 

            double notaMedia = (primerParcial + segundoParcial + tercerParcial) / 3;

            if (notaMedia > notaMediaMaxima) {
                nombreMaximo = nombre;
                notaMediaMaxima = notaMedia;
            }

            if (notaMedia < 5) {
                alumnosSuspensos++;
            }

            if (primerParcial >= 9 || segundoParcial >= 9 || tercerParcial >= 9) {
                sobresaliente = true;
            }
        }

        System.out.println("Alumno con mayor nota media: " + nombreMaximo);
        System.out.println("Número de alumnos con nota media suspensa: " + alumnosSuspensos);
        if (sobresaliente) {
            System.out.println("Existen sobresalientes ");
        }
    }
}