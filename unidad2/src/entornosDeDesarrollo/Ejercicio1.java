package entornosDeDesarrollo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        System.out.println("Introuduce 8 dígitos para poder completar el DNI");
        int dni = input.nextInt();
        
        char letra = letras [dni % 23];
        System.out.println("La letra del DNI es la siguiente: "+ letra);
    }
}