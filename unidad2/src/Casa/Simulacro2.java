package Casa;

import java.util.Scanner;

public class Simulacro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres introducir?");
        int total = input.nextInt();
        int[] num = new int[total];
        int[] mayor = new int[total]; 
        int contador = 0; 

       
        for (int i = 0; i < total; i++) {
            System.out.println("Introduzca un número:");
            num[i] = input.nextInt();
        }

        
        for (int i = 3; i < num.length; i++) {
            if (num[i] > num[i - 1] && num[i] > num[i - 2] && num[i] > num[i - 3]) {
                mayor[contador] = num[i]; 
                contador++;
            }
        }

        
        System.out.print("Hay " + contador + " números mayores que sus 3 anteriores: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(mayor[i]);
            if (i < contador - 1) {
                System.out.print(", ");
            }
        }
    }
}
