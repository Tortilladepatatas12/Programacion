package boletin8;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] provinciasRegion = {10, 4, 6, 1};
        int region;
        
        System.out.println("Introduce el número de la región (1, 2, 3 o 4): ");
        region = input.nextInt();
        
        if (region < 1 || region > 4) {
            System.out.println("Número de región incorrecto.");
            return;
        }
        
        int provincias = provinciasRegion[region - 1];
        
        int totalVotosA = 0, totalVotosB = 0, totalAbstenciones = 0;
        int votosTotales = 0;
        
        String provinciaA = "", provinciaB = "";
        int maxVotosA = -1, maxVotosB = -1;
        
        boolean altaAbstencion = false;
        
        input.nextLine();
        
        for (int i = 1; i <= provincias; i++) {
            System.out.println("\nIntroduce los datos de la provincia " + i + ":");
            
            System.out.print("Nombre de la provincia: ");
            String nombreProvincia = input.nextLine();
            
            System.out.print("Votos partido A: ");
            int votosA = input.nextInt();
            
            System.out.print("Votos partido B: ");
            int votosB = input.nextInt();
            
            System.out.print("Abstenciones: ");
            int abstenciones = input.nextInt();
            
            input.nextLine();
            
            totalVotosA += votosA;
            totalVotosB += votosB;
            totalAbstenciones += abstenciones;
            votosTotales += votosA + votosB + abstenciones;
            
            if (abstenciones > 100000) {
                altaAbstencion = true;
            }
            
            if (votosA > maxVotosA) {
                maxVotosA = votosA;
                provinciaA = nombreProvincia;
            }
            
            if (votosB > maxVotosB) {
                maxVotosB = votosB;
                provinciaB = nombreProvincia;
            }
        }
        
        System.out.println("\nResultados de la región " + region + ":");
        
        double porcentajeVotosA = (double) totalVotosA / votosTotales * 100;
        double porcentajeVotosB = (double) totalVotosB / votosTotales * 100;
        double porcentajeAbstencion = (double) totalAbstenciones / votosTotales * 100;
        
        System.out.println("Porcentaje de votos para el partido A: " + porcentajeVotosA + "%");
        System.out.println("Porcentaje de votos para el partido B: " + porcentajeVotosB + "%");
        System.out.println("Porcentaje de abstenciones: " + porcentajeAbstencion + "%");
        
        System.out.println("\nProvincia con más votos para el partido A: " + provinciaA);
        System.out.println("Provincia con más votos para el partido B: " + provinciaB);
        
        if (altaAbstencion) {
            System.out.println("¡Alta abstención en alguna provincia!");
        }
    }
}
