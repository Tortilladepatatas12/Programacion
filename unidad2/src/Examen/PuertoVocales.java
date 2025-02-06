package Examen;

import java.util.Scanner;

public class PuertoVocales {
    public static void main(String[] args) {
    	//Planteamiento:
    	//El usuario tiene que ingresar palabras
    	//El programa tiene que identificar las palabras que tiene 3 vocales consecutivas y contar cuentas hay
    	//TODO un for que recorra todos los elementos de la tabla palabras, dentro de ese for hacer un if que verifique si hay 3 vocales consecutivas
    	//en el caso de que haya 3 vocales consecutivas se sumará +1 a contador.
        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        int total = input.nextInt();
        String [] palabra = new String[total];
       
        for (int i = 0; i < total; i++) {
            System.out.println("Introduzca una palabra:");
            palabra[i] = input.next();
        }


        
        System.out.print("Hay " + contador + " palabras mayores que sus 3 anteriores: ");
        for (int i = 0; i < contador; i++) {
            //System.out.print(mayor[i]);
            if (i < contador - 1) {
                System.out.print(", ");
            }
        }
    }


	
	String [] vocales(){
		String [] vocales1 = new String[5];
        vocales1 [1] = "a";
        vocales1 [2] = "e";
        vocales1 [3] = "i";
        vocales1 [4] = "o";
        vocales1 [5] = "u";
        
        return vocales1;
	}
	
	//String []palabrasUsuario(Scanner input, int total,String Palabra){
		//System.out.println("¿Cuántas palabras quieres introducir? ");
      
        //for (int i = 0; i < total; i++) {
           // System.out.println("Introduzca una palabra:");
            //palabra[i] = input.next();
    		//return palabra;

        //}
		
	}
	
//}
	/*
	public static void main(String[] args) {
		//palabrasUsuario(input);
		Scanner input = new Scanner(System.in);
		

	}

	String palabrasUsuario(Scanner input) {
		System.out.println("¿Cuántas palabras quieres añadir? ");
		int cantidadPalabras = input.nextInt();
		String [] tablaPalabrasUsuario = new String [cantidadPalabras]; 
		
		
		
		
		return "";
	}
	
}
*/