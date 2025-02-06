package paquete2;

import java.util.Scanner;

public class Cubo {

	int lado;
	float litroscontiene;
	float capacidadMax;
	
float calculaArea(){
	
	float area = lado * lado;
	
	return area;
	
}

float calculaVolumen(){
	
	float volumen = lado * lado * lado;
	return volumen;
}
	
boolean vaciar () {
	
	boolean vacio = true;
	
	System.out.println("¿Cuántos litros quieres sacar?");
	Scanner input = new Scanner (System.in);
	int litrosAsacar = input.nextInt();
	if (litroscontiene <=0) {
		System.out.println("No puedes porque no queda agua ");
		vacio = false;
	}
	else if (litrosAsacar > litroscontiene) {
		System.out.println("No puedes sacar mas litros de los que hay ");
		vacio = false;

	}
	else {
		
		litroscontiene = litroscontiene - litrosAsacar;
		System.out.println("Quedan " + litroscontiene);
	}
	return vacio;
}

boolean rellenar (float litrosAMeter) {
	
	
	
	return false;
}
	
}
