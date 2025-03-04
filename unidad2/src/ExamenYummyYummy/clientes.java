package ExamenYummyYummy;

public class clientes {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private Menus tipodieta;
	private String vip;

	
	
	public boolean Vip(){
		
		if(vip=="vip") {
			System.out.println("El usuario es vip ");
			return true;
		}
		else {
			System.out.println("El usuario no es vip ");
			return false;
		}
		
	}

	public void hayQUeHacerPromocion() {
		
		if (vip=="vip "|| edad > 65) {
			System.out.println("hay que hacerle promocion ");
		}
		else {System.out.println("No hay que hacerle promocion");}
	}
	
	
	
}

