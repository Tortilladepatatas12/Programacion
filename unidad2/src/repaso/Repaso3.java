package repaso;

import java.util.Scanner;

public class Repaso3 {
    public static void main(String[] args) {
        Repaso3 r = new Repaso3();
        String[] palabra = r.cargaTabla();
        r.imprimeTabla(palabra);
        String[] numero = r.filtraNumeros(palabra);
        System.out.println(r.isCadenaNumero("1234"));
        System.out.println(r.isCadenaNumero("1A34"));
        System.out.println("Termino");
    }

    String[] cargaTabla() {
        System.out.println("Introduce una frase: ");
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        String[] tabla = frase.split(" ");
        return tabla;
    }

    void imprimeTabla(String[] tabla) {
        for (String elemento : tabla) {
            System.out.println(elemento);
        }
    }

    String[] filtraNumeros(String[] tabla) {
        String[] numeros = new String[tabla.length];
        int count = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (isCadenaNumero(tabla[i])) {
                numeros[count++] = tabla[i];
            }
        }
        return java.util.Arrays.copyOfRange(numeros, 0, count); // Elimina espacios vacíos
    }

    boolean isCadenaNumero(String palabra) {
        boolean es = true;
        for (int i = 0; i < palabra.length(); i++) {
            if (!Character.isDigit(palabra.charAt(i))) {
                es = false;
                break;
            }
        }
        return es;
    }

    boolean isMinuscula(String palabra) {
        boolean isMin = false;
        if (Character.isLowerCase(palabra.charAt(0))) {
            isMin = true;
        }
        return isMin;
    }

    String realizaConversion(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return palabra;
        }
        // Convierto el primer carácter a mayúsculas
        palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
        // Si es una 'o' la cambio por 0
        palabra = palabra.replace('o', '0').replace('O', '0');
        // Cambio el último carácter por la longitud de la palabra
        return palabra.substring(0, palabra.length() - 1) + palabra.length();
    }

    boolean comparaTablas(int[] tabla1, int[] tabla2) {
        boolean iguales = true;
        if (tabla1.length != tabla2.length) {
            iguales = false;
        } else {
            for (int i = 0; i < tabla1.length; i++) {
                if (tabla1[i] != tabla2[i]) {
                    iguales = false;
                    break;
                }
            }
        }
        return iguales;
    }

    // Clase estática Conversion para realizar la conversión
    public static class Conversion {

        public static String[] convierteTabla(String[] palabras) {
            for (int i = 0; i < palabras.length; i++) {
                palabras[i] = realizaConversion(palabras[i]);
            }
            return palabras;
        }

        public static String realizaConversion(String palabra) {
            if (palabra == null || palabra.isEmpty()) return palabra;

            // Mayúscula al inicio
            palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
            // Cambia 'o' y 'O' por '0'
            palabra = palabra.replace('o', '0').replace('O', '0');
            // Último carácter -> longitud
            return palabra.substring(0, palabra.length() - 1) + palabra.length();
        }

        public static void main(String[] args) {
            String[] palabras = {"hola", "mundo", "codigo"};
            for (String palabra : convierteTabla(palabras)) {
                System.out.println(palabra);
            }
        }
    }
}

