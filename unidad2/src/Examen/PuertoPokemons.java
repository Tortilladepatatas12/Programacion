package Examen;

import java.util.Scanner;

import Casa.Ejercicio1;

public class PuertoPokemons {

	public static void main(String[] args) {
		 PuertoPokemons p = new PuertoPokemons();
		 Scanner input = new Scanner (System.in);
		 int opcion = p.menu(input);
		 
		 int numPokemon = 0;
		 int nivelMedio = 0;
		 int numBatallas = 0;
		 int respuesta = opcion;
		 int nivel = 0;
		 //menu(input);
	}
	//Todo esto dentro de menu();	
		//1-capturarPokemon();
		//-nombrePokemon
		//-nivelInicial
		
		//2-realizarBatalla();
		//-posicionPokemon
		//-posicionAleatoria
		//si pokemonUsuario > pokemonMaquina entonces pokemonUsuario gana y sube de nivel
		//si nivelPokemonUsuario == nivelPokemonMaquina entonces empate
		//si nivelPokemonMaquina > nivelPokemonUsuario entonces pokemonUsuario pierde
		
		//3-mostrarPokedex(); Lista los pokemons del entrenador
		
		//4-finalizar(); Muestra un mensaje y termina el programa.

		
		
		
      
		 /*while (!opcion.equals(4)) {
			opcion = p.menu(input);   
            switch (opcion) {
            case 1:
                //capturarPokemon();
                break;
            case 2:
                //realizarBatalla();
                break;
            case 3:
                //mostrarPokedex();
                break;
            case 4:
                P.finalizar();
                break;
            default:
            	System.out.println("El programa ha finalizado con exito.");
            }
		*/
		
	
	String capturarPokemon(Scanner input) {
	//TODO int nivelPokemon
	
	 String pokemonCapturado = "";
	 System.out.println("¿Que pokemon quieres capturar? ");
	 String pokemonCapturadoUsuario = input.next();
		return pokemonCapturadoUsuario;
	}
	
		 int menu(Scanner input){
		        System.out.println("1- Capturar pokemon");
		        System.out.println("2- Realizar Batalla");
		        System.out.println("3- Mostrar Pokedex ");
		        System.out.println("4- Salir");

		        int respuestaUsuario = input.nextInt();
		        return respuestaUsuario;
		        
		}
		 
		 int[] posicionPokemon(int opcion, Scanner input){
			 
			 int posicionPokemonsUsuario = 0;
			 System.out.println("¿En qué posición quieres poner el pokemon 1? ");
			 int posicion = input.nextInt();
			 int [] tablaposicionPokemonUsuario = new int [posicion];
			 //TODO bucle for que pase por todos los pokemons del usuario y le pregunte que posicion deseea usar.
			 return tablaposicionPokemonUsuario;
			 
		 }
		 
		   String finalizar(int numPokemon, int nivelMedio,int numBatallas) {
			  System.out.println("Tu equipo tiene " + numPokemon + "pokemons " + "su nivel medio es " + nivelMedio + "Han realizado " + numBatallas + "batallas hasta ahora.");
			  return "" ;
		}
		
		 /*int calculaBatalla(int nivel, int nivelPokemonUsuario, int nivelPokemonMaquina) {
			 
			 if nivelPokemonUsuario > nivelPokemonMaquina{
				 System.out.println("Tu pokemon ha ganado y ha subido un nivel");
				 int nivelPokemonUsuario = nivelPokemonUsuario +1;
				 else {
					 System.out.println("Tu pokemon ha perdido y el de la maquina ha subido un nivel");
					 int nivelPokemonMaquina = nivelPokemonMaquina +1;
				 }
				 */
			 
			 
		 }

