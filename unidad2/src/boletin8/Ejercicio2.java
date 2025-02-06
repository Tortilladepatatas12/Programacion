package boletin8;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número de árboles: ");
        int numArboles = input.nextInt();

        int sumaAlturas = 0, alturaMaxima = 0;
        int alturaMinima = Integer.MAX_VALUE; 
        int diametroMaximo = 0;
        int diametroMinimo = Integer.MAX_VALUE;
        int sumaEdadesTipoB = 0;
        int contadorEdadesTipoB = 0;
        boolean existeArbolMasDe30M = false;

        for (int i = 1; i <= numArboles; i++) {
            System.out.println("Árbol " + i + ":");

            System.out.print("Tipo del árbol (A o B): ");
            char tipo = input.next().toUpperCase().charAt(0);

            System.out.print("Diámetro del tronco en cm: ");
            int diametro = input.nextInt();
            System.out.print("Altura en metros: ");
            int altura = input.nextInt();

            sumaAlturas += altura;
            if (altura > alturaMaxima) alturaMaxima = altura;
            if (altura < alturaMinima) alturaMinima = altura;
            if (diametro > diametroMaximo) diametroMaximo = diametro;
            if (diametro < diametroMinimo) diametroMinimo = diametro;

            if (tipo == 'B') {
                System.out.print("Edad del árbol en años: ");
                int edad = input.nextInt();
                sumaEdadesTipoB += edad;
                contadorEdadesTipoB++;
            }

            if (altura > 30) existeArbolMasDe30M = true;
        }

        System.out.println("Resultados: ");
        System.out.println("Media de las alturas: " + (sumaAlturas / (double) numArboles));
        System.out.println("Altura máxima: " + alturaMaxima);
        System.out.println("Altura mínima: " + alturaMinima);
        System.out.println("Diámetro máximo: " + diametroMaximo);
        System.out.println("Diámetro mínimo: " + diametroMinimo);
        if (contadorEdadesTipoB > 0) {
        	
            System.out.println("Media de las edades de tipo B: " + (sumaEdadesTipoB / (double) contadorEdadesTipoB));
        }
        if (existeArbolMasDe30M) {
        	
            System.out.println("Existen árboles de más de 30 m.");
        }
    }
}