package orientacionAobjetos;

public class Producto {
	String nombre;
	int numunidades;
	double precioventa;
	
	
	
	boolean pedirstock() {
		boolean pedido =false;
		if( numunidades >1) {
			pedido = false;
		} else {
			pedido = true;
		}
		
		
		return pedido;
	}
	
	int aumentounidades(int aumento) {
		
		int unidaumentada = numunidades+aumento;
		
		return unidaumentada;
	}
	
	String convierteACadena() {
		String cadena = "Producto: "+nombre +" "+numunidades+" " +precioventa;
		return cadena;
		}
	
}
