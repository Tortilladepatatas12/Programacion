package paquete2;


public class Animal {

	String tipo;
	public String nombre;
	private int edad;
	
	public boolean caminar() {
		
		return true;
		
	}
	
	private void comer() {
		
		System.out.println("Estoy comiendo ");
	}
	
	public void darDeComer()
	{
		if (tipo.equals("perro")) {
			comer();
			
		}
		else {System.out.println("No se le da de comer");
		}
	}
	
	boolean sonDelMismoTipo(Animal a1) {
		
		boolean son = false;
		son = tipo.equals(a1.tipo);
		return son;
	}
	
}
