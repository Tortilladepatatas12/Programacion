package Casa;

	package Simulacro2;

	import java.util.Scanner;

	public class a {

	    public static void main(String[] args) {
	        Scanner input = new Scanner (System.in);
	        Ejercicio1 f = new Ejercicio1();
	        //String respuestaUsuario = "";
	        //String nombreAutor = "";
	        //String Sexo;
	        //String tituloLibro = "";
	        //double PrecioLibro = 0;
	        //int unidadesVendidas = 0;
	        
	        String opcion = f.menu(input);
	        
	        while (!opcion.equals("S")) {
	            
	            opcion = f.menu(input);
	            
	            switch (opcion) {
	            case "R":
	                //f.registroDeLibros();
	                break;
	            case "%":
	                //porcentajesexo ();
	                break;
	            case "P":
	                //baratoycaro ();
	                break;
	            case "V":
	                //libroMasVendido ();
	                break;
	            case "S":
	                System.out.println("El programa ha finalizado con exito.");
	                break;
	            default:
	                System.out.println("La opcion que has seleccionado no es válida. Intentalo de nuevo.");
	            }
	        }
	    }
	    
	    String menu(Scanner input){
	        System.out.println("R - Registrar Libros");
	        System.out.println("% - Mostrar % libros por sexo del autor");
	        System.out.println("P - Mostrar libro más barato y más caro");
	        System.out.println("V - Mostrar libro más vendido");
	        System.out.println("S - Salir.");

	        String respuestaUsuario = input.next();
	        respuestaUsuario = respuestaUsuario.toUpperCase();
	        return respuestaUsuario;
	        
	        
	        
	    }

	    //int registroDeLibros(Scanner input) {
	    	
	   // }
	    
	    int NumeroDeLibros(Scanner input) {
	    	System.out.println("¿Cuántos libros quieres añadir? ");
	    	int numLibros = input.nextInt();
	    	return numLibros;
	    }
	    String nombreAutor(Scanner input) {
	    	System.out.println("Dime el nombre del autor ");
	    	String nomAutor = input.next();
	    	return nomAutor;
	    	
	    }
	    
	    String sexoAutor(Scanner input) {
	    	System.out.println("Dime el sexo del autor H/M/O ");
	    	String sexo = input.next();
	    	return sexo;
	    	
	    }
	    
	    String tituloLibro(Scanner input) {
	    	System.out.println("Dame el titulo del libro ");
	    	String titulo = input.next();
	    	return titulo;
	    	
	    }
	    
	    double precioLibro(Scanner input) {
	    	System.out.println("Dame el precio del libro ");
	    	double precio = input.nextDouble();
	    	return precio;
	    	
	    }
	    
	    int unidadesVendidas(Scanner input) {
	    	System.out.println("¿Cuántas unidades se han vendido? ");
	    	int unidades = input.nextInt();
	    	return unidades;
	    	
	    }
	    
	    }

